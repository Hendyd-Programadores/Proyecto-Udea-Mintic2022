package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnterpriseService {
    @Autowired
    EnterpriseRepository enterpriseRespository;

    //GET
    public List<Empresa> listEmpresas(){
        //return enterpriseRespository.findAll();
        return new ArrayList<Empresa>(enterpriseRespository.findAll());
    }
    public Empresa getEmpresaById(Long id){
        return (Empresa) enterpriseRespository.findById(id).get();
    }

    //POST y PUT
    public void addEmpresa(Empresa empresa){
        enterpriseRespository.save(empresa);
    }
/*
    //PATCH
    public void editEmpresa(Long id, Empresa empresa){
        Empresa empresaAuxiliar = new Empresa();
        empresaAuxiliar.setNombre(empresa.getNombre());
        empresaAuxiliar.setNit(empresaAuxiliar.getNit());
        empresaAuxiliar.setTelefono(empresaAuxiliar.getTelefono());
        empresaAuxiliar.setDireccion(empresaAuxiliar.getDireccion());
        enterpriseRespository.save(empresaAuxiliar);
    }

 */

    //DELETE
    public void deleteEmpresa(Long id){
        enterpriseRespository.deleteById(id);
        //return true;
    }
}
