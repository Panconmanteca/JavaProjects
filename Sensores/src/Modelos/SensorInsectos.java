package Modelos;

public class SensorInsectos extends Sensor {
    public SensorInsectos(int numero, String estado, int cantidadDetecciones) {
        super(numero, estado, cantidadDetecciones);
    }

    @Override
    public String toString() {
        return "SensorInsectos: " + super.toString();
    }
}
