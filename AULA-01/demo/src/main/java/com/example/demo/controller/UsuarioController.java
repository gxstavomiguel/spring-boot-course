package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("/{id}")
    public String buscarPorId(@PathVariable Long id) {
        return "Usuario com ID: " +id;
    }

    @GetMapping("/buscar")
    public String buscarPorNome(@RequestParam String nome) {
        return "Buscando por usuario por nome:"+nome;
    }

}
