package com.senai.cadastroendereco.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.cadastroendereco.entities.Endereco;
import com.senai.cadastroendereco.service.EnderecoService;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    // Endpoint para salvar um novo endereço
    @PostMapping
    public Endereco salvarEndereco(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }

    // Endpoint para listar todos os endereços
    @GetMapping
    public List<Endereco> listarEnderecos() {
        return enderecoService.listarTodos();
    }

    // Endpoint para buscar um endereço específico por ID
    @GetMapping("/{id}")
    public Endereco buscarEnderecoPorId(@PathVariable Long id) {
        return enderecoService.buscarPorId(id).orElse(null);
    }

    // Endpoint para deletar um endereço por ID
    @DeleteMapping("/{id}")
    public void deletarEndereco(@PathVariable Long id) {
        enderecoService.deletarPorId(id);
    }
}