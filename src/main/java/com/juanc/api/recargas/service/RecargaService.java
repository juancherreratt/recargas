package com.juanc.api.recargas.service;

import com.juanc.api.recargas.entity.Recarga;
import com.juanc.api.recargas.repository.RecargaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecargaService {

    @Autowired
    RecargaRepository recargaRepository;

    public List<Recarga> getRecargas(){
        return recargaRepository.findAll();
    }

    public Optional<Recarga> getRecarga(Long id){
        return recargaRepository.findById(id);
    }

    public Recarga save(Recarga recarga){
        return recargaRepository.save(recarga);
    }

    public List<Recarga> findByOperadorId(Long operadorId) {
        return recargaRepository.findByOperadorId(operadorId);
    }

}
