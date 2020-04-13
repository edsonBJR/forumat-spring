package br.com.escola.forumat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.escola.forumat.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
