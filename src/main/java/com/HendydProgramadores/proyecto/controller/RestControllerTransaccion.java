package com.HendydProgramadores.proyecto.controller;

import com.HendydProgramadores.proyecto.model.ObjetAnswer;
import com.HendydProgramadores.proyecto.model.Transaccion;
import com.HendydProgramadores.proyecto.service.InterfaceTransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControllerTransaccion {

    //Hacemos la inyeccion del objeto de tipo ServiceInterfaceTransaction
    @Autowired
    InterfaceTransaccionService interfaceTransaccionService;

    //Creamos los Mapping

    //Mapping para listar Transaction
    @GetMapping("/ListTransaction")
    public ResponseEntity<List<Transaccion>> getTransaction(){
        return new ResponseEntity<>(interfaceTransaccionService.getTransaction(), HttpStatus.ACCEPTED);
    }

    //Mapping para traer una sola Transaction
    @GetMapping("/OneTransaction/{idTransaction}")
    public ResponseEntity<Object> getTransactionPath(@PathVariable Long idTransaction){
        try {
            Transaccion TransactionX = interfaceTransaccionService.getOnlyOneTransaction(idTransaction);
            return new ResponseEntity<>(TransactionX,HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Mapping para crear una Transaction
    @PostMapping("/CreateTransaction")
    public ResponseEntity<String> PostCreateTransaction(@RequestBody Transaccion TransactionX){
        try {
            String message =interfaceTransaccionService.getCreateTransaction(TransactionX);
            return new ResponseEntity<>(message,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Mapping para actualizar una Transaction
    @PutMapping("/UpdateTransaction")
    public ResponseEntity<ObjetAnswer> putUpdateTransaction(@RequestBody Transaccion TransactionX){
        try {
            Transaccion TransactionBD = interfaceTransaccionService.getUpdateTransaction(TransactionX);
            return new ResponseEntity<>(new ObjetAnswer("Atualizacion de Transaction Exitosa",TransactionBD),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ObjetAnswer(e.getMessage(),null),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Mapping para eliminar una Transaction
    @DeleteMapping("/DeleteTransaction/{idTransaction}")
    public ResponseEntity<String> DeleteTransaction(@PathVariable Long idTransaction){
        try {
            String message = interfaceTransaccionService.getDeleteTransaction(idTransaction);
            return new ResponseEntity<>(message,HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
