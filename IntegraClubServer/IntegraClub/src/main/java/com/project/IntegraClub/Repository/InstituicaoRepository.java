package com.project.IntegraClub.Repository;

import com.project.IntegraClub.Entidade.Instituicao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituicaoRepository extends CrudRepository<Instituicao,Integer> {
}
