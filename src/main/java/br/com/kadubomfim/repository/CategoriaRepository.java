package br.com.kadubomfim.repository;

import br.com.kadubomfim.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
