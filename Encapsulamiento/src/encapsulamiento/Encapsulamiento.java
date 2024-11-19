package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
    
    Alumno alumno = new Alumno();
    Alumno alumno2 = new Alumno(15, "Axel", "Carb");
    
        System.out.println("id:" + alumno2.getId());
        System.out.println("Nombre:" + alumno2.getNombre());
        System.out.println("Apellido:" + alumno2.getApellido());
    }
    
}
