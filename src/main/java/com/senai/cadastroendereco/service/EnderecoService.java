package com.senai.cadastroendereco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cadastroendereco.entities.Endereco;
import com.senai.cadastroendereco.repositories.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	//Salvar um novo endereço
	public Endereco salvar(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	//Buscar todos os endereços
	public List<Endereco> listarTodos(){
		return enderecoRepository.findAll();
	}
	
	//Buscar um endereço por ID
	public Optional<Endereco> buscarPorId(Long id){
		return enderecoRepository.findById(id);
	}
	
	//Deletar um endereço por ID
	public void deletarPorId(Long id) {
		enderecoRepository.deleteById(id);
	}
	
}