package com.pzuniga.mi_primera_apirest.model.dao;

import com.pzuniga.mi_primera_apirest.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
}
