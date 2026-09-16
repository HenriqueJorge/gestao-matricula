package com.gestao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestao.model.Livro;
import com.gestao.service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@GetMapping
	public List<Livro> obterTodos(){
		return livroService.obterTodos();
	}
	
	@GetMapping(value = "/{id}")
	public Livro obterUm(@PathVariable Integer id) {
		return livroService.obterUm(id);
	}
	
	@PostMapping
	public Livro adiciona(@RequestBody Livro livro) {
		return livroService.adicionar(livro);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleta(@PathVariable Integer id) {
		livroService.deleta(id);
	}
	
	@GetMapping(value = "/ola")
	public String hello() {
		return "Ola";
	}

}
