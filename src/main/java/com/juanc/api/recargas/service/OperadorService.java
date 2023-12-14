package com.juanc.api.recargas.service;

import com.juanc.api.recargas.entity.Operador;
import com.juanc.api.recargas.repository.OperadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OperadorService {

    @Autowired
    OperadorRepository operadorRepository;

    public List<Operador> getOperadores(){
        return operadorRepository.findAll();
    }

    public Optional<Operador> getOperador(Long id){
        return operadorRepository.findById(id);
    }

    public Operador save(Operador operador){
        return operadorRepository.save(operador);
    }
}
