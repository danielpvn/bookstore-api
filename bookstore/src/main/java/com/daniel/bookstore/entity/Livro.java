package com.daniel.bookstore.entity;

import lombok.Data;

@Data
public class Livro {
 
	private Long id;
	private String titulo;
	private String nomeAutor;
	private String texto;
	
	private Categoria categoria; 
}
