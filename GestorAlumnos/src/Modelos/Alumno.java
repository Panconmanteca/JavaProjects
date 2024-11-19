package Modelos;

public class Alumno {
    private final String nombre;
    private final String apellido;
    private final String comision;
    private final double promedio;
    private boolean presente;

    public Alumno(String nombre, String apellido, String comision, double promedio, boolean presente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.comision = comision;
        this.promedio = promedio;
        this.presente = presente;
    }

    public String obtenerNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getComision() {
        return comision;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public boolean isPresente() {
        return presente;
    }

    public void estarPresente() {
        this.presente = true;
    }

    public void estarAusente() {
        this.presente = false;
    }

    @Override
    public String toString() {
        return obtenerNombreCompleto() + " - " + (presente ? "Presente" : "Ausente");
    }
}
