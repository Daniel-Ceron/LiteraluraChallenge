package com.aluracursos.desafio_literalura.LiteraluraChallenge;

import com.aluracursos.desafio_literalura.LiteraluraChallenge.principal.Principal;
import com.aluracursos.desafio_literalura.LiteraluraChallenge.repositorio.IAutoresRepositorio;
import com.aluracursos.desafio_literalura.LiteraluraChallenge.repositorio.ILibrosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraChallengeApplication implements CommandLineRunner {

    @Autowired
    private IAutoresRepositorio autoresRepository;
    @Autowired
    private ILibrosRepositorio librosRepository;

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraChallengeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(autoresRepository, librosRepository);
        principal.muestraElMenu();
    }
}