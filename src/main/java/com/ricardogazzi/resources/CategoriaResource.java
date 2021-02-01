package com.ricardogazzi.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //Adicionar e importar
@RequestMapping (value = "/categorias") //Criação de classe que é controlador rest e responde pelo endpoint categorias
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)//função rest se associa a verbo http
	public String listar() {
	return "Rest está funcionando";
	}
	
}
