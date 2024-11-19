package com.gestor.model;

public class Usuario {
    private final String nombre;
    private final String apellido;
    private final String numeroDocumento;
    private final String telefono;

    // Constructor
    public Usuario(String nombre, String apellido, String numeroDocumento, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;  // Se corregirá aquí
        this.telefono = telefono;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
               "nombre='" + nombre + '\'' +
               ", apellido='" + apellido + '\'' +
               ", numeroDocumento='" + numeroDocumento + '\'' +
               ", telefono='" + telefono + '\'' +
               '}';
    }

    // Método de ejemplo que puedes ajustar
    public void agregarVehiculo(Vehiculo nuevoVehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); // Este es solo un ejemplo
    }
}
