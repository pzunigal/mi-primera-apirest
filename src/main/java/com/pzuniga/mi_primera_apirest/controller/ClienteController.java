package com.pzuniga.mi_primera_apirest.controller;

import com.pzuniga.mi_primera_apirest.model.entity.Cliente;
import com.pzuniga.mi_primera_apirest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //Le indicamos que esto es un Controlador
@RequestMapping("/api/v1") //Este controlador va a ser utilizado como recurso
public class ClienteController {

    @Autowired //Inyeccion de dependencia a mi servicio
    private ICliente clienteService;

    @PostMapping("cliente")
    public Cliente create(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PutMapping("cliente")
    public Cliente update(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @DeleteMapping("cliente/{id}")
    public void delete(@PathVariable Integer id){
        Cliente clienteDelete = clienteService.findById(id);
        clienteService.delete(clienteDelete);
    }

    @GetMapping("cliente/{id}")
    public Cliente showById(@PathVariable Integer id){
        return clienteService.findById(id);
    }
}
