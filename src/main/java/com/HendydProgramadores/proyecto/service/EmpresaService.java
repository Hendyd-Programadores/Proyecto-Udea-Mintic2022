package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService implements InterfaceEmpresaService{

    Date Today = new Date();

    //Inyectamos un Objeto de tipo EnterpriseRepository
    @Autowired
    EnterpriseRepository enterpriseRepository;

    //GET
    @Override
    public List<Empresa> getEnterprise() {
        return enterpriseRepository.findAll();
    }

    //GET
    @Override
    public Empresa getOnlyOneEnterprise(Long idEnterprise) throws Exception {
        Optional<Empresa> EnterpriseBD = enterpriseRepository.findById(idEnterprise);
        if(EnterpriseBD.isPresent()){
            return EnterpriseBD.get();
        }
        throw new Exception("Id  No Existe");
    }

    //POST
    @Override
    public String getCreateEnterprise(Empresa enterpriseIn) {
        //Preguntamos si ya hay alguna enterprise ya registrada con ese Id.
        Optional<Empresa> EnterpriseBD = enterpriseRepository.findById(enterpriseIn.getIdEmpresa());
        if(!EnterpriseBD.isPresent()){
            enterpriseRepository.save(enterpriseIn);
            return "Empresa Creada con exito";
        }
        return ("Id Ya Existe");
    }


    // PUT
    @Override
    public Empresa getUpdateEnterprise(Empresa enterpriseIn) throws Exception {
        //LLamamos a la enterprise a actualizar de la BD
        Empresa enterpriseBD = getOnlyOneEnterprise(enterpriseIn.getIdEmpresa());

        //Actualizamos atributos
        if(enterpriseIn.getNombre()!=null && !enterpriseIn.getNombre().equals("")){
            enterpriseBD.setNombre(enterpriseIn.getNombre());
        }

        if(enterpriseIn.getNit()!=null && !enterpriseIn.getNit().equals("")){
            enterpriseBD.setNit(enterpriseIn.getNit());
        }

        if(enterpriseIn.getDireccion()!=null && !enterpriseIn.getDireccion().equals("")){
            enterpriseBD.setDireccion(enterpriseIn.getDireccion());
        }

        if(enterpriseIn.getTelefono()!=null && !enterpriseIn.getTelefono().equals("")){
            enterpriseBD.setTelefono(enterpriseIn.getTelefono());
        }

        enterpriseBD.setUpdateAt(Today);

        return enterpriseRepository.save(enterpriseBD);
    }

    //DELETE
    @Override
    public String getDeleteEnterprise(Long idEnterprise) throws Exception {
        Optional<Empresa> enterpriseBD = enterpriseRepository.findById(idEnterprise);
        if(enterpriseBD.isPresent()){
            enterpriseRepository.deleteById(idEnterprise);
            return "Empresa Eliminada con exito";
        }
        throw new Exception("Enterprise No Existe");
    }
}
