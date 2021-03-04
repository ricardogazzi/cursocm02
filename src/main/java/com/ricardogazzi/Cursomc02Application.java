package com.ricardogazzi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ricardogazzi.domain.Categoria;
import com.ricardogazzi.domain.Produto;
import com.ricardogazzi.repositories.CategoriaRepository;
import com.ricardogazzi.repositories.ProdutoRepository;

@SpringBootApplication
public class Cursomc02Application implements CommandLineRunner {//Implem. met. auxiliar p/ executar ação qdo aplicação iniciar

	@Autowired
	private CategoriaRepository categoriaRepository; //Puxa cat1 e 2 para BD
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Cursomc02Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Categoria cat1 = new Categoria(null, "Informática"); //Instancia das categorias. (ID = null porque é gerado autom.)
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);//Instancia dos produtos
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));//Apresentação dos produtos às categorias
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));//Apresent. das categorias aos produtos;
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));//Salvando no BD.
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
	}

}
