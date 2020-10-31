package com.services.people.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.people.dao.UsuarioDao;
import com.services.people.entity.Usuario;


@Service
public class UsuarioServiceImpl implements UsuarioService {

	
	@Autowired
	private UsuarioDao usuarioDaoImpl;
	
	@Override
	public List<Usuario> getListUsers() {
		
		return usuarioDaoImpl.getListUsers();
	}

}
