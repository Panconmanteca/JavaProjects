package javawhile;

import java.util.Scanner;

public class JavaWhile {
    public static void main(String[] args) {
        //Ejemplo bucle controlado por contador
        /*int contador = 0;
        
        while (contador < 10){
            System.out.println("Estoy en la vuelta N° " + contador);
            contador++;
        } */
        
        //Ejemplo bucle controlado por centinela
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        
        while (bandera == true) {
            System.out.println("El valor de mi bandera es: " + bandera);
            System.out.println("¿Estás actualmente suscrito? " + bandera);
            
            System.out.println("¿Querés desuscribirte? ");
            respuesta = teclado.next();
            
            if (respuesta.equalsIgnoreCase("si")){
                System.out.println("Te desuscribiste :(");
                bandera = false;
            } else {
                System.out.println("Sigues suscrito :D");
            }
            System.out.println("---------------------------");
        }
    }
}
