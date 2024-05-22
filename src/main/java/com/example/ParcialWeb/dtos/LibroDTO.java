package com.example.ParcialWeb.dtos;

import com.example.ParcialWeb.models.Libro;

public class LibroDTO {
    private Long id;
    private String nombre;
    private String autor;
    private String fechaEscritura;
    private int numeroEdicion;
    private double precio;
    private String tipo; 
    private String famaEscritor;

    
    public LibroDTO(Libro libro) {
        this.id = libro.getId();
        this.nombre = libro.getNombre();
        this.autor = libro.getAutor();
        this.fechaEscritura = libro.getFechaEscritura();
        this.numeroEdicion = libro.getNumeroEdicion();
        this.precio = libro.getPrecio();
        this.tipo = libro.getTipo();
        this.famaEscritor = libro.getFamaEscritor();
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaEscritura() {
        return fechaEscritura;
    }

    public void setFechaEscritura(String fechaEscritura) {
        this.fechaEscritura = fechaEscritura;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFamaEscritor() {
        return famaEscritor;
    }

    public void setFamaEscritor(String famaEscritor) {
        this.famaEscritor = famaEscritor;
    }
}
