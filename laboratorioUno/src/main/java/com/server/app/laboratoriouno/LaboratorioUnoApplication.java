package com.server.app.laboratoriouno;

import com.server.app.laboratoriouno.model.Bow;
import com.server.app.laboratoriouno.service.BowService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class LaboratorioUnoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaboratorioUnoApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(BowService service) {
        return args -> {

            System.out.println("=== FILTRO POR VIRUS: T-Virus ===");
            imprimir(service.filtrarPorVirus("T-Virus"));

            System.out.println("\n=== FILTRO POR ESTADO: En libertad ===");
            imprimir(service.filtrarPorEstado("En libertad"));

            System.out.println("\n=== VIRUS ACTIVOS SIN REPETIR ===");
            service.virusActivosSinRepetir()
                    .forEach(v -> System.out.println("[S.T.A.R.S-REPORT] Virus activo: " + v));
        };
    }

    private void imprimir(List<Bow> lista) {
        lista.forEach(b -> System.out.println(
                "[S.T.A.R.S-REPORT] Nombre: " + b.getNombre() +
                        " | Nivel de Peligro: " + b.getNivelPeligro() +
                        " | Punto Débil: " + b.getPuntoDebil()
        ));
    }
}