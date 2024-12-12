package com.aluracursos.desafio_literalura.LiteraluraChallenge.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}

