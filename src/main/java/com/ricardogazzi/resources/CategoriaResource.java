package com.ricardogazzi.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardogazzi.domain.Categoria;

@RestController // Adicionar e importar
@RequestMapping(value = "/categorias") // Criação de classe que é controlador rest e responde pelo endpoint categorias
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET) // função rest se associa a verbo http
	public List<Categoria> listar() { // mudar String para List<Categoria>

		Categoria cat1 = new Categoria(1, "Informática"); // Criação dos objetos tipo categoria
		Categoria cat2 = new Categoria(2, "Escritório");

		List<Categoria> lista = new ArrayList<>(); // lista de categorias. Importar e etc.
		lista.add(cat1);
		lista.add(cat2);

		return lista; // Mudar frase para lista. Retorna lista de categorias.
	}

}
