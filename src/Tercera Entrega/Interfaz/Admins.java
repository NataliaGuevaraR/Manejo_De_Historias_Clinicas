
package Interfaz;

import Logic.logica;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import Logic.Usuario;

public class Admins extends javax.swing.JFrame {

    public Admins() {
        initComponents();
        this.setLocationRelativeTo(this);
        SetImageLabel(fondo,"src/Imagenes/imagenes/fondo2.jpg");
        SetImageBoton(regresar,"src/Imagenes/imagenes/flecha2.png");
    }
        Usuario usuarioEncontrado;

    @SuppressWarnings("unchecked")
    
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
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contraseña = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rol = new javax.swing.JComboBox<>();
        Registrar = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        buscar = new javax.swing.JToggleButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Menú de Administrador ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 140, -1));

        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 140, -1));

        jLabel4.setText("Rol:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paciente", "Doctor", "Administrador" }));
        rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolActionPerformed(evt);
            }
        });
        getContentPane().add(rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 140, -1));

        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jLabel7.setText("Ingrese la cédula:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        getContentPane().add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 140, -1));

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 40, 40));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 140, 20));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -2, 390, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed

        if(usuario.getText().equals("") || contraseña.getText().equals("")){
            status.setText("Hay campos vacios.");
        } else{
            String aux = rol.getSelectedItem().toString();
            logica.crearUsuario(usuario.getText(), contraseña.getText(), aux);
            usuario.setText("");
            contraseña.setText("");
            rol.setSelectedItem("Paciente");
            status.setText("Registro Exitoso.");

        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        String user = busqueda.getText();
        usuarioEncontrado = logica.buscarUsuario(user);
        if(usuarioEncontrado!=null){
            usuario.setText(usuarioEncontrado.getNombre());
            contraseña.setText(usuarioEncontrado.getContrasena());
            rol.setSelectedItem(usuarioEncontrado.getRol());
        }else{
            JOptionPane.showMessageDialog(this, "Usuario no encontrado");
        }

    }//GEN-LAST:event_buscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        if(usuarioEncontrado!=null){

            usuarioEncontrado.setNombre(usuario.getText());
            usuarioEncontrado.setContrasena(contraseña.getText());
            usuarioEncontrado.setRol(rol.getSelectedItem().toString());
            logica.guardarUsuariosEnArchivo();
            status.setText("Modificación Exitosa.");
            usuario.setText("");
            contraseña.setText("");
            busqueda.setText("");
            rol.setSelectedItem("Paciente");
        } else{
            JOptionPane.showMessageDialog(this, "Usuario no encontrado");
        }

    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(usuarioEncontrado!=null){
            logica.eliminarUsuario(usuarioEncontrado);
            logica.guardarUsuariosEnArchivo();
            status.setText("Modificación Exitosa.");
            usuario.setText("");
            contraseña.setText("");
            rol.setSelectedItem("Paciente");
        } else{
            JOptionPane.showMessageDialog(this, "Usuario no encontrado");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
        Login log = new Login();
        log.setVisible(true);
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
            java.util.logging.Logger.getLogger(Admins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Registrar;
    private javax.swing.JToggleButton buscar;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField contraseña;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton modificar;
    private javax.swing.JButton regresar;
    private javax.swing.JComboBox<String> rol;
    private javax.swing.JLabel status;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}