package com.project.IntegraClub.Service;

import com.project.IntegraClub.Entidade.InstituicaoEsporte;
import com.project.IntegraClub.Repository.InstituicaoEsporteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstituicaoEsporteService {
    private final InstituicaoEsporteRepository instituicaoEsporteRepository;

    public InstituicaoEsporteService(InstituicaoEsporteRepository instituicaoEsporteRepository) {this.instituicaoEsporteRepository = instituicaoEsporteRepository;}

    public InstituicaoEsporte salvar(InstituicaoEsporte instituicaoEsporte) {
        return instituicaoEsporteRepository.save(instituicaoEsporte);
    }

    public void excluir(InstituicaoEsporte instituicaoEsporte){
        instituicaoEsporteRepository.delete(instituicaoEsporte);
    }

    public InstituicaoEsporte buscarPorId(Integer id){
        return instituicaoEsporteRepository.findById(id).orElse(null);
    }

    public List<InstituicaoEsporte> buscarTodos() {
        return (List<InstituicaoEsporte>) instituicaoEsporteRepository.findAll();
    }
}
