package com.pzl.cl.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data //Genera getter y setters y todas las weas :O
@AllArgsConstructor //Genera el contructor con todos sus argumentos
@NoArgsConstructor //Genera un constructor vacio
@ToString
@Entity
@Table (name = "clientes")
public class Cliente implements Serializable {
    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "correo")
    private String correo;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;


}
