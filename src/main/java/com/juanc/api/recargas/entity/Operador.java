package com.juanc.api.recargas.entity;
import lombok.Data;
import jakarta.persistence.*;

@Entity
@Table(name = "operadores")
@Data
public class Operador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    public Operador() {
    }

    public Operador(String nombre) {
        this.nombre = nombre;
    }

}
