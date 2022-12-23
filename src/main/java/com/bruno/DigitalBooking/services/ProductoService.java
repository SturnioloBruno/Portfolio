package com.bruno.DigitalBooking.services;

import com.bruno.DigitalBooking.models.Producto;
import com.bruno.DigitalBooking.repositories.ProductoRepository;
import com.bruno.DigitalBooking.shared.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends GenericServiceImpl<Producto,Long> implements IProductoService{

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public JpaRepository<Producto, Long> getRepository() {
        return productoRepository;
    }

    //por extension generica, tiene todos los servicios CRUD
}
