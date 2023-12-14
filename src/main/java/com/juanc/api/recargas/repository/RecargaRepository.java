package com.juanc.api.recargas.repository;

import com.juanc.api.recargas.entity.Recarga;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecargaRepository extends JpaRepository<Recarga, Long> {

    List<Recarga> findByOperadorId(Long operadorId);
}
