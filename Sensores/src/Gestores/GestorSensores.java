package Gestores;

import Modelos.*;

import java.util.ArrayList;
import java.util.List;

public class GestorSensores {
    private final List<Sensor> sensores;

    public GestorSensores() {
        this.sensores = new ArrayList<>();
    }

    // Método para registrar un nuevo sensor
    public void registrarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    // Método para buscar un sensor por número entero
    public Sensor buscarSensor(int numero) {
        for (Sensor sensor : sensores) {
            if (sensor.getNumero() == numero) {
                return sensor;
            }
        }
        return null;
    }

    // Método para modificar el estado de un sensor (true o false)
    public boolean modificarEstadoSensor(int numero, String nuevoEstado) {
        Sensor sensor = buscarSensor(numero);
        if (sensor != null) {
            sensor.setEstado(nuevoEstado);
            return true;
        }
        return false;
    }

    // Método para retornar una lista de sensores inactivos
    public List<Sensor> obtenerSensoresInactivos() {
        List<Sensor> sensoresInactivos = new ArrayList<>();
        for (Sensor sensor : sensores) {
            if ("INACTIVO".equalsIgnoreCase(sensor.getEstado())) {
                sensoresInactivos.add(sensor);
            }
        }
        return sensoresInactivos;
    }

    // Método para mostrar todos los sensores inactivos
    public void mostrarSensoresInactivos() {
        List<Sensor> inactivos = obtenerSensoresInactivos();
        if (inactivos.isEmpty()) {
            System.out.println("No hay sensores inactivos.");
        } else {
            System.out.println("Sensores inactivos:");
            for (Sensor sensor : inactivos) {
                System.out.println(sensor);
            }
        }
    }
}
