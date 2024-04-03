package domain;

import java.util.List;

public class Materia {

    private String nombre;
    private List<Materia> materiasCorrelativas;

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    //Para Test
    public Materia(String nombre, List<Materia> materiasCorrelativas) {
        this.nombre = nombre;
        this.materiasCorrelativas = materiasCorrelativas;
    }
}
