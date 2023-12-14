package com.juanc.api.recargas.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "recargas")
@Data
public class Recarga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "operador_id", nullable = false)
    private Operador operador;


    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    private String numero;
    private int valor;

    public Recarga() {
    }

    public Recarga(Operador operador, Usuario usuario, String numero, int valor) {
        this.operador = operador;
        this.usuario = usuario;
        this.numero = numero;
        this.valor = valor;
    }
}
