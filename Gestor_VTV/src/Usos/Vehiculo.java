package com.gestor.model;

public class Vehiculo {
    private final String marca;
    private final String modelo;
    private final String nroChasis;
    private final String patente;
    private final int anioFabricacion;
    private final int cantEjes;
    private final String tipoMotor;

    // Constructor de la clase Vehiculo
    public Vehiculo(String marca, String modelo, String nroChasis, String patente,
                    int anioFabricacion, int cantEjes, String tipoMotor) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.nroChasis = nroChasis;
        this.patente = patente;
        this.anioFabricacion = anioFabricacion;
        this.cantEjes = cantEjes;
        this.tipoMotor = tipoMotor;
    }

    // Métodos getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNroChasis() {
        return nroChasis;
    }

    public String getPatente() {
        return patente;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public int getCantEjes() {
        return cantEjes;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    // Método toString() para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Vehiculo{" +
               "marca='" + marca + '\'' +
               ", modelo='" + modelo + '\'' +
               ", nroChasis='" + nroChasis + '\'' +
               ", patente='" + patente + '\'' +
               ", anioFabricacion=" + anioFabricacion +
               ", cantEjes=" + cantEjes +
               ", tipoMotor='" + tipoMotor + '\'' +
               '}';
    }
}
