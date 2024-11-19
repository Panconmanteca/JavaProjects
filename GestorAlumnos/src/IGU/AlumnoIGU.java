package IGU;

import Modelos.Alumno;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class AlumnoIGU extends JFrame {
    private final ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    private final DefaultListModel<String> listModel = new DefaultListModel<>();
    private final JList<String> alumnoList = new JList<>(listModel);
    private final JTextField nombreField;
    private final JTextField apellidoField;
    private final JTextField comisionField;
    private final JTextField promedioField;
    private final JCheckBox presenteCheckBox;

    public AlumnoIGU() {
        setTitle("Gestión de Alumnos");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(true);
        setLocationRelativeTo(null); //Para que siempre aparezca en el medio

        // Panel para agregar a los alumnos
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        inputPanel.add(nombreField);

        inputPanel.add(new JLabel("Apellido:"));
        apellidoField = new JTextField();
        inputPanel.add(apellidoField);

        inputPanel.add(new JLabel("Comisión:"));
        comisionField = new JTextField();
        inputPanel.add(comisionField);

        inputPanel.add(new JLabel("Promedio:"));
        promedioField = new JTextField();
        inputPanel.add(promedioField);

        inputPanel.add(new JLabel("Presente:"));
        presenteCheckBox = new JCheckBox();
        inputPanel.add(presenteCheckBox);

        JButton agregarButton = new JButton("Agregar Alumno");
        agregarButton.addActionListener((ActionEvent e) -> {
            agregarAlumno();
        });

        // Panel para la lista de alumnos
        JScrollPane listScrollPane = new JScrollPane(alumnoList);
        alumnoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton mostrarDatosButton = new JButton("Mostrar Datos");
        mostrarDatosButton.addActionListener((ActionEvent e) -> {
            mostrarDatosAlumno();
        });

        JButton marcarPresenteButton = new JButton("Marcar Presente");
        marcarPresenteButton.addActionListener((ActionEvent e) -> {
            marcarPresente();
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(agregarButton);
        buttonPanel.add(mostrarDatosButton);
        buttonPanel.add(marcarPresenteButton);

        add(inputPanel, BorderLayout.NORTH);
        add(listScrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void agregarAlumno() {
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String comision = comisionField.getText();
        double promedio = Double.parseDouble(promedioField.getText());
        boolean presente = presenteCheckBox.isSelected();

        Alumno alumno = new Alumno(nombre, apellido, comision, promedio, presente);
        listaAlumnos.add(alumno);
        listModel.addElement(alumno.obtenerNombreCompleto());
        limpiarCampos();
    }

    private void mostrarDatosAlumno() {
        int index = alumnoList.getSelectedIndex();
        if (index != -1) {
            Alumno alumno = listaAlumnos.get(index);
            JOptionPane.showMessageDialog(this,
                    "Nombre: " + alumno.obtenerNombreCompleto() +
                    "\nComisión: " + alumno.getComision() +
                    "\nPromedio: " + alumno.obtenerPromedio() +
                    "\nEstado: " + (alumno.isPresente() ? "Presente" : "Ausente"),
                    "Datos del Alumno",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void marcarPresente() {
        int index = alumnoList.getSelectedIndex();
        if (index != -1) {
            Alumno alumno = listaAlumnos.get(index);
            alumno.estarPresente();
            listModel.set(index, alumno.obtenerNombreCompleto());
            JOptionPane.showMessageDialog(this, "El alumno ha sido marcado como presente.");
        }
    }

    private void limpiarCampos() {
        nombreField.setText("");
        apellidoField.setText("");
        comisionField.setText("");
        promedioField.setText("");
        presenteCheckBox.setSelected(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AlumnoIGU().setVisible(true);
        });
    }
}
