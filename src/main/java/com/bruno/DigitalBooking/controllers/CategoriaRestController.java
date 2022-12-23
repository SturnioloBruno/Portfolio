package com.bruno.DigitalBooking.controllers;

import com.bruno.DigitalBooking.models.Categoria;
import com.bruno.DigitalBooking.services.CategoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriaRestController {
    private CategoriaService categoriaService;

    public CategoriaRestController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/getAll")
    public List<Categoria> findAll() {
        return categoriaService.getAll();
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Categoria categoria) {
        return ResponseEntity.ok().body(categoriaService.save(categoria));
    }

    @GetMapping("getOne/{id}")
    public ResponseEntity<?> findOne(@PathVariable Long id) {
        var category = categoriaService.getOne(id);
        if (category == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(category);
    }

    @DeleteMapping("delete/{v}")
    public ResponseEntity<?> delete(@PathVariable Long v) {
        var category = categoriaService.getOne(v);
        if (category == null) return ResponseEntity.notFound().build();
        categoriaService.delete(v);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getByName/{name}")
    public ResponseEntity<?> searchByName(@PathVariable String name) {
        var category = categoriaService.findByCategoria(name);
        if (category == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(category);
    }
}
