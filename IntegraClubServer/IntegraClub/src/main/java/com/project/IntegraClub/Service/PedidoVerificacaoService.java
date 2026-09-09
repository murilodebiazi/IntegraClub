package com.project.IntegraClub.Service;

import com.project.IntegraClub.Entidade.PedidoVerificacao;
import com.project.IntegraClub.Repository.PedidoVerificacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoVerificacaoService {
    private final PedidoVerificacaoRepository pedidoVerificacaoRepository;

    public PedidoVerificacaoService(PedidoVerificacaoRepository pedidoVerificacaoRepository) {this.pedidoVerificacaoRepository = pedidoVerificacaoRepository;}

    public PedidoVerificacao salvar(PedidoVerificacao pedidoVerificacao) {
        return pedidoVerificacaoRepository.save(pedidoVerificacao);
    }

    public void excluir(PedidoVerificacao pedidoVerificacao){
        pedidoVerificacaoRepository.delete(pedidoVerificacao);
    }

    public PedidoVerificacao buscarPorId(Integer id){
        return pedidoVerificacaoRepository.findById(id).orElse(null);
    }

    public List<PedidoVerificacao> buscarTodos() {
        return (List<PedidoVerificacao>) pedidoVerificacaoRepository.findAll();
    }
}
