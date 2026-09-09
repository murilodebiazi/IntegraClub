package com.project.IntegraClub.Service;

import com.project.IntegraClub.Entidade.MensagemJustificativa;
import com.project.IntegraClub.Repository.MensagemJustificativaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensagemJustificativaService {
    private final MensagemJustificativaRepository mensagemJustificativaRepository;

    public MensagemJustificativaService(MensagemJustificativaRepository mensagemJustificativaRepository) {this.mensagemJustificativaRepository = mensagemJustificativaRepository;}

    public MensagemJustificativa salvar(MensagemJustificativa mensagemJustificativa) {
        return mensagemJustificativaRepository.save(mensagemJustificativa);
    }

    public void excluir(MensagemJustificativa mensagemJustificativa){
        mensagemJustificativaRepository.delete(mensagemJustificativa);
    }

    public MensagemJustificativa buscarPorId(Integer id){
        return mensagemJustificativaRepository.findById(id).orElse(null);
    }

    public List<MensagemJustificativa> buscarTodos() {
        return (List<MensagemJustificativa>) mensagemJustificativaRepository.findAll();
    }
}
