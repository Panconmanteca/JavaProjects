package Usos;

import com.gestor.model.Usuario;
import com.gestor.model.Vehiculo; 
import java.util.ArrayList;
import java.util.List;

public class RegistrarAutomovil {

    // Lista para almacenar los usuarios registrados
    private final List<Usuario> usuariosRegistrados;

    // Lista para almacenar los vehículos registrados
    private final List<Vehiculo> vehiculosRegistrados;

    // Constructor para inicializar las listas
    public RegistrarAutomovil() {
        usuariosRegistrados = new ArrayList<>();
        vehiculosRegistrados = new ArrayList<>();
    }

    // Método para registrar el usuario
    public void registrarUsuario(Usuario usuario) {
        // Almacenar el usuario en la lista
        usuariosRegistrados.add(usuario);

        // Mostrar mensaje de registro
        System.out.println("Registrando al cliente: " + usuario.getNombre() + " " + usuario.getApellido());

        // Mostrar lista de todos los usuarios registrados
        System.out.println("\nClientes registrados:");
        for (Usuario u : usuariosRegistrados) {
            System.out.println(u);
        }
    }

    // Método para registrar el vehículo
    public void registrarVehiculo(Vehiculo vehiculo) {
        // Almacenar el vehículo en la lista
        vehiculosRegistrados.add(vehiculo);

        // Mostrar mensaje de registro
        System.out.println("Registrando vehículo: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        System.out.println("Número de chasis: " + vehiculo.getNroChasis());
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Año de fabricación: " + vehiculo.getAnioFabricacion());
        System.out.println("Cantidad de ejes: " + vehiculo.getCantEjes());
        System.out.println("Tipo de motor: " + vehiculo.getTipoMotor());

        // Mostrar lista de todos los vehículos registrados
        System.out.println("\nVehículos registrados:");
        for (Vehiculo v : vehiculosRegistrados) {
            System.out.println(v);
        }
    }

    // Método para obtener la lista de vehículos registrados (si es que se necesita acceder a ella)
    public List<Vehiculo> getVehiculosRegistrados() {
        return vehiculosRegistrados;
    }
}