package com.project.IntegraClub.Service;

import com.project.IntegraClub.Entidade.Usuario;
import com.project.IntegraClub.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {this.usuarioRepository = usuarioRepository;}

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void excluir(Usuario usuario){
        usuarioRepository.delete(usuario);
    }

    public Usuario buscarPorId(Integer id){
        return usuarioRepository.findById(id).orElse(null);
    }

    public List<Usuario> buscarTodos() {
        return (List<Usuario>) usuarioRepository.findAll();
    }
}
