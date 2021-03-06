import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IsidroAntonio
 */
public class VentanaMatriz extends javax.swing.JFrame {
public DefaultTableModel Matriz;
public DefaultTableModel NuevaM;
public MatrizEntero MatrizCua;
public boolean realizarOperaciones;
    /**
     * Creates new form VentanaMatriz
     */
    public VentanaMatriz() {
        initComponents();
        setLocationRelativeTo(this);
        this.setTitle("Matriz Cuadrada");
        Matriz=(DefaultTableModel)tblMatriz.getModel();
        NuevaM=(DefaultTableModel)tblNuevaM.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        txtTam = new javax.swing.JTextField();
        txtRen = new javax.swing.JTextField();
        btnInicializar = new javax.swing.JButton();
        txtCol = new javax.swing.JTextField();
        lblRen = new javax.swing.JLabel();
        lblTam = new javax.swing.JLabel();
        lblCol = new javax.swing.JLabel();
        btnSumaRen = new javax.swing.JButton();
        btnSumaCol = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNuevaM = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblMatrizOriginal = new javax.swing.JLabel();
        btnInvertir = new javax.swing.JButton();
        txtCol2 = new javax.swing.JTextField();
        txtRen2 = new javax.swing.JTextField();
        btnInterRen = new javax.swing.JButton();
        btnInterCol = new javax.swing.JButton();
        btnDupRen = new javax.swing.JButton();
        btnDupCol = new javax.swing.JButton();
        btnSumarMatriz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatriz);

