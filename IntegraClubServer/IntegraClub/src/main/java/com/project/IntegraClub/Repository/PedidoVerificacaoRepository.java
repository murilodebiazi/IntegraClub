package com.project.IntegraClub.Repository;

import com.project.IntegraClub.Entidade.PedidoVerificacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoVerificacaoRepository extends CrudRepository<PedidoVerificacao,Integer> {
}
