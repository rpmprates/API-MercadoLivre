package br.com.api.mercadolivre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.mercadolivre.controller.form.UsuarioForm;
import br.com.api.mercadolivre.model.Usuario;
import br.com.api.mercadolivre.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping
	public void cadastrar(@RequestBody UsuarioForm form) {
		Usuario usuario = form.converter();		
		usuarioRepository.save(usuario);
		
		
		
		
		
		
	}
	
	

}
