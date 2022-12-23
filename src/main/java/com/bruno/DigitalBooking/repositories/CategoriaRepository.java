package com.bruno.DigitalBooking.repositories;

import com.bruno.DigitalBooking.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
    Optional<Categoria> findByTitulo(String cat_titulo);
}
