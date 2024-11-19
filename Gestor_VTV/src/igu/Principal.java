package igu;

import java.awt.Color;

public class Principal extends javax.swing.JFrame {

    int xMouse, yMouse ;
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        salirBtn = new javax.swing.JPanel();
        salirTxt = new javax.swing.JLabel();
        fondoVtv = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        inicio = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        separador = new javax.swing.JSeparator();
        separador1 = new javax.swing.JSeparator();
        nombre1 = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        btn = new javax.swing.JPanel();
        entrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
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

        fondoVtv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoVtv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/gestor.jpg"))); // NOI18N
        background.add(fondoVtv, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 230, 400));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 100));

        inicio.setBackground(new java.awt.Color(51, 51, 255));
        inicio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        inicio.setForeground(new java.awt.Color(0, 0, 0));
        inicio.setText("INICIAR SESIÓN");
        background.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 190, 40));

        contraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(0, 0, 0));
        contraseña.setText("CONTRASEÑA");
        background.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        userTxt.setBackground(new java.awt.Color(255, 255, 255));
        userTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(153, 153, 153));
        userTxt.setText("Ingrese su nombre");
        userTxt.setBorder(null);
        userTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userTxtFocusLost(evt);
            }
        });
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        background.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 190, -1));

        separador.setForeground(new java.awt.Color(0, 0, 0));
        background.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 223, 190, -1));

        separador1.setForeground(new java.awt.Color(0, 0, 0));
        background.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 303, 190, -1));

        nombre1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombre1.setForeground(new java.awt.Color(0, 0, 0));
        nombre1.setText("USUARIO");
        background.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        passTxt.setBackground(new java.awt.Color(255, 255, 255));
        passTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passTxt.setForeground(new java.awt.Color(153, 153, 153));
        passTxt.setText("********");
        passTxt.setToolTipText("");
        passTxt.setBorder(null);
        passTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passTxtFocusLost(evt);
            }
        });
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        background.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 190, 20));

        btn.setBackground(new java.awt.Color(47, 84, 102));

        entrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        entrar.setForeground(new java.awt.Color(255, 255, 255));
        entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrar.setText("ENTRAR");
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLayout = new javax.swing.GroupLayout(btn);
        btn.setLayout(btnLayout);
        btnLayout.setHorizontalGroup(
            btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        btnLayout.setVerticalGroup(
            btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void salirTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirTxtMousePressed

    }//GEN-LAST:event_salirTxtMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void salirBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBtnMouseClicked

    }//GEN-LAST:event_salirBtnMouseClicked

    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked

    }//GEN-LAST:event_headerMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void salirTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirTxtMouseClicked

    private void salirTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirTxtMouseEntered
        salirBtn.setBackground(Color.red);
        salirTxt.setForeground(Color.red);
    }//GEN-LAST:event_salirTxtMouseEntered

    private void salirBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBtnMouseEntered

    }//GEN-LAST:event_salirBtnMouseEntered

    private void salirTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirTxtMouseExited
        salirBtn.setBackground(Color.white);
        salirTxt.setForeground(Color.black);
    }//GEN-LAST:event_salirTxtMouseExited

    private void salirBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBtnMouseExited

    }//GEN-LAST:event_salirBtnMouseExited

    private void entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseEntered
        btn.setBackground(new Color(50, 120, 120));
    }//GEN-LAST:event_entrarMouseEntered

    private void entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseExited
        btn.setBackground(new Color(47, 84, 102));
    }//GEN-LAST:event_entrarMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("********")) { 
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()) { 
            userTxt.setText("Ingrese su nombre");
            userTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Intento de inicio con los siguientes datos:\nUsuario: " + userTxt.getText() + "\nContraseña: " + String.valueOf(passTxt.getPassword()), "INICIO DE SESIÓN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        // Crear instancia de Gestor y hacerla visible
        Gestor gestor = new Gestor();
        gestor.setVisible(true);

        // Ocultar la ventana de Principal
        this.setVisible(false);
        
    }//GEN-LAST:event_entrarMouseClicked

    private void userTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTxtFocusGained
         if (userTxt.getText().equals("Ingrese su nombre")) {
             userTxt.setText("");
             userTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_userTxtFocusGained

    private void passTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTxtFocusGained
         if (new String(passTxt.getPassword()).equals("********")) { 
             passTxt.setText(""); 
             passTxt.setEchoChar('●'); 
             passTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_passTxtFocusGained

    private void userTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTxtFocusLost
         if (userTxt.getText().isEmpty()) {
             userTxt.setText("Ingrese su nombre");
             userTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxtFocusLost

    private void passTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTxtFocusLost
         if (new String(passTxt.getPassword()).isEmpty()) { 
             passTxt.setText("********"); 
             passTxt.setEchoChar((char) 0); 
             passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passTxtFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btn;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel entrar;
    private javax.swing.JLabel fondoVtv;
    private javax.swing.JPanel header;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombre1;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JPanel salirBtn;
    private javax.swing.JLabel salirTxt;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separador1;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
