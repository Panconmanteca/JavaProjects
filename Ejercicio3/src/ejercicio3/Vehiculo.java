package ejercicio3;

class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;
    
    public Vehiculo(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public String mostrarDatos(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: $" + precio;

    }
}
