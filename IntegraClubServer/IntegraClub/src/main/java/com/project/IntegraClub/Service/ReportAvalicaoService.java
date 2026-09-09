package com.project.IntegraClub.Service;

import com.project.IntegraClub.Entidade.ReportAvaliacao;
import com.project.IntegraClub.Repository.ReportAvaliacaoRepository;
import com.project.IntegraClub.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportAvalicaoService {
    private final ReportAvaliacaoRepository reportAvaliacaoRepository;

    public ReportAvalicaoService(ReportAvaliacaoRepository reportAvaliacaoRepository) {this.reportAvaliacaoRepository = reportAvaliacaoRepository;}

    public ReportAvaliacao salvar(ReportAvaliacao reportAvaliacao) {
        return reportAvaliacaoRepository.save(reportAvaliacao);
    }

    public void excluir(ReportAvaliacao reportAvaliacao){
        reportAvaliacaoRepository.delete(reportAvaliacao);
    }

    public ReportAvaliacao buscarPorId(Integer id){
        return reportAvaliacaoRepository.findById(id).orElse(null);
    }

    public List<ReportAvaliacao> buscarTodos() {
        return (List<ReportAvaliacao>) reportAvaliacaoRepository.findAll();
    }
}
