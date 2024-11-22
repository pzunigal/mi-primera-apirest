package com.pzl.cl.service;

import com.pzl.cl.model.entity.Cliente;

public interface ICliente {

    Cliente save(Cliente cliente);
    Cliente findById(Integer id);
    void delete(Cliente cliente);

}
