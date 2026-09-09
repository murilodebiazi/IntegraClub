package com.project.IntegraClub.Repository;

import com.project.IntegraClub.Entidade.ReportAvaliacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportAvaliacaoRepository extends CrudRepository<ReportAvaliacao,Integer> {
}
