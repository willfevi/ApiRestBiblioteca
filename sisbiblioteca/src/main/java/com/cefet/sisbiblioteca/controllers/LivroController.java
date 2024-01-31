package com.cefet.sisbiblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cefet.sisbiblioteca.entities.Livro;
import com.cefet.sisbiblioteca.repositories.LivroRepository;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {

	@Autowired
	private LivroRepository repository;

	@GetMapping
	public List<Livro> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Livro findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}

	@PostMapping
	public Livro insert(@RequestBody Livro livro) {
		return repository.save(livro);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

	@PutMapping("/")
	public void update(@RequestBody Livro livro) {
		repository.save(livro);
	}
	@DeleteMapping("/deleteAll")
	public void deleteAll() {
	    repository.deleteAll();
	}


}
