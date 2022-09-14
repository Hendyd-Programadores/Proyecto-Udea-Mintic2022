package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EnterpriseService {
    @Autowired
    private EnterpriseRepository respository;

    //GET
    public List<Empresa> listEmpresas(){
        return respository.findAll();
    }
    public Empresa getEmpresaById(Long id){
        return (Empresa) respository.findById(id).get();
    }

    //POST
    public void addEmpresa(Empresa empresa){
        respository.save(empresa);
    }

    //PATCH
    public void editEmpresa(Long id, Empresa empresa){
        Empresa empresaAuxiliar = new Empresa();
        empresaAuxiliar.setNombre(empresaAuxiliar.getNombre());
        empresaAuxiliar.setNit(empresaAuxiliar.getNit());
        empresaAuxiliar.setTelefono(empresaAuxiliar.getTelefono());
        empresaAuxiliar.setDireccion(empresaAuxiliar.getDireccion());
        respository.save(empresaAuxiliar);
    }

    //DELETE
    public boolean deleteEmpresa(Long id){
        respository.deleteById(id);
        return true;
    }
}
