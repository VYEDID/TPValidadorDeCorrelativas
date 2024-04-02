package domain;

import java.util.List;

public class Materia {

    private String nombre;
    private List<Materia> materiasCorrelativas;

    public Boolean cumpleCorrelatividad(List<Materia> materiasAprobadas) {

        if(materiasCorrelativas.isEmpty()){
            return true;

        }
       return materiasAprobadas.containsAll(materiasCorrelativas);
    }

    //Para Test
    public Materia(String nombre, List<Materia> materiasCorrelativas) {
        this.nombre = nombre;
        this.materiasCorrelativas = materiasCorrelativas;
    }
}
