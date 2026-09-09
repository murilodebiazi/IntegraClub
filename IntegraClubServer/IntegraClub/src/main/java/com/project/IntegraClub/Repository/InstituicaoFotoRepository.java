package com.project.IntegraClub.Repository;

import com.project.IntegraClub.Entidade.InstituicaoFoto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituicaoFotoRepository extends CrudRepository<InstituicaoFoto,Integer> {
}
