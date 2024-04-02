package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class InscripcionTest {

    Materia discreta = new Materia("Matematica Discreta",List.of());
    Materia algoritmos = new Materia("Algoritmos de Programacion",List.of());
    Materia paradigmas = new Materia("Paradigmas de Programacion",List.of(algoritmos, discreta));

    @Test

    public void ElAlumnoSePuedeInscribirALasMaterias(){
        Alumno florencia = new Alumno("Florencia",List.of(discreta,algoritmos));
        Inscripcion inscripcionFlorencia = new Inscripcion(List.of(paradigmas),florencia);

        Assertions.assertTrue(inscripcionFlorencia.aprobada());

    }
    @Test
    public void ElAlumnoNoSePuedeInscribirALasMaterias(){

        Alumno carlos = new Alumno("Carlos",List.of(algoritmos));
        Inscripcion inscripcionCarlos = new Inscripcion(List.of(paradigmas),carlos);

        Assertions.assertFalse(inscripcionCarlos.aprobada());

    }



}
