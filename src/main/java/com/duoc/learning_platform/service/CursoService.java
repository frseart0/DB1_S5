package com.duoc.learning_platform.service;

import com.duoc.learning_platform.model.Curso;
import com.duoc.learning_platform.repository.CursoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }
}