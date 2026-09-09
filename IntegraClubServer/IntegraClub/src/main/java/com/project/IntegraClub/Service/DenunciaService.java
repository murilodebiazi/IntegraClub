package com.project.IntegraClub.Service;

import com.project.IntegraClub.Entidade.Denuncia;
import com.project.IntegraClub.Repository.DenunciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DenunciaService {
    private final DenunciaRepository denunciaRepository;

    public DenunciaService(DenunciaRepository denunciaRepository) {this.denunciaRepository = denunciaRepository;}

    public Denuncia salvar(Denuncia denuncia) {
        return denunciaRepository.save(denuncia);
    }

    public void excluir(Denuncia denuncia){
        denunciaRepository.delete(denuncia);
    }

    public Denuncia buscarPorId(Integer id){
        return denunciaRepository.findById(id).orElse(null);
    }

    public List<Denuncia> buscarTodos() {
        return (List<Denuncia>) denunciaRepository.findAll();
    }
}
