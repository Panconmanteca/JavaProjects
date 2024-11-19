package igu;

import Usos.RegistrarAutomovil;
import com.gestor.model.Usuario;
import com.gestor.model.Vehiculo;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegistroAutomovil extends javax.swing.JFrame {
        int xMouse, yMouse ;
        
    public RegistroAutomovil(Usuario usuario) {
        initComponents();
        
        setTitle("Registro de Automóvil");
        setSize(580, 400);  // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Centra la ventana en la pantalla

        // Mostrar los datos del usuario en la interfaz (opcional)
        System.out.println("Registrando automóvil para: " + usuario.getNombre() + " " + usuario.getApellido());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        salirBtn = new javax.swing.JPanel();
        salirTxt = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        marcaTxt1 = new javax.swing.JLabel();
        seleccionAuto1 = new javax.swing.JComboBox<>();
        modeloTxt = new javax.swing.JLabel();
        modeloField = new javax.swing.JTextField();
        chasisTxt = new javax.swing.JLabel();
        chasisField = new javax.swing.JTextField();
        patenteTxt = new javax.swing.JLabel();
        patenteField = new javax.swing.JTextField();
        anioTxt1 = new javax.swing.JLabel();
        anioField = new javax.swing.JTextField();
        ejesTxt = new javax.swing.JLabel();
        ejesCmbox = new javax.swing.JComboBox<>();
        tipoMotorTxt1 = new javax.swing.JLabel();
        eleccionMotorCmbox1 = new javax.swing.JComboBox<>();
        separador = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(204, 204, 204));
        header.setForeground(new java.awt.Color(204, 204, 204));
        header.setOpaque(false);
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        salirBtn.setBackground(new java.awt.Color(255, 255, 255));
        salirBtn.setForeground(new java.awt.Color(0, 0, 0));
        salirBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirBtnMouseExited(evt);
            }
        });

        salirTxt.setBackground(new java.awt.Color(255, 255, 255));
        salirTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salirTxt.setForeground(new java.awt.Color(0, 0, 0));
        salirTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirTxt.setText("X");
        salirTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirTxt.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        salirTxt.setOpaque(true);
        salirTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        salirTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirTxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout salirBtnLayout = new javax.swing.GroupLayout(salirBtn);
        salirBtn.setLayout(salirBtnLayout);
        salirBtnLayout.setHorizontalGroup(
            salirBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salirBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salirTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        salirBtnLayout.setVerticalGroup(
            salirBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 540, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/autito (2).jpg"))); // NOI18N
        fondo.setText("jLabel1");
        background.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 210, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo.png"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 100));

        marcaTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        marcaTxt1.setForeground(new java.awt.Color(0, 0, 0));
        marcaTxt1.setText("Marca");
        background.add(marcaTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 50, 20));

        seleccionAuto1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ford", "Volkswagen", "Fiat", "Peugeot", "General Motors", "Honda", "Iveco", "Mercedes-Benz", "Nissan" }));
        background.add(seleccionAuto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        modeloTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        modeloTxt.setForeground(new java.awt.Color(0, 0, 0));
        modeloTxt.setText("Modelo");
        background.add(modeloTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, 20));

        modeloField.setBackground(new java.awt.Color(255, 255, 255));
        modeloField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        modeloField.setForeground(new java.awt.Color(153, 153, 153));
        modeloField.setText("Rellenar campo");
        modeloField.setBorder(null);
        modeloField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                modeloFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                modeloFieldFocusLost(evt);
            }
        });
        modeloField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modeloFieldMousePressed(evt);
            }
        });
        modeloField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloFieldActionPerformed(evt);
            }
        });
        background.add(modeloField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 140, 20));

        chasisTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chasisTxt.setForeground(new java.awt.Color(0, 0, 0));
        chasisTxt.setText("Nro. Chasis");
        background.add(chasisTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 20));

        chasisField.setBackground(new java.awt.Color(255, 255, 255));
        chasisField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chasisField.setForeground(new java.awt.Color(153, 153, 153));
        chasisField.setText("Ingresar número");
        chasisField.setBorder(null);
        chasisField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chasisFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                chasisFieldFocusLost(evt);
            }
        });
        chasisField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chasisFieldMousePressed(evt);
            }
        });
        chasisField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chasisFieldActionPerformed(evt);
            }
        });
        background.add(chasisField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 140, -1));

        patenteTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        patenteTxt.setForeground(new java.awt.Color(0, 0, 0));
        patenteTxt.setText("Patente");
        background.add(patenteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 70, 20));

        patenteField.setBackground(new java.awt.Color(255, 255, 255));
        patenteField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        patenteField.setForeground(new java.awt.Color(153, 153, 153));
        patenteField.setText("Ingresar patente");
        patenteField.setBorder(null);
        patenteField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                patenteFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                patenteFieldFocusLost(evt);
            }
        });
        patenteField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                patenteFieldMousePressed(evt);
            }
        });
        patenteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patenteFieldActionPerformed(evt);
            }
        });
        background.add(patenteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 130, -1));

        anioTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        anioTxt1.setForeground(new java.awt.Color(0, 0, 0));
        anioTxt1.setText("Año de fabricación");
        background.add(anioTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));

        anioField.setBackground(new java.awt.Color(255, 255, 255));
        anioField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        anioField.setForeground(new java.awt.Color(153, 153, 153));
        anioField.setText("Año");
        anioField.setBorder(null);
        anioField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                anioFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                anioFieldFocusLost(evt);
            }
        });
        anioField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                anioFieldMousePressed(evt);
            }
        });
        anioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioFieldActionPerformed(evt);
            }
        });
        background.add(anioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 70, 20));

        ejesTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ejesTxt.setForeground(new java.awt.Color(0, 0, 0));
        ejesTxt.setText("Cant. Ejes");
        background.add(ejesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 90, 20));

        ejesCmbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 ejes", "3 ejes", "4x4", "Más de 4" }));
        background.add(ejesCmbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 100, -1));

        tipoMotorTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoMotorTxt1.setForeground(new java.awt.Color(0, 0, 0));
        tipoMotorTxt1.setText("Tipo de motor");
        background.add(tipoMotorTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));

        eleccionMotorCmbox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0 - 1.5", "1.6 - 2.0", "2.0 - 3.0", "3.0 - 6.0", "Híbrido", "Eléctrico" }));
        eleccionMotorCmbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionMotorCmbox1ActionPerformed(evt);
            }
        });
        background.add(eleccionMotorCmbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 100, -1));

        separador.setForeground(new java.awt.Color(30, 30, 30));
        background.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 300, 10));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        background.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 150, 40));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        background.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirTxtMouseClicked

    private void salirTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirTxtMouseEntered
        salirBtn.setBackground(Color.red);
        salirTxt.setForeground(Color.red);
    }//GEN-LAST:event_salirTxtMouseEntered

    private void salirTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirTxtMouseExited
        salirBtn.setBackground(Color.white);
        salirTxt.setForeground(Color.black);
    }//GEN-LAST:event_salirTxtMouseExited

    private void salirTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirTxtMousePressed

    }//GEN-LAST:event_salirTxtMousePressed

    private void salirBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBtnMouseClicked

    }//GEN-LAST:event_salirBtnMouseClicked

    private void salirBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBtnMouseEntered

    }//GEN-LAST:event_salirBtnMouseEntered

    private void salirBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBtnMouseExited

    }//GEN-LAST:event_salirBtnMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked

    }//GEN-LAST:event_headerMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
      try {
        // Obtener los datos de los campos
        String marca = seleccionAuto1.getSelectedItem().toString();
        String modelo = modeloTxt.getText().trim();
        String nroChasis = chasisField.getText().trim();
        String patente = patenteTxt.getText().trim();
        
        // Verificar si los campos no están vacíos
        if (modelo.isEmpty() || nroChasis.isEmpty() || patente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Intentar obtener los valores numéricos de los campos
        int anioFabricacion;
        int cantEjes;
        
        try {
            anioFabricacion = Integer.parseInt(anioField.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El año de fabricación debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar y obtener el valor de cantidad de ejes desde el ComboBox
        String cantEjesStr = ejesCmbox.getSelectedItem().toString().trim().toLowerCase();
        System.out.println("Valor seleccionado en ejesCmbox: '" + cantEjesStr + "'");

        if (cantEjesStr.equalsIgnoreCase("2 ejes")) {
            cantEjes = 2;
        } else if (cantEjesStr.equalsIgnoreCase("3 ejes")) {
            cantEjes = 3;
        } else if (cantEjesStr.equalsIgnoreCase("4x4")) {
            cantEjes = 4;
        } else if (cantEjesStr.equalsIgnoreCase("más de 4")) {
            cantEjes = 5;
        } else {
            JOptionPane.showMessageDialog(this, "Cantidad de ejes no válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Devuelve el tipo de motor
        String tipoMotor = eleccionMotorCmbox1.getSelectedItem().toString();

        // Crea el objeto Vehiculo
        Vehiculo nuevoVehiculo = new Vehiculo(marca, modelo, nroChasis, patente, anioFabricacion, cantEjes, tipoMotor);

        // Crea una instancia de RegistrarAutomovil para registrar el vehículo
        RegistrarAutomovil registrar = new RegistrarAutomovil();
        registrar.registrarVehiculo(nuevoVehiculo); 

        // Muestra mensaje de éxito
        JOptionPane.showMessageDialog(this, "Inspección iniciada con éxito", "Registro", JOptionPane.INFORMATION_MESSAGE);

    } catch (HeadlessException e) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        modeloField.setText("Rellenar campo");
        modeloField.setForeground(Color.GRAY);
        chasisField.setText("Ingresar número");
        chasisField.setForeground(Color.GRAY);
        patenteField.setText("Ingresar patente");
        patenteField.setForeground(Color.GRAY);
        anioField.setText("Año");
        anioField.setForeground(Color.GRAY);
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void modeloFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_modeloFieldFocusGained
        if (modeloField.getText().equals("Rellenar campo")) {
            modeloField.setText("");
            modeloField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_modeloFieldFocusGained

    private void modeloFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_modeloFieldFocusLost
        if (modeloField.getText().isEmpty()) {
            modeloField.setText("Rellenar campo");
            modeloField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_modeloFieldFocusLost

    private void modeloFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeloFieldMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloFieldMousePressed

    private void modeloFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloFieldActionPerformed

    private void chasisFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chasisFieldFocusGained
        if (chasisField.getText().equals("Ingresar número")) {
            chasisField.setText("");
            chasisField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_chasisFieldFocusGained

    private void chasisFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chasisFieldFocusLost
        if (chasisField.getText().isEmpty()) {
            chasisField.setText("Ingresar número");
            chasisField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_chasisFieldFocusLost

    private void chasisFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chasisFieldMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chasisFieldMousePressed

    private void chasisFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chasisFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chasisFieldActionPerformed

    private void anioFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_anioFieldFocusGained
        if (anioField.getText().equals("Año")) {
            anioField.setText("");
            anioField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_anioFieldFocusGained

    private void anioFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_anioFieldFocusLost
        if (anioField.getText().isEmpty()) {
            anioField.setText("Año");
            anioField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_anioFieldFocusLost

    private void anioFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anioFieldMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioFieldMousePressed

    private void anioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioFieldActionPerformed

    private void patenteFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_patenteFieldFocusGained
        if (patenteField.getText().equals("Ingresar patente")) {
            patenteField.setText("");
            patenteField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_patenteFieldFocusGained

    private void patenteFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_patenteFieldFocusLost
        if (patenteField.getText().isEmpty()) {
            patenteField.setText("Ingresar patente");
            patenteField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_patenteFieldFocusLost

    private void patenteFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patenteFieldMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_patenteFieldMousePressed

    private void patenteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patenteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patenteFieldActionPerformed

    private void eleccionMotorCmbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionMotorCmbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eleccionMotorCmbox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioField;
    private javax.swing.JLabel anioTxt1;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField chasisField;
    private javax.swing.JLabel chasisTxt;
    private javax.swing.JComboBox<String> ejesCmbox;
    private javax.swing.JLabel ejesTxt;
    private javax.swing.JComboBox<String> eleccionMotorCmbox1;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel marcaTxt1;
    private javax.swing.JTextField modeloField;
    private javax.swing.JLabel modeloTxt;
    private javax.swing.JTextField patenteField;
    private javax.swing.JLabel patenteTxt;
    private javax.swing.JPanel salirBtn;
    private javax.swing.JLabel salirTxt;
    private javax.swing.JComboBox<String> seleccionAuto1;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel tipoMotorTxt1;
    // End of variables declaration//GEN-END:variables

    public void mostrarRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
