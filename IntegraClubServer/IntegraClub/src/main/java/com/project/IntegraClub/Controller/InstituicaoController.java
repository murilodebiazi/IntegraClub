package com.project.IntegraClub.Controller;

import com.project.IntegraClub.Repository.InstituicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instituicao")
public class InstituicaoController {

    @Autowired
    private final InstituicaoRepository instituicaoRepository;

    public InstituicaoController(InstituicaoRepository instituicaoRepository) { this.instituicaoRepository = instituicaoRepository; }

}
