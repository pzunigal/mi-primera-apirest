package com.pzuniga.mi_primera_apirest.service.impl;

import com.pzuniga.mi_primera_apirest.model.dao.ClienteDao;
import com.pzuniga.mi_primera_apirest.model.entity.Cliente;
import com.pzuniga.mi_primera_apirest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteImpl implements ICliente {

    @Autowired //Inyeccion de dependencia
    /* Nos proporciona control a la hora de querer inyectar nuestras
    dependencias o instancias que se almacenanen en el contexto de Spring */
    private ClienteDao clienteDao;

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
}
