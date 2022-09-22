package com.HendydProgramadores.proyecto.repository;

import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.model.MovimientoDinero;
import org.hibernate.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimientoDineroRepository extends JpaRepository<MovimientoDinero, Long> {
    /*
    //GET
    @Query(value = "select * from Empresa", nativeQuery = true)
    public abstract List<MovimientoDinero> findAll();

    //POST
    public  abstract boolean saveByEnterprise(long id, MovimientoDinero transaccion);
    @Query(value = "insert into transacciones (id,concepto,monto,id_empresa,id_empleado) values (?1,?2,?3,?4,?5)", nativeQuery = true)
    public abstract void querySaveMovimientoDinero(long id, String concepto, float monto, long id_empresa, long id_empleado);

    //PATCH
    public abstract MovimientoDinero patchByEnterprise(long id, MovimientoDinero movimientoDinero);
    @Query(value = "update transacciones set id = ?1,concepto=?2,monto=?3,id_empresa=?4,id_empleado=?5 where id_empresa=?6", nativeQuery = true)
    public abstract void queryPatchTransaction(long id,String concepto,float monto,long id_new_empresa,long id_empleado,long id_empresa );

    //DELETE
    @Query(value = "delete from transacciones where id_empresa=?1",nativeQuery = true)
    public abstract boolean deleteByEnterprise(long id);
    */


}


