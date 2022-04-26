package Vista_Control;

import Modelo.EcuacionCuadratica;
import Modelo.Excepciones.A_Igual_A_Cero_Exception;
import Modelo.Excepciones.Discriminante_Exception;
import Modelo.Serializador;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class IGU_EcuacionCuadratica extends javax.swing.JFrame {

    public IGU_EcuacionCuadratica() {
        initComponents();
        serializador = new Serializador();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        PanelEcuacion = new javax.swing.JPanel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        lblx2 = new javax.swing.JLabel();
        lblx = new javax.swing.JLabel();
        lbl0 = new javax.swing.JLabel();
        btnResolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        PanelResultado = new javax.swing.JPanel();
        lblX1 = new javax.swing.JLabel();
        lblX2 = new javax.swing.JLabel();
        lblResX1 = new javax.swing.JLabel();
        lblResX2 = new javax.swing.JLabel();
        mnubMenuPrincipal = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuiAbrir = new javax.swing.JMenuItem();
        mnuiGuardar = new javax.swing.JMenuItem();
        mnuiSalir = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuiAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ecuación Cuadratica");

        PanelEcuacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Ecuación:"));

        txtA.setBorder(javax.swing.BorderFactory.createTitledBorder("A:"));

        txtB.setBorder(javax.swing.BorderFactory.createTitledBorder("B:"));

        txtC.setBorder(javax.swing.BorderFactory.createTitledBorder("C:"));

        lblx2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblx2.setText("X^2 +");

        lblx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblx.setText("X +");

        lbl0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl0.setText("= 0");

        btnResolver.setText("Resolver");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEcuacionLayout = new javax.swing.GroupLayout(PanelEcuacion);
        PanelEcuacion.setLayout(PanelEcuacionLayout);
        PanelEcuacionLayout.setHorizontalGroup(
            PanelEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEcuacionLayout.createSequentialGroup()
                .addGroup(PanelEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEcuacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblx2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblx)
                        .addGap(18, 18, 18)
                        .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl0))
                    .addGroup(PanelEcuacionLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnLimpiar)
                        .addGap(63, 63, 63)
                        .addComponent(btnResolver)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PanelEcuacionLayout.setVerticalGroup(
            PanelEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEcuacionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PanelEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblx2)
                    .addComponent(lblx)
                    .addComponent(lbl0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(PanelEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResolver)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        PanelResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado:"));

        lblX1.setText("X1 = ");

        lblX2.setText("X2 = ");

        javax.swing.GroupLayout PanelResultadoLayout = new javax.swing.GroupLayout(PanelResultado);
        PanelResultado.setLayout(PanelResultadoLayout);
        PanelResultadoLayout.setHorizontalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelResultadoLayout.createSequentialGroup()
                        .addComponent(lblX1)
                        .addGap(18, 18, 18)
                        .addComponent(lblResX1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelResultadoLayout.createSequentialGroup()
                        .addComponent(lblX2)
                        .addGap(18, 18, 18)
                        .addComponent(lblResX2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelResultadoLayout.setVerticalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblX1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResX1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblX2)
                    .addComponent(lblResX2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        mnuArchivo.setText("Archivo");

        mnuiAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnuiAbrir.setText("Abrir...");
        mnuiAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiAbrirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuiAbrir);

        mnuiGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        mnuiGuardar.setText("Guardar");
        mnuiGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiGuardarActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuiGuardar);

        mnuiSalir.setText("Salir");
        mnuiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuiSalir);

        mnubMenuPrincipal.add(mnuArchivo);

        mnuAyuda.setText("Ayuda");

        mnuiAcercaDe.setText("Acerca de...");
        mnuAyuda.add(mnuiAcercaDe);

        mnubMenuPrincipal.add(mnuAyuda);

        setJMenuBar(mnubMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelResultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PanelEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuiSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txtA.setText("");
        this.txtB.setText("");
        this.txtC.setText("");
        this.lblResX1.setText("");
        this.lblResX2.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        this.lblResX1.setText("");
        this.lblResX2.setText("");
        if (!this.txtA.getText().equals("") && !this.txtB.getText().equals("") && !this.txtC.getText().equals("")) {
            try {
                double a, b, c;
                a = Double.parseDouble(this.txtA.getText());
                b = Double.parseDouble(this.txtB.getText());
                c = Double.parseDouble(this.txtC.getText());
                ecuacion = new EcuacionCuadratica(a, b, c);
                ecuacion.Resolver();
            } catch (A_Igual_A_Cero_Exception ex) {
                this.txtA.setToolTipText("Este valor debe ser distinto de cero.");
            } catch (Discriminante_Exception ex) {
                this.PanelEcuacion.setToolTipText("Esta ecuación no tiene raices reales. Por favor, vuelva a escribir los coeficientes de la ecuación.");
            }
            this.lblResX1.setText(String.valueOf(ecuacion.getX1()));
            this.lblResX2.setText(String.valueOf(ecuacion.getX2()));
        }
    }//GEN-LAST:event_btnResolverActionPerformed

    private void mnuiAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiAbrirActionPerformed
        final JFileChooser fc = new JFileChooser(); 
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            JOptionPane.showMessageDialog(fc, "Archivo: "+file.getName()+"\nAbierto","Archivo abierto",JOptionPane.INFORMATION_MESSAGE);
            nombreDelArchivo = file.getName();
            ecuacion = serializador.LeerObjeto(nombreDelArchivo);
        } else {
            JOptionPane.showMessageDialog(fc, "Cancelado","Cancelar",JOptionPane.INFORMATION_MESSAGE);
        }
        this.txtA.setText(String.valueOf(ecuacion.getA()));
        this.txtB.setText(String.valueOf(ecuacion.getB()));
        this.txtC.setText(String.valueOf(ecuacion.getC()));
//        this.lblResX1.setText(String.valueOf(ecuacion.getX1()));
//        this.lblResX2.setText(String.valueOf(ecuacion.getX2()));
    }//GEN-LAST:event_mnuiAbrirActionPerformed

    private void mnuiGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiGuardarActionPerformed
        if(ecuacion!=null){
            nombreDelArchivo = JOptionPane.showInputDialog(this, "Escriba el nombre del archivo", "Guardar archivo", JOptionPane.QUESTION_MESSAGE);
            serializador.GuardarObjeto(ecuacion, nombreDelArchivo);
            JOptionPane.showMessageDialog(this, "La ecuación ha sido guardada");
        }
    }//GEN-LAST:event_mnuiGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(IGU_EcuacionCuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IGU_EcuacionCuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IGU_EcuacionCuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IGU_EcuacionCuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IGU_EcuacionCuadratica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelEcuacion;
    private javax.swing.JPanel PanelResultado;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnResolver;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel lbl0;
    private javax.swing.JLabel lblResX1;
    private javax.swing.JLabel lblResX2;
    private javax.swing.JLabel lblX1;
    private javax.swing.JLabel lblX2;
    private javax.swing.JLabel lblx;
    private javax.swing.JLabel lblx2;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuBar mnubMenuPrincipal;
    private javax.swing.JMenuItem mnuiAbrir;
    private javax.swing.JMenuItem mnuiAcercaDe;
    private javax.swing.JMenuItem mnuiGuardar;
    private javax.swing.JMenuItem mnuiSalir;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    // End of variables declaration//GEN-END:variables
    EcuacionCuadratica ecuacion = null;
    Serializador serializador = null;
    String nombreDelArchivo = null;
}
