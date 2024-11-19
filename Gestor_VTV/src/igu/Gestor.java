package igu;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gestor extends javax.swing.JFrame {

    int xMouse, yMouse ;
    
    public Gestor() {
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
        btnRegistro = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        inicio = new javax.swing.JLabel();

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
            .addComponent(salirTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        btnRegistro.setText("REGISTRAR");
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroMouseClicked(evt);
            }
        });
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        background.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, 40));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        background.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 150, 40));

        inicio.setBackground(new java.awt.Color(51, 51, 255));
        inicio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        inicio.setForeground(new java.awt.Color(0, 0, 0));
        inicio.setText("GESTOR");
        background.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 100, 40));

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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Se está por cerrar el programa. Gracias por su uso", "Información", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseClicked
        Registro registro = new Registro();
        registro.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistroMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel salirBtn;
    private javax.swing.JLabel salirTxt;
    // End of variables declaration//GEN-END:variables
}
