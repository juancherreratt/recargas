package com.juanc.api.recargas.controller;

import com.juanc.api.recargas.entity.Usuario;
import com.juanc.api.recargas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAll(){
        return usuarioService.getUsuarios();
    }

    @GetMapping("/{usuarioId}")
    public Optional<Usuario> getById(@PathVariable("usuarioId") Long usuarioId){
        return usuarioService.getUsuario(usuarioId);
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> save(@RequestBody Usuario usuario){
        Usuario usuarioCreado = usuarioService.save(usuario);
        Map<String, Object> json = new HashMap<>();
        json.put("operador", usuarioCreado);
        json.put("mensaje", "Usuario creado correctamente");

        return ResponseEntity.ok(json);
    }
}
