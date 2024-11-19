import Modelos.*;
import Gestores.*;

public class Main {
    public static void main(String[] args) {
        GestorSensores gestor = new GestorSensores();

        // Registro de sensores
        gestor.registrarSensor(new SensorAcaros(1, "ACTIVO", 10));
        gestor.registrarSensor(new SensorAves(2, "INACTIVO", 5));
        gestor.registrarSensor(new SensorInsectos(3, "ACTIVO", 20));
        gestor.registrarSensor(new SensorRoedores(4, "INACTIVO", 15));

        Sensor sensor = gestor.buscarSensor(2);
        if (sensor != null) {
            System.out.println("Sensor encontrado: " + sensor);
            gestor.modificarEstadoSensor(2, "ACTIVO");
            System.out.println("Estado modificado: " + sensor);
        } else {
            System.out.println("Sensor no encontrado.");
        }

        // Mostrar sensores inactivos
        gestor.mostrarSensoresInactivos();
    }
}

