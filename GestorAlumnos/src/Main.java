import IGU.AlumnoIGU;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {

        //Esto es para que se inicialice desde la Interfaz Gráfica de Usuario
        SwingUtilities.invokeLater(() -> {
            new AlumnoIGU().setVisible(true);
        });
    }
}
