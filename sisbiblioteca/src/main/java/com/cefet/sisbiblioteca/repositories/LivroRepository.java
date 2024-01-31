package com.cefet.sisbiblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cefet.sisbiblioteca.entities.Livro;

public interface LivroRepository extends JpaRepository <Livro, Long> {

}
