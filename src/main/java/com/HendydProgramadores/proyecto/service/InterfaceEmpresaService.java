package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.Empresa;

import java.util.List;

public interface InterfaceEmpresaService {

    //Metodo que nos muestra todas las empresas
    public List<Empresa> getEnterprise();


    //Metodo que consulta una empresa
    public Empresa getOnlyOneEnterprise(Long idEnterprise) throws Exception;


    //Metodo que crea una empresa
    public String getCreateEnterprise(Empresa enterpriseIn);


    //Metodo que actualiza una empresa
    public Empresa getUpdateEnterprise(Empresa enterpriseIn) throws Exception;

    //Metodo que elimina una empresa
    public String getDeleteEnterprise(Long idEnterprise) throws Exception;
}
