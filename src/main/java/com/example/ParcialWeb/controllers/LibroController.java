package com.example.ParcialWeb.controllers;

import com.example.ParcialWeb.dtos.LibroDTO;
import com.example.ParcialWeb.models.Libro;
import com.example.ParcialWeb.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<LibroDTO> listarLibros() {
        return libroService.listarLibros();
    }

    @GetMapping("/{id}")
    public LibroDTO obtenerLibroPorId(@PathVariable Long id) {
        return libroService.obtenerLibroPorId(id);
    }

    @PostMapping
    public LibroDTO crearLibro(@RequestBody Libro libro) {
        return libroService.crearLibro(libro);
    }

    @PutMapping("/{id}")
    public LibroDTO actualizarLibro(@PathVariable Long id, @RequestBody Libro libro) {
        return libroService.actualizarLibro(id, libro);
    }

    @DeleteMapping("/{id}")
    public LibroDTO eliminarLibro(@PathVariable Long id) {
        return libroService.eliminarLibro(id);
    }
}
