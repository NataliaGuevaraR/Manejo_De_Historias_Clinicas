
package Interfaz;

import Logic.AdministrarCitas;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SolicitarCita extends javax.swing.JFrame {

    public SolicitarCita() {
        initComponents();
        this.setLocationRelativeTo(this);
        SetImageLabel(fondo,"src/Imagenes/imagenes/fondo.jpg");
        SetImageBoton(regresar,"src/Imagenes/imagenes/flecha2.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Nombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Documento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        Especialidad = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        enviar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Citas Online Fácil y Rápido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel1.setText("Nombres y Apellidos*:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        getContentPane().add(Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, -1));

        jLabel3.setText("Tipo de Documento*:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula de Ciudadanía", "Tarjeta de Identidad", "Cédula de Extranjería", "DNI", "Pasaporte" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, -1));

        jLabel4.setText("No. de Documento*:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));
        getContentPane().add(Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, -1));

        jLabel5.setText("Correo Electrónico*:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        getContentPane().add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 170, -1));

        jLabel6.setText("Teléfono Fijo o Celular*:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        getContentPane().add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, -1));

        Especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicina General", "Pediatría", "Optalmología", "Cardiología", " " }));
        getContentPane().add(Especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel7.setText("Especialidad*:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        getContentPane().add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 30, 30));
        getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 170, 20));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 170, 20));

        fondo.setBackground(new java.awt.Color(153, 255, 153));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_DEFAULT)
        );
        labelName.setIcon(icon);
        this.repaint();

    }
    
    public void SetImageBoton(JButton buttonName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(buttonName.getWidth(), buttonName.getHeight(),Image.SCALE_DEFAULT)
        );
        buttonName.setIcon(icon);
        this.repaint();
    }
    
    
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        if(Nombres.getText().equals("")||Documento.getText().equals("")||Correo.getText().equals("")||Telefono.getText().equals("")){
            status.setText("Hay campos vacíos.");
        }else{
            String aux = Especialidad.getSelectedItem().toString();
            AdministrarCitas.crearCita(Nombres.getText(), Documento.getText(), aux);
            Nombres.setText("");
            Documento.setText("");
            Especialidad.setSelectedItem("Medicina General");
            Correo.setText("");
            Telefono.setText("");
            
            this.dispose();
            ConfirmacionDeCita confirmacion = new ConfirmacionDeCita();
            confirmacion.setVisible(true);
            
        }
    }//GEN-LAST:event_enviarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
        Paciente paciente = new Paciente();
        paciente.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SolicitarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolicitarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Documento;
    private javax.swing.JComboBox<String> Especialidad;
    private javax.swing.JTextField Nombres;
    private javax.swing.JTextField Telefono;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel mensaje;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
