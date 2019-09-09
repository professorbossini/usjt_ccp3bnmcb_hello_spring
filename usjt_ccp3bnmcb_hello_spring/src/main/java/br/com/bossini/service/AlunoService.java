package br.com.bossini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bossini.model.bean.Aluno;
import br.com.bossini.model.repository.AlunoRepository;
import br.com.bossini.util.Calculadora;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepo;
	
	@Autowired
	private Calculadora calculadora;
	
	public void salvar (Aluno aluno) {
		alunoRepo.save(aluno);
	}
	
	public List <Aluno> listarTodos () {
		List<Aluno> alunos = alunoRepo.findAll();
		for (Aluno a : alunos) {
			a.setMediaFinal(calculadora.calculaMedia(a.getNota1(), a.getNota2()));
		}
		return alunos;
	}

}
