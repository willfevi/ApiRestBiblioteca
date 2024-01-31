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

import com.cefet.sisbiblioteca.entities.Genero;
import com.cefet.sisbiblioteca.repositories.GeneroRepository;


@RestController
@RequestMapping(value = "/generos")
public class GeneroController {

	@Autowired
	private GeneroRepository repository;

	@GetMapping
	public List<Genero> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Genero findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}

	@PostMapping
	public Genero insert(@RequestBody Genero genero) {
		return repository.save(genero);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

	@PutMapping("/")
	public void update(@RequestBody Genero genero) {
		repository.save(genero);
	}
	@DeleteMapping("/deleteAll")
	public void deleteAll() {
	    repository.deleteAll();
	}


}

