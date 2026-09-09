package com.project.IntegraClub.Repository;

import com.project.IntegraClub.Entidade.Denuncia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DenunciaRepository extends CrudRepository<Denuncia, Integer> {
}
