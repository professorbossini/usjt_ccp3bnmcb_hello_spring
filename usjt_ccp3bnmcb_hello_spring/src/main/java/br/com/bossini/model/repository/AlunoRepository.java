package br.com.bossini.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bossini.model.bean.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
