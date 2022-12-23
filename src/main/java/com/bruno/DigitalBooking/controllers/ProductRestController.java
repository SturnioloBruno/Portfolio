package com.bruno.DigitalBooking.controllers;

import com.bruno.DigitalBooking.models.Producto;
import com.bruno.DigitalBooking.services.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    private  final ProductoService productoService ;

    public ProductRestController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Producto> findByID(@PathVariable Long id) {
        return ResponseEntity.ok(productoService.getOne(id));
    }

    @GetMapping("/getListProducts")
    public ResponseEntity<List<Producto>> getListProduct() {
        return ResponseEntity.ok(productoService.getAll());
    }
}
