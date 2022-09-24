package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.Empresa;

import java.util.List;

public interface InterfaceEmpresaService {

    //Metodo para ver lista de Enterprise
    public List<Empresa> getEnterprise();


    //Metodo que nos trae un Enterprise
    public Empresa getOnlyOneEnterprise(Long idEnterprise) throws Exception;


    //Metodo que nos cree una Enterprise
    public String getCreateEnterprise(Empresa enterpriseIn);


    //Metodo que nos permita actualizar una enterprise
    public Empresa getUpdateEnterprise(Empresa enterpriseIn) throws Exception;

    //Metodo que elimina una enterprise
    public String getDeleteEnterprise(Long idEnterprise) throws Exception;
}
