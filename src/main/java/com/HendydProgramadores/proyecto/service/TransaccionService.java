package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.Transaccion;
import com.HendydProgramadores.proyecto.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class TransaccionService implements InterfaceTransaccionService{

    Date Today = new Date();

    //Inyectamos un Objeto de tipo TransaccionRepository
    @Autowired
    TransaccionRepository transaccionRepository;

    //GET
    @Override
    public List<Transaccion> getTransaction() {
        return transaccionRepository.findAll();
    }

    //GET
    @Override
    public Transaccion getOnlyOneTransaction(Long idTransaction) throws Exception {
        Optional<Transaccion> TransactionBD = transaccionRepository.findById(idTransaction);
        if(TransactionBD.isPresent()){
            return TransactionBD.get();
        }
        throw new Exception("Id no Existe");
    }

    //POST
    @Override
    public String getCreateTransaction(Transaccion TransactionIn) {
        //Preguntamos si ya hay alguna Transaction ya registrada con ese Id.
        Optional<Transaccion> TransactionBD = transaccionRepository.findById(TransactionIn.getIdTransaccion());
        if(!TransactionBD.isPresent()){
            transaccionRepository.save(TransactionIn);
            return "Transaccion Creada con exito";

        }
        return ("Ese Id ya Existe");
    }

    //PATCH
    @Override
    public Transaccion getUpdateTransaction(Transaccion TransactionIn) throws Exception {
        //LLamamos a la Transaction a actualizar de la BD
        Transaccion TransactionBD = getOnlyOneTransaction(TransactionIn.getIdTransaccion());

        //Actualizamos atributos
        if(TransactionIn.getConcepto()!=null && !TransactionIn.getConcepto().equals("")){
            TransactionBD.setConcepto(TransactionIn.getConcepto());
        }

        String amountCast= String.valueOf(TransactionIn.getMonto());
        if(amountCast!=null && !amountCast.equals("")){
            TransactionBD.setMonto(TransactionIn.getMonto());
        }

        TransactionBD.setUpdateAt(Today);

        return transaccionRepository.save(TransactionBD);
    }

    //DELETE
    @Override
    public String getDeleteTransaction(Long idTransaction) throws Exception {
        Optional<Transaccion> TransactionBD = transaccionRepository.findById(idTransaction);
        if(TransactionBD.isPresent()){
            transaccionRepository.deleteById(idTransaction);
            return "Transaccion Eliminada";
        }
        throw new Exception("Transaccion No Existe");
    }
}
