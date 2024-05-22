package com.example.ParcialWeb.services;

import com.example.ParcialWeb.dtos.LibroDTO;
import com.example.ParcialWeb.models.Libro;
import com.example.ParcialWeb.repositories.LibroRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibroService {

    private final LibroRepository libroRepository;

    @Autowired
    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<LibroDTO> listarLibros() {
        List<Libro> libros = libroRepository.findAll();
        return libros.stream().map(LibroDTO::new).collect(Collectors.toList());
    }

    public LibroDTO obtenerLibroPorId(Long id) {
        Libro libro = libroRepository.findById(id).orElse(null);
        if (libro == null) return null;
        return new LibroDTO(libro);
    }

    public LibroDTO crearLibro(Libro libro) {
        return new LibroDTO(libroRepository.save(libro));
    }

    public LibroDTO actualizarLibro(Long id, Libro libro) {
        Libro libroExistente = libroRepository.findById(id).orElse(null);
        if (libroExistente == null) return null;

        BeanUtils.copyProperties(libro, libroExistente, "id");
        return new LibroDTO(libroRepository.save(libroExistente));
    }

    public LibroDTO eliminarLibro(Long id) {
        Libro libro = libroRepository.findById(id).orElse(null);
        if (libro == null) return null;

        libroRepository.deleteById(id);
        return new LibroDTO(libro);
    }
}
