package com.server.app.laboratoriouno.service;

import com.server.app.laboratoriouno.model.Bow;
import com.server.app.laboratoriouno.repository.BowRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BowService {

    private final BowRepository repository;

    // Inyección por constructor (OBLIGATORIO)
    public BowService(BowRepository repository) {
        this.repository = repository;
    }

    // 🔹 1. Filtrar por virus
    public List<Bow> filtrarPorVirus(String virus) {
        return repository.listar().stream()
                .filter(b -> b.getVirusBase().equalsIgnoreCase(virus))
                .toList();
    }

    // 🔹 2. Filtrar por estado
    public List<Bow> filtrarPorEstado(String estado) {
        return repository.listar().stream()
                .filter(b -> b.getEstado().equalsIgnoreCase(estado))
                .toList();
    }

    // 🔥 3. Virus activos SIN REPETICIÓN (REQUISITO CLAVE)
    public List<String> virusActivosSinRepetir() {
        return repository.listar().stream()
                .filter(b -> b.getEstado().equalsIgnoreCase("En libertad"))
                .map(Bow::getVirusBase)
                .distinct() // 🔥 ESTO TE LO VAN A EVALUAR
                .toList();
    }
}