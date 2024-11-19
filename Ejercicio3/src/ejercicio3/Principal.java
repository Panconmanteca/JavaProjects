package ejercicio3;
import java.util.Scanner;

public class Principal {
    public static int indiceCocheMBarato(Vehiculo coches[]){
        double precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for(int i=1; i<coches.length; i++){
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String marca, modelo;
        double precio;
        int numVehiculos, indiceBarato;
        
        System.out.println("Digite la cantidad de vehículos: ");
        numVehiculos = teclado.nextInt();
        
        //Creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numVehiculos];
        
        for(int i=0; i<coches.length; i++){
            teclado.nextLine();
            System.out.println("\nDigite las características del coche "+ (i+1) + ":");
            System.out.println("Introduzca marca: " );
            marca = teclado.nextLine();
            System.out.println("Introduzca modelo: " );
            modelo = teclado.nextLine();
            System.out.println("Introduzca el precio: " );
            precio = teclado.nextDouble();
            
            coches[i] = new Vehiculo(marca, modelo, precio); 
        }
        indiceBarato =  indiceCocheMBarato(coches);
        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indiceBarato]. mostrarDatos());
    }
}
