package com.juanc.api.recargas.controller;

import com.juanc.api.recargas.entity.Recarga;
import com.juanc.api.recargas.service.RecargaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/recargas")
public class RecargaController {

    @Autowired
    private RecargaService recargaService;

    @GetMapping
    public List<Recarga> getAll(){
        return recargaService.getRecargas();
    }

    @GetMapping("/{recargaId}")
    public Optional<Recarga> getById(@PathVariable("recargaId") Long recargaId){
        return recargaService.getRecarga(recargaId);
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> save(@RequestBody Recarga recarga){
        Recarga recargaCreada = recargaService.save(recarga);
        Map<String, Object> json = new HashMap<>();
        json.put("operador", recargaCreada);
        json.put("mensaje", "Recarga generada correctamente");

        return ResponseEntity.ok(json);
    }

    @GetMapping("/operador/{operadorId}")
    public List<Recarga> findByOperadorId(@PathVariable Long operadorId) {
        return recargaService.findByOperadorId(operadorId);
    }

}
