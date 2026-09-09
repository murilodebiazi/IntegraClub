package com.project.IntegraClub.Repository;

import com.project.IntegraClub.Entidade.InstituicaoEsporte;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituicaoEsporteRepository extends CrudRepository<InstituicaoEsporte,Integer> {
}
