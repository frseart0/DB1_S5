package com.duoc.learning_platform.repository;

import com.duoc.learning_platform.model.Curso;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CursoRepository {
    private List<Curso> cursos = new ArrayList<>();

    public CursoRepository() {
        // Datos iniciales para pruebas
        cursos.add(new Curso(1, "Desarrollo Backend I", "Curso de Spring Boot", true, 30));
        cursos.add(new Curso(2, "Base de Datos", "Modelamiento SQL", false, 25));
        cursos.add(new Curso(3, "Arquitectura", "Diseño de Microservicios", true, 20));
    }

    public List<Curso> findAll() {
        return cursos;
    }

    public void save(Curso curso) {
        cursos.add(curso);
    }
}