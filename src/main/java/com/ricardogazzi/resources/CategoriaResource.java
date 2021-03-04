package com.ricardogazzi.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardogazzi.domain.Categoria;
import com.ricardogazzi.services.CategoriaService;

@RestController // Adicionar e importar
@RequestMapping(value = "/categorias") // Criação de classe que é controlador rest e responde pelo endpoint categorias
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value =  "/{id}", method = RequestMethod.GET) // função rest se associa a verbo http
	public ResponseEntity<?> find(@PathVariable Integer id) { // mudar String para List<Categoria>
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
		
		/*Categoria cat1 = new Categoria(1, "Informática"); //  Instanciação dos objetos tipo categoria
		Categoria cat2 = new Categoria(2, "Escritório");

		List<Categoria> lista = new ArrayList<>(); // lista de categorias. Importar e etc.
		lista.add(cat1);// Adicionar categorias à lista criada.
		lista.add(cat2);

		return lista; // Mudar frase para lista. Retorna lista de categorias.
	}*/


