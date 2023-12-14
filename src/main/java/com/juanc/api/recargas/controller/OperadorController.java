package com.juanc.api.recargas.controller;


import com.juanc.api.recargas.entity.Operador;
import com.juanc.api.recargas.service.OperadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/operadores")
public class OperadorController {

    @Autowired
    private OperadorService operadorService;

    @GetMapping
    public List<Operador> getAll(){
        return operadorService.getOperadores();
    }

    @GetMapping("/{operadorId}")
    public Optional<Operador> getById(@PathVariable("operadorId") Long operadorId){
        return operadorService.getOperador(operadorId);
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> save(@RequestBody Operador operador){
        Operador operadorCreado = operadorService.save(operador);
        Map<String, Object> json = new HashMap<>();
        json.put("operador", operadorCreado);
        json.put("mensaje", "Operador creado correctamente");

        return ResponseEntity.ok(json);
    }

}
