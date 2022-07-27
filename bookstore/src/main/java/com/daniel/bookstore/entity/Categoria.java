package com.daniel.bookstore.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Categoria {

	private Long id;
	private String nome;
	private String descricao;
	
	private List<Livro> livros = new ArrayList<>();
}
