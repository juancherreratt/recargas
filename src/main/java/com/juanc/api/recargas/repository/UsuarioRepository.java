package com.juanc.api.recargas.repository;

import com.juanc.api.recargas.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
