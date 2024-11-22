package com.pzuniga.mi_primera_apirest.service;

import com.pzuniga.mi_primera_apirest.model.entity.Cliente;

public interface ICliente {

    Cliente save(Cliente cliente);
    Cliente findById(Integer id);
    void delete(Cliente cliente);

}
