package com.bruno.DigitalBooking.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Productos")
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "prod_nombre", nullable = false)
    private String name;

    @Column(name = "prod_puntuacion")
    private int puntuacion;

    @Column(name = "prod_estrellas")
    private int estrellas;

    @Column(name = "prod_desc_titulo")
    private String descTitulo;

    @Column(name = "prod_descripcion")
    private String descripcion;

    @Column(name = "prod_coordenadas")
    private int coordenadas;

    @ManyToOne
    @JoinColumn(name = "cat_id", nullable = false)
    private Categoria categoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getDescTitulo() {
        return descTitulo;
    }

    public void setDescTitulo(String descTitulo) {
        this.descTitulo = descTitulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(int coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
