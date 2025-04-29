package com.senai.cadastroendereco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.cadastroendereco.entities.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
	
}
