package Modelos;

public class SensorAcaros extends Sensor {
    public SensorAcaros(int numero, String estado, int cantidadDetecciones) {
        super(numero, estado, cantidadDetecciones);
    }

    @Override
    public String toString() {
        return "SensorAcaros: " + super.toString();
    }
}

