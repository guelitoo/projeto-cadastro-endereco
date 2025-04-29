package com.senai.cadastroendereco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.cadastroendereco.entities.Pessoa;

public interface PessoaRepository extends JpaRepository <Pessoa, Long>{

	// Busca a pessoa pelo email
	Pessoa findByEmail(String email);
}
