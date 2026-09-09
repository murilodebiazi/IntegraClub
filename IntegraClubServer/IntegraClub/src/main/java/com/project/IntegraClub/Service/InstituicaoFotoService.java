package com.project.IntegraClub.Service;

import com.project.IntegraClub.Entidade.InstituicaoFoto;
import com.project.IntegraClub.Repository.InstituicaoFotoRepository;
import com.project.IntegraClub.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstituicaoFotoService {
    private final InstituicaoFotoRepository instituicaoFotoRepository;

    public InstituicaoFotoService(InstituicaoFotoRepository instituicaoFotoRepository) {this.instituicaoFotoRepository = instituicaoFotoRepository;}

    public InstituicaoFoto salvar(InstituicaoFoto instituicaoFoto) {
        return instituicaoFotoRepository.save(instituicaoFoto);
    }

    public void excluir(InstituicaoFoto instituicaoFoto){
        instituicaoFotoRepository.delete(instituicaoFoto);
    }

    public InstituicaoFoto buscarPorId(Integer id){
        return instituicaoFotoRepository.findById(id).orElse(null);
    }

    public List<InstituicaoFoto> buscarTodos() {
        return (List<InstituicaoFoto>) instituicaoFotoRepository.findAll();
    }
}
