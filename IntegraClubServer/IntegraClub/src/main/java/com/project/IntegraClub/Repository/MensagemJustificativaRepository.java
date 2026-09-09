package com.project.IntegraClub.Repository;

import com.project.IntegraClub.Entidade.MensagemJustificativa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensagemJustificativaRepository extends CrudRepository<MensagemJustificativa, Integer> {
}
