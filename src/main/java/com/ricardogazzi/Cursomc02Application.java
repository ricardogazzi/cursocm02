package com.ricardogazzi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ricardogazzi.domain.Categoria;
import com.ricardogazzi.repositories.CategoriaRepository;

@SpringBootApplication
public class Cursomc02Application implements CommandLineRunner {//Implem. met. auxiliar p/ executar ação qdo aplicação iniciar

	@Autowired
	private CategoriaRepository categoriaRepository; //Puxa cat1 e 2 para BD
	
	public static void main(String[] args) {
		SpringApplication.run(Cursomc02Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Categoria cat1 = new Categoria(null, "Informática"); //Instancia das categorias. (ID = null porque é gerado autom.)
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));//Salvando no BD.
		
	}

}