        txtRen.setText("Renglon 1");
        txtRen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRenFocusGained(evt);
            }
        });

        btnInicializar.setText("Inicializar");
        btnInicializar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicializarActionPerformed(evt);
            }
        });

        txtCol.setText("Columna 1");
        txtCol.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtColFocusGained(evt);
            }
        });

        lblRen.setText("Renglones");

        lblTam.setText("Tama??o Matriz");

        lblCol.setText("Columnas");

        btnSumaRen.setText("Suma renglon");
        btnSumaRen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaRenActionPerformed(evt);
            }
        });

        btnSumaCol.setText("Suma columnas");
        btnSumaCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaColActionPerformed(evt);
            }
        });

        tblNuevaM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblNuevaM);

        jLabel1.setText("Nueva Matriz");

        lblMatrizOriginal.setText("Matriz original");

        btnInvertir.setText("Invertir");
        btnInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirActionPerformed(evt);
            }
        });

        txtCol2.setText("Columna 2");
        txtCol2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCol2FocusGained(evt);
            }
        });

        txtRen2.setText("Renglon 2");
        txtRen2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRen2FocusGained(evt);
            }
        });

        btnInterRen.setText("Intercambio Ren");
        btnInterRen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterRenActionPerformed(evt);
            }
        });

        btnInterCol.setText("Intercambio Col");
        btnInterCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterColActionPerformed(evt);
            }
        });

        btnDupRen.setText("Duplicar Renglon");
        btnDupRen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDupRenActionPerformed(evt);
            }
        });

        btnDupCol.setText("Duplicar Columna");
        btnDupCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDupColActionPerformed(evt);
            }
        });

        btnSumarMatriz.setText("Sumar Matriz");
        btnSumarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarMatrizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTam, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(txtRen))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnInicializar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnInvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSumarMatriz))
                                    .addComponent(txtRen2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblRen)
                            .addComponent(lblTam)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCol2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSumaRen)
                                            .addComponent(lblCol))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnInterRen, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSumaCol)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnInterCol, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDupCol)
                                    .addComponent(btnDupRen))))
                        .addGap(255, 386, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblMatrizOriginal)
                                .addGap(169, 169, 169)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(47, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(226, 226, 226))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTam)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicializar)
                    .addComponent(btnInvertir)
                    .addComponent(btnSumarMatriz))
                .addGap(18, 18, 18)
                .addComponent(lblRen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSumaRen)
                    .addComponent(btnInterRen)
                    .addComponent(btnDupRen))
                .addGap(29, 29, 29)
                .addComponent(lblCol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSumaCol)
                    .addComponent(btnInterCol)
                    .addComponent(btnDupCol))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatrizOriginal)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicializarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicializarActionPerformed
        int cua;
        try {
            cua = Integer.parseInt(txtTam.getText());
            MatrizCua = new MatrizEntero(cua);
        } catch (NumberFormatException e) {
            showMessageDialog(this, "Ingresa un numero");
            return;
        }
        realizarOperaciones=true;
        MostrarMatriz(Matriz,MatrizCua.getMatriz());
        
    }//GEN-LAST:event_btnInicializarActionPerformed

    private void btnSumaRenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaRenActionPerformed
     if(realizarOperaciones){
         int ren;
         try {
                ren=Integer.parseInt(txtRen.getText());
                int resSumaRen=MatrizCua.sumarValoresRenglon(ren-1);
                showMessageDialog(this,"La suma de los valores del renglon "+ren+" es : "+resSumaRen);
          }catch (NumberFormatException e){
              showMessageDialog(this, "Ingresa el numero del renglon que deseas sumar");
          }
     }else  showMessageDialog(this,"No es posible realizar la operacion, primero genera una matriz");
    }//GEN-LAST:event_btnSumaRenActionPerformed

    private void btnSumaColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaColActionPerformed
       if(realizarOperaciones){
         int col;
         try {
                col=Integer.parseInt(txtCol.getText());
                int resSumaCol=MatrizCua.sumarValoresColumna(col-1);
                showMessageDialog(this,"La suma de los valores de la columna "+col+" es : "+resSumaCol);
          }catch (NumberFormatException e){
              showMessageDialog(this, "Ingresa el numero de la columna que deseas sumar");
          }
     }else   showMessageDialog(this,"No es posible realizar la operacion, primero genera una matriz");
    }//GEN-LAST:event_btnSumaColActionPerformed

    private void btnInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirActionPerformed
        if(realizarOperaciones){
                 int [][] InterCol;
                 InterCol=MatrizCua.inversa();
                MostrarMatriz(NuevaM,InterCol);
        }else{
            showMessageDialog(this,"No es posible invertir una matriz inexistente");
        }
    }//GEN-LAST:event_btnInvertirActionPerformed

    private void btnInterRenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterRenActionPerformed
       if(realizarOperaciones){
           int[][] InterRen;
           int ren1;
           int ren2;
           try {
              ren1=Integer.parseInt(txtRen.getText())-1;
              ren2=Integer.parseInt(txtRen2.getText())-1;
              InterRen=MatrizCua.intercambioRenglones(ren1,ren2);
          }catch (NumberFormatException e){
              showMessageDialog(this, "Ingresa el numero de los renglones que deseas intercambiar");
               return;
          }
           MostrarMatriz(NuevaM,InterRen);
        }else{
            showMessageDialog(this,"No es posible intercambiar renglones\n de una matriz inexistente");
        }
    }//GEN-LAST:event_btnInterRenActionPerformed

    private void btnInterColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterColActionPerformed
        if(realizarOperaciones){
           int [][] InterCol = null;
           int col1;
           int col2;
           try {
              col1=Integer.parseInt(txtCol.getText())-1;
              col2=Integer.parseInt(txtCol2.getText())-1;
              InterCol=MatrizCua.intercambioColumnas(col1,col2);
          }catch (NumberFormatException e){
              showMessageDialog(this, "Ingresa el numero de las columnas que deseas intercambiar");
          }
           MostrarMatriz(NuevaM,InterCol);
        }else{
            showMessageDialog(this,"No es posible intercambiar columnas\n de una matriz inexistente");
        }
    }//GEN-LAST:event_btnInterColActionPerformed

    private void btnDupRenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDupRenActionPerformed
         if(realizarOperaciones){
           int[][] dupRen;
           int dren1;
           int dren2;
           try {
              dren1=Integer.parseInt(txtRen.getText())-1;
              dren2=Integer.parseInt(txtRen2.getText())-1;
              dupRen=MatrizCua.copiarRenglon(dren1,dren2);
          }catch (NumberFormatException e){
              showMessageDialog(this, "Ingresa el numero del renglon que copiar");
               return;
          }
           MostrarMatriz(NuevaM,dupRen);
        }else{
            showMessageDialog(this,"No es posible copiar renglones\n de una matriz inexistente");
        }
    }//GEN-LAST:event_btnDupRenActionPerformed

    private void btnDupColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDupColActionPerformed
        if(realizarOperaciones){
           int[][] dupCol;
           int dcol1;
           int dcol2;
           try {
              dcol1=Integer.parseInt(txtCol.getText())-1;
              dcol2=Integer.parseInt(txtCol2.getText())-1;
              dupCol=MatrizCua.copiarColumna(dcol1,dcol2);
          }catch (NumberFormatException e){
              showMessageDialog(this, "Ingresa el numero de la columna que deseas copiar");
               return;
          }
            MostrarMatriz(NuevaM,dupCol);
        }else{
            showMessageDialog(this,"No es posible copiar una columna\n de una matriz inexistente");
        }
    }//GEN-LAST:event_btnDupColActionPerformed

    private void btnSumarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarMatrizActionPerformed
       if(realizarOperaciones){
            int sumaM=MatrizCua.sumarValores();
            showMessageDialog(this,"El resultado de la suma de los elementos de la matriz es: "+sumaM);
        }else{
            showMessageDialog(this,"No es posible realizar la suma de los elemtos de una matriz inexistente");
        }
    }//GEN-LAST:event_btnSumarMatrizActionPerformed

    private void txtRenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRenFocusGained
        txtRen.setText("");
    }//GEN-LAST:event_txtRenFocusGained

    private void txtRen2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRen2FocusGained
        txtRen2.setText("");
    }//GEN-LAST:event_txtRen2FocusGained

    private void txtColFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtColFocusGained
       txtCol.setText("");
    }//GEN-LAST:event_txtColFocusGained

    private void txtCol2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCol2FocusGained
         txtCol2.setText("");
    }//GEN-LAST:event_txtCol2FocusGained
   
    //Metodo para llenar las tablas con los valores de las matrices
    public void MostrarMatriz(DefaultTableModel tabla, int[][] matriz){
             tabla.setColumnCount(matriz.length);
             tabla.setRowCount(matriz.length);
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    tabla.setValueAt(matriz[i][j], i, j);
                }
             }
    }
    
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
            java.util.logging.Logger.getLogger(VentanaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMatriz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDupCol;
    private javax.swing.JButton btnDupRen;
    private javax.swing.JButton btnInicializar;
    private javax.swing.JButton btnInterCol;
    private javax.swing.JButton btnInterRen;
    private javax.swing.JButton btnInvertir;
    private javax.swing.JButton btnSumaCol;
    private javax.swing.JButton btnSumaRen;
    private javax.swing.JButton btnSumarMatriz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCol;
    private javax.swing.JLabel lblMatrizOriginal;
    private javax.swing.JLabel lblRen;
    private javax.swing.JLabel lblTam;
    private javax.swing.JTable tblMatriz;
    private javax.swing.JTable tblNuevaM;
    private javax.swing.JTextField txtCol;
    private javax.swing.JTextField txtCol2;
    private javax.swing.JTextField txtRen;
    private javax.swing.JTextField txtRen2;
    private javax.swing.JTextField txtTam;
    // End of variables declaration//GEN-END:variables
}