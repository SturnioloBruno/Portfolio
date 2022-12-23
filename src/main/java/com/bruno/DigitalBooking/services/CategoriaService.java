package com.bruno.DigitalBooking.services;

import com.bruno.DigitalBooking.models.Categoria;
import com.bruno.DigitalBooking.repositories.CategoriaRepository;
import com.bruno.DigitalBooking.shared.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService extends GenericServiceImpl<Categoria,Long> implements ICategoriaService{

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public JpaRepository<Categoria, Long> getRepository() {
        return categoriaRepository;
    }

    //agrego el servicio que me busca por el nombre de la categoria
    public Categoria findByCategoria(String cat_titulo) {
        Optional<Categoria> optional = categoriaRepository.findByTitulo(cat_titulo);
        return optional.orElse(null);
    }

}
