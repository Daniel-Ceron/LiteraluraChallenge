package com.aluracursos.desafio_literalura.LiteraluraChallenge.repositorio;

import com.aluracursos.desafio_literalura.LiteraluraChallenge.models.Autores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAutoresRepositorio extends JpaRepository<Autores, Long> {
    Autores findByNameIgnoreCase(String nombre);

    List<Autores> findByAñoNacimientoLessThanEqualAndAñoMuerteGreaterThanEqual(int añoInicial, int añoFinal);
}