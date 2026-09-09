package com.project.IntegraClub.Service;

import com.project.IntegraClub.Entidade.Instituicao;
import com.project.IntegraClub.Repository.InstituicaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstituicaoService {
    private final InstituicaoRepository instituicaoRepository;

    public InstituicaoService(InstituicaoRepository userRepository) {this.instituicaoRepository = userRepository;}

    public Instituicao salvar(Instituicao instituicao) {
        return instituicaoRepository.save(instituicao);
    }

    public void excluir(Instituicao instituicao){
        instituicaoRepository.delete(instituicao);
    }

    public Instituicao buscarPorId(Integer id){
        return instituicaoRepository.findById(id).orElse(null);
    }

    public List<Instituicao> buscarTodos() {
        return (List<Instituicao>) instituicaoRepository.findAll();
    }
}
