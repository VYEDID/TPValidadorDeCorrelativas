package domain;


import java.util.List;

public class Inscripcion {

    private List<Materia> materiasAInscribirse;
    private Alumno alumno;

    public Inscripcion(List<Materia> materiasAInscribirse, Alumno alumno) {
        this.materiasAInscribirse = materiasAInscribirse;
        this.alumno = alumno;
    }

    public boolean aprobada(){
        return  this.materiasAInscribirse.
                stream().
                allMatch(materia -> materia.cumpleCorrelatividad(alumno.getMateriasAprobadas()));
    }
}
