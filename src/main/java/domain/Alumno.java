package domain;

import java.util.List;

public class Alumno {

    private String nombre;
    private List<Materia> materiasAprobadas;

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public Boolean cumpleCorrelatividad(List<Materia> materiasCorrelativas) {

        if(materiasCorrelativas.isEmpty()){
            return true;

        }
        return materiasAprobadas.containsAll(materiasCorrelativas);
    }


    public Alumno(String nombre, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.materiasAprobadas = materiasAprobadas;
    }

}
