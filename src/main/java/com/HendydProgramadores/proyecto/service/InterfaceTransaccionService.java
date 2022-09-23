package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.Transaccion;

import java.util.List;

public interface InterfaceTransaccionService {

    //Metodo para ver todas las Transacciones
    public List<Transaccion> getTransaction();

    //Metodo que muestra una Transaccion
    public Transaccion getOnlyOneTransaction(Long idTransaction) throws Exception;

    //Metodo que crea una Transaccion
    public String getCreateTransaction(Transaccion TransactionIn);

    //Metodo que actualiza una Transaccion
    public Transaccion getUpdateTransaction(Transaccion TransactionIn) throws Exception;

    //Metodo que elimina una Transaccion
    public String getDeleteTransaction(Long idTransaction) throws Exception;
}
