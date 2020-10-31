package com.services.people.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.people.entity.Usuario;
import com.services.people.service.UsuarioService;

@RestController
@RequestMapping("uri")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioServiceImpl;
	
	
	//@Value("${..}") // llamar el valor del config server -github
	
	@RequestMapping(value = "/userlist", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> listUsers(){
		List<Usuario> listUsers = new ArrayList<>();
		
		try {
			listUsers = usuarioServiceImpl.getListUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listUsers;
	}
	
}
