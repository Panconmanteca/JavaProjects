package igu;

import Usos.RegistrarAutomovil;
import com.gestor.model.Usuario;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {
        int xMouse, yMouse ;

    public Registro() {
        initComponents();
        setTitle("Gestor");
        setSize(580, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel mensaje = new JLabel("Bienvenido al Gestor");
        mensaje.setBounds(130, 130, 200, 30);
        add(mensaje);
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
        nombre = new javax.swing.JLabel();
        nombreTxt1 = new javax.swing.JTextField();
        apellido3 = new javax.swing.JLabel();
        apellidoTxt = new javax.swing.JTextField();
        tipoDocumento = new javax.swing.JLabel();
        seleccionDoc = new javax.swing.JComboBox<>();
        numeroDocTxt = new javax.swing.JTextField();
        datosAdicionales = new javax.swing.JLabel();
        adicional = new javax.swing.JScrollPane();
        areaTxt = new javax.swing.JTextArea();
        telefonoTxt = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        btnContinuar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(580, 400));
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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/centro (1).jpeg"))); // NOI18N
        fondo.setText("jLabel1");
        background.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 210, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo.png"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 100));

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("Nombre:");
        background.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, 20));

        nombreTxt1.setBackground(new java.awt.Color(255, 255, 255));
        nombreTxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreTxt1.setForeground(new java.awt.Color(153, 153, 153));
        nombreTxt1.setText("Ingrese su nombre");
        nombreTxt1.setBorder(null);
        nombreTxt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreTxt1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreTxt1FocusLost(evt);
            }
        });
        nombreTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreTxt1MousePressed(evt);
            }
        });
        nombreTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxt1ActionPerformed(evt);
            }
        });
        background.add(nombreTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 120, -1));

        apellido3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apellido3.setForeground(new java.awt.Color(0, 0, 0));
        apellido3.setText("Apellido:");
        background.add(apellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 20));

        apellidoTxt.setBackground(new java.awt.Color(255, 255, 255));
        apellidoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apellidoTxt.setForeground(new java.awt.Color(153, 153, 153));
        apellidoTxt.setText("Ingrese su apellido");
        apellidoTxt.setBorder(null);
        apellidoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apellidoTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidoTxtFocusLost(evt);
            }
        });
        apellidoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidoTxtMousePressed(evt);
            }
        });
        apellidoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTxtActionPerformed(evt);
            }
        });
        background.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 120, -1));

        tipoDocumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipoDocumento.setForeground(new java.awt.Color(0, 0, 0));
        tipoDocumento.setText("Tipo documento:");
        background.add(tipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 20));

        seleccionDoc.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        seleccionDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D.N.I", "PASAPORTE", "OTRO" }));
        background.add(seleccionDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        numeroDocTxt.setBackground(new java.awt.Color(255, 255, 255));
        numeroDocTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numeroDocTxt.setForeground(new java.awt.Color(153, 153, 153));
        numeroDocTxt.setText("Número");
        numeroDocTxt.setBorder(null);
        numeroDocTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numeroDocTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numeroDocTxtFocusLost(evt);
            }
        });
        numeroDocTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                numeroDocTxtMousePressed(evt);
            }
        });
        numeroDocTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroDocTxtActionPerformed(evt);
            }
        });
        background.add(numeroDocTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 100, 20));

        datosAdicionales.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        datosAdicionales.setForeground(new java.awt.Color(0, 0, 0));
        datosAdicionales.setText("Datos adicionales (contacto):");
        background.add(datosAdicionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, 20));

        areaTxt.setColumns(20);
        areaTxt.setRows(5);
        adicional.setViewportView(areaTxt);

        background.add(adicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 210, 240, -1));

        telefonoTxt.setBackground(new java.awt.Color(255, 255, 255));
        telefonoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telefonoTxt.setForeground(new java.awt.Color(153, 153, 153));
        telefonoTxt.setText("Teléfono");
        telefonoTxt.setBorder(null);
        telefonoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefonoTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonoTxtFocusLost(evt);
            }
        });
        telefonoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                telefonoTxtMousePressed(evt);
            }
        });
        telefonoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoTxtActionPerformed(evt);
            }
        });
        background.add(telefonoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 120, -1));

        telefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telefono.setForeground(new java.awt.Color(0, 0, 0));
        telefono.setText("TEL:");
        background.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 50, 20));

        separador.setForeground(new java.awt.Color(30, 30, 30));
        background.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 300, 10));

        btnContinuar.setText("CONTINUAR");
        btnContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContinuarMouseClicked(evt);
            }
        });
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        background.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 150, 40));

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
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoMouseClicked

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

    private void telefonoTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoTxtFocusGained
        if (telefonoTxt.getText().equals("Teléfono")) {
            telefonoTxt.setText("");
            telefonoTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_telefonoTxtFocusGained

    private void telefonoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoTxtFocusLost
        if (telefonoTxt.getText().isEmpty()) {
            telefonoTxt.setText("Teléfono");
            telefonoTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_telefonoTxtFocusLost

    private void telefonoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoTxtMousePressed

    }//GEN-LAST:event_telefonoTxtMousePressed

    private void telefonoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoTxtActionPerformed

    private void nombreTxt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTxt1FocusGained
        if (nombreTxt1.getText().equals("Ingrese su nombre")) {
            nombreTxt1.setText("");
            nombreTxt1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nombreTxt1FocusGained

    private void nombreTxt1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTxt1FocusLost
        if (nombreTxt1.getText().isEmpty()) {
            nombreTxt1.setText("Ingrese su nombre");
            nombreTxt1.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_nombreTxt1FocusLost

    private void nombreTxt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTxt1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxt1MousePressed

    private void nombreTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxt1ActionPerformed

    private void numeroDocTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroDocTxtFocusGained
        if (numeroDocTxt.getText().equals("Número")) {
            numeroDocTxt.setText("");
            numeroDocTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_numeroDocTxtFocusGained

    private void numeroDocTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroDocTxtFocusLost
        if (numeroDocTxt.getText().isEmpty()) {
            numeroDocTxt.setText("Número");
            numeroDocTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_numeroDocTxtFocusLost

    private void numeroDocTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numeroDocTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroDocTxtMousePressed

    private void numeroDocTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroDocTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroDocTxtActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        nombreTxt1.setText("Ingrese su nombre");
        nombreTxt1.setForeground(Color.GRAY);
        apellidoTxt.setText("Ingrese su apellido");
        apellidoTxt.setForeground(Color.GRAY);
        telefonoTxt.setText("Teléfono");
        telefonoTxt.setForeground(Color.GRAY);
        numeroDocTxt.setText("Número");
        numeroDocTxt.setForeground(Color.GRAY);
        areaTxt.setText("");
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseClicked
    // Obtener los datos de los JTextField
    String nombre = nombreTxt1.getText();
    String apellido = apellidoTxt.getText();
    String numeroDoc = numeroDocTxt.getText();  // Campo para el número de documento
    String telefono = telefonoTxt.getText(); // Campo para el teléfono

    // Crear el objeto Usuario con los datos recogidos
    Usuario nuevoUsuario = new Usuario(nombre, apellido, numeroDoc, telefono);

    // Crear una instancia de RegistrarAutomovil para registrar al usuario
    RegistrarAutomovil registrar = new RegistrarAutomovil();
    registrar.registrarUsuario(nuevoUsuario);

    // Mostrar mensaje de confirmación
    JOptionPane.showMessageDialog(this, "Usuario registrado correctamente.");

    // Abrir la ventana RegistroAutomovil y pasarle el usuario
    RegistroAutomovil ventanaRegistroAutomovil = new RegistroAutomovil(nuevoUsuario);
    ventanaRegistroAutomovil.setVisible(true);

    // Cerrar la ventana actual (Registro)
    this.setVisible(false);   
    }//GEN-LAST:event_btnContinuarMouseClicked

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void apellidoTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoTxtFocusGained
        if (apellidoTxt.getText().equals("Ingrese su apellido")) {
            apellidoTxt.setText("");
            apellidoTxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_apellidoTxtFocusGained

    private void apellidoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoTxtFocusLost
        if (apellidoTxt.getText().isEmpty()) {
            apellidoTxt.setText("Ingrese su apellido");
            apellidoTxt.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_apellidoTxtFocusLost

    private void apellidoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTxtMousePressed

    private void apellidoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane adicional;
    private javax.swing.JLabel apellido3;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JTextArea areaTxt;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel datosAdicionales;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreTxt1;
    private javax.swing.JTextField numeroDocTxt;
    private javax.swing.JPanel salirBtn;
    private javax.swing.JLabel salirTxt;
    private javax.swing.JComboBox<String> seleccionDoc;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField telefonoTxt;
    private javax.swing.JLabel tipoDocumento;
    // End of variables declaration//GEN-END:variables
}
