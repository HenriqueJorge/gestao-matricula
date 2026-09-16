package com.gestao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestao.model.Livro;
import com.gestao.repository.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	public List<Livro> obterTodos(){
		return livroRepository.findAll();
	}
	
	public Livro obterUm(Integer id) {
		return livroRepository.findById(id).get();
	}
	
	public Livro adicionar(Livro novo) {
		return livroRepository.save(novo);
	}
	
	public void deleta(Integer id) {
		livroRepository.deleteById(id);
	}
}
