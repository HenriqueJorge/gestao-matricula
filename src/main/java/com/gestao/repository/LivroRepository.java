package com.gestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestao.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
