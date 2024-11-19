package Modelos;

public class SensorAves extends Sensor {
    public SensorAves(int numero, String estado, int cantidadDetecciones) {
        super(numero, estado, cantidadDetecciones); //Esto es para el constructor
    }

    @Override
    public String toString() {
        return "SensorAves: " + super.toString();
    }
}
