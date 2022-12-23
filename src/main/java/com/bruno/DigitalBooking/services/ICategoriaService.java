package com.bruno.DigitalBooking.services;

import com.bruno.DigitalBooking.models.Categoria;
import com.bruno.DigitalBooking.shared.GenericServiceAPI;

import java.util.Optional;


public interface ICategoriaService extends GenericServiceAPI<Categoria,Long> {

    //esto tiene el CRUD que extiende del GenericService, y la agrego el del titulo
    public Categoria findByCategoria(String cat_titulo);
}
