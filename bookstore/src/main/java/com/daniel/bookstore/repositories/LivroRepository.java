package com.daniel.bookstore.repositories;

import com.daniel.bookstore.entity.Livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
