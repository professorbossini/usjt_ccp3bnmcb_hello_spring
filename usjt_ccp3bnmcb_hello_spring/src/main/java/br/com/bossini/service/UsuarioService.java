package br.com.bossini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bossini.model.bean.Usuario;
import br.com.bossini.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepo;
	
	
	public boolean logar (Usuario usuario) {
		return (usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), 
				usuario.getSenha()) != null);
	}
	
	
}
