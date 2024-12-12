package com.aluracursos.desafio_literalura.LiteraluraChallenge.repositorio;

import com.aluracursos.desafio_literalura.LiteraluraChallenge.models.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ILibrosRepositorio extends JpaRepository<Libros, Long>{
    Libros findByTitulo(String titulo);

    List<Libros> findByLenguajesContaining(String lenguaje);
}