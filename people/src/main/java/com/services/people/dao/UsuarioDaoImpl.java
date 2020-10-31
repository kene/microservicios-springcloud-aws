package com.services.people.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.services.people.entity.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Usuario> getListUsers() {
		List<Usuario> listUsers = jdbcTemplate.query("select usuario_id, usuario_alias, usuario_dni, usuario_email, usuario_names, usuarios_password from cdevaws.usuario", (result, rowNum) -> new Usuario(
				result.getLong("usuario_id"),
				result.getString("usuario_alias"),
				result.getString("usuario_dni"),
				result.getString("usuario_email"),
				result.getString("usuario_names"),
				result.getString("usuario_password")
				));
		return listUsers;
	}

}
