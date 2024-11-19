package Modelos;

/*
acá defino una
abstracción que englobe objetos de diferentes tipos para hacer uso del polimorfismo,
ya que todos son Sensores, pero tiene para cada animal un comportamiento distinto
*/

public abstract class Sensor {
    private final int numero; //Acá NetBeans me recomendó hacerlo final (constante)
    private String estado;
    private final int cantidadDetecciones;

    public Sensor(int numero, String estado, int cantidadDetecciones) {
        this.numero = numero;
        this.estado = estado;
        this.cantidadDetecciones = cantidadDetecciones;
    }

    public int getNumero() {
        return numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidadDetecciones() {
        return cantidadDetecciones;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "numero=" + numero +
                ", estado='" + estado + '\'' +
                ", cantidadDetecciones=" + cantidadDetecciones +
                '}';
    }
}