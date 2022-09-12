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

    public List<Empresa> listEmpresas(){
        return respository.findAll();
    }

    public void addEmpresa(Empresa empresa){
        respository.save(empresa);
    }

    public Empresa getEmpresaById(int id){
        return (Empresa) respository.findById(id).get();
    }

    public void deleteEmpresa(int id){
        respository.deleteById(id);
    }
}
