package com.project.IntegraClub.Controller;

import com.project.IntegraClub.DTO.UsuarioDTO;
import com.project.IntegraClub.Entidade.Usuario;
import com.project.IntegraClub.Repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository){this.usuarioRepository = usuarioRepository;}

    @PostMapping("/salvar")
    public Usuario salvar(@Valid UsuarioDTO usuarioDTO) {
        return usuarioRepository.save(new Usuario(usuarioDTO.id_usuario(), usuarioDTO.nome(), usuarioDTO.email(), usuarioDTO.senha(), usuarioDTO.telefone(), usuarioDTO.criado_em()));
    }

    @RequestMapping("/excluir")
    public void excluir(Usuario usuario){
        usuarioRepository.delete(usuario);
    }

    @GetMapping("/buscarPorId")
    public Usuario buscarPorId(Integer id){
        return usuarioRepository.findById(id).orElse(null);
    }

    @GetMapping("/buscarTodos")
    public List<Usuario> buscarTodos() {
        return (List<Usuario>) usuarioRepository.findAll();
    }
}
