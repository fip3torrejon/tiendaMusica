/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author felip
 */

import controlador.*;
import modelo.*;
import javax.swing.*;
import excepcion.*;
import java.awt.Color;


public class Agregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    
    RegistroInstrumento registro;
    
    public Agregar(RegistroInstrumento reg) {
        initComponents();
        this.registro = reg;
        jComboGuitarra.setEnabled(false);
        jCheckPiano.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupInstrumento = new javax.swing.ButtonGroup();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jRadioGuitarra = new javax.swing.JRadioButton();
        jRadioPiano = new javax.swing.JRadioButton();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelStock = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextStock = new javax.swing.JTextField();
        jCheckPiano = new javax.swing.JCheckBox();
        jComboGuitarra = new javax.swing.JComboBox<>();
        jButtonSalir1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar");
        setLocation(new java.awt.Point(30, 30));
        setName("jFrameAgregar"); // NOI18N
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setText("Agregar Instrumento");

        jButtonSalir.setText("SALIR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        buttonGroupInstrumento.add(jRadioGuitarra);
        jRadioGuitarra.setText("Guitarra");
        jRadioGuitarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGuitarraActionPerformed(evt);
            }
        });

        buttonGroupInstrumento.add(jRadioPiano);
        jRadioPiano.setText("Piano");
        jRadioPiano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPianoActionPerformed(evt);
            }
        });

        jLabelCodigo.setText("Código");

        jLabelNombre.setText("Nombre Producto");

        jLabelStock.setText("Stock");

        jCheckPiano.setText("de Cola");
        jCheckPiano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckPianoActionPerformed(evt);
            }
        });

        jComboGuitarra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccionar --", "acústica", "eléctrica", "electroacústica" }));

        jButtonSalir1.setText("Agregar");
        jButtonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalir1ActionPerformed(evt);
            }
        });

        jTextResultado.setEditable(false);
        jTextResultado.setColumns(20);
        jTextResultado.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jTextResultado.setRows(5);
        jScrollPane1.setViewportView(jTextResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNombre)
                                            .addComponent(jLabelCodigo)
                                            .addComponent(jLabelStock))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextStock)
                                            .addComponent(jTextNombre)
                                            .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioGuitarra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboGuitarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioPiano)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckPiano)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSalir1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jButtonSalir))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButtonSalir1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioGuitarra)
                            .addComponent(jComboGuitarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioPiano)
                            .addComponent(jCheckPiano))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCodigo)
                            .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStock))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioPianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPianoActionPerformed
        jCheckPiano.setEnabled(true);
        jComboGuitarra.setEnabled(false);
    }//GEN-LAST:event_jRadioPianoActionPerformed

    private void jCheckPianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckPianoActionPerformed
        
    }//GEN-LAST:event_jCheckPianoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        new Inicio(registro).setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jRadioGuitarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGuitarraActionPerformed
        jCheckPiano.setEnabled(false);
        jComboGuitarra.setEnabled(true);
    }//GEN-LAST:event_jRadioGuitarraActionPerformed

    private void jButtonSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalir1ActionPerformed
        try {
            
            if(!jRadioGuitarra.isSelected() && !jRadioPiano.isSelected()){
                JOptionPane.showMessageDialog(this, "Elige un tipo de instrumento");
                throw new NullPointerException("tipo de instrumento no elegido");
            } else if(jTextCodigo.getText().trim().length() != 4 ){
                throw new ExcCodigo();
            } else if(jTextNombre.getText().trim().length() < 2 ){
                throw new ExcNombre();
            } else if(Integer.parseInt(jTextStock.getText().trim()) < 0 ){
                throw new ExcStock();
            }
            
            if(jRadioGuitarra.isSelected()){
                Guitarra guitarra = new Guitarra();
                guitarra.setCodigo(Integer.parseInt(jTextCodigo.getText().trim()));
                guitarra.setNombre(jTextNombre.getText().trim());
                guitarra.setStock(Integer.parseInt(jTextStock.getText().trim()));
                switch (jComboGuitarra.getSelectedIndex()){
                    case 1:
                        guitarra.setTipoGuitarra("acústica");
                        break;
                    case 2:
                        guitarra.setTipoGuitarra("eléctrica");
                        break;
                    case 3:
                        guitarra.setTipoGuitarra("electroacústica");
                        break;
                    default:
                        System.out.println("error en tipo de guitarra");
                        throw new NullPointerException("tipo de guitarra no elegido");
                }
                jComboGuitarra.setForeground(Color.black);
                if(registro.agregar(guitarra)){
                    jTextResultado.setText(registro.listar());
                } else {
                    jTextResultado.setText("Código ya existe\n--\n" + registro.listar());
                }

            } else if (jRadioPiano.isSelected()){
                Piano piano = new Piano();
                piano.setCodigo(Integer.parseInt(jTextCodigo.getText().trim()));
                piano.setNombre(jTextNombre.getText().trim());
                piano.setStock(Integer.parseInt(jTextStock.getText().trim()));
                piano.setDeCola(jCheckPiano.isSelected());
                if(registro.agregar(piano)){
                    jTextResultado.setText(registro.listar());
                } else {
                    jTextResultado.setText("Código ya existe\n--\n" + registro.listar());
                }
            } 
            
        } catch (NullPointerException np) {
            System.out.println("Excepcion null " + np.getMessage());
            JOptionPane.showMessageDialog(this, "Recuerda ingresar todas las opciones");
        } catch (ExcCodigo ec){
            System.out.println("Excepcion formato de numero " + ec.getMessage());
            JOptionPane.showMessageDialog(this, "El código debe tener 4 digitos");
        } catch (ExcNombre en){
            System.out.println("Excepcion formato de nombre " + en.getMessage());
            JOptionPane.showMessageDialog(this, "El nombre debe tener 2 caracteres al menos");
        } catch (ExcStock es){
            System.out.println("Excepcion en stock " + es.getMessage());
            JOptionPane.showMessageDialog(this, "El stock debe ser mayor o igual que 0 (cero)");
        } catch (IllegalArgumentException ia) {
            System.out.println("Excepcion invalid argument " + ia.getMessage());
            JOptionPane.showMessageDialog(this, "El campo codigo y stock deben ser numéricos");
        }
    }//GEN-LAST:event_jButtonSalir1ActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
         */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupInstrumento;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSalir1;
    private javax.swing.JCheckBox jCheckPiano;
    private javax.swing.JComboBox<String> jComboGuitarra;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JRadioButton jRadioGuitarra;
    private javax.swing.JRadioButton jRadioPiano;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextArea jTextResultado;
    private javax.swing.JTextField jTextStock;
    // End of variables declaration//GEN-END:variables
}
