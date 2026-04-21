package com.server.app.laboratoriouno.repository;

import com.server.app.laboratoriouno.model.Bow;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BowRepository {

    public List<Bow> listar() {
        return List.of(
                new Bow("Licker", "T-Virus", 4, "Cabeza", "En libertad", "Comisaría", "Lab Redes"),
                new Bow("Hunter", "T-Virus", 3, "Cuello", "Contenido", "Mansión", "Lab Física"),
                new Bow("Tyrant", "G-Virus", 5, "Corazón expuesto", "En libertad", "Laboratorio", "Lab IA"),
                new Bow("Regenerador", "Las Plagas", 5, "Parásitos internos", "Contenido", "Pueblo", "Lab Biología"),
                new Bow("Lady Dimitrescu", "Cadou", 4, "Torso", "Eliminado", "Castillo", "Lab Química")
        );
    }
}