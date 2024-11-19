package Modelos;

public class SensorRoedores extends Sensor {
    public SensorRoedores(int numero, String estado, int cantidadDetecciones) {
        super(numero, estado, cantidadDetecciones);
    }

    @Override
    public String toString() {
        return "SensorRoedores: " + super.toString();
    }
}
