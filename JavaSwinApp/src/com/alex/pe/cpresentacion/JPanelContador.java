/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.alex.pe.cpresentacion;

/**
 *
 * @author Soporte
 */
public class JPanelContador extends javax.swing.JPanel {
      int contador;
    /**
     * Creates new form JPanelContador
     */
    public JPanelContador() {
        initComponents();
         this.Resultado.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpContador = new javax.swing.JPanel();
        Contador = new javax.swing.JLabel();
        btnsumar = new javax.swing.JButton();
        btnrestar = new javax.swing.JButton();
        Resultado = new javax.swing.JTextField();

        jpContador.setBackground(new java.awt.Color(0, 255, 255));
        jpContador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contador.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        Contador.setText("Contador");
        jpContador.add(Contador, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 32, 106, 72));

        btnsumar.setBackground(new java.awt.Color(204, 204, 204));
        btnsumar.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        btnsumar.setText("+");
        btnsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumarActionPerformed(evt);
            }
        });
        jpContador.add(btnsumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 124, 77));

        btnrestar.setBackground(new java.awt.Color(204, 204, 204));
        btnrestar.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        btnrestar.setText("-");
        btnrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestarActionPerformed(evt);
            }
        });
        jpContador.add(btnrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 122, 77));

        Resultado.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        Resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Resultado.setText("0");
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });
        jpContador.add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 270, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContador, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContador, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumarActionPerformed
      contador ++;
      String numero = String.valueOf(contador);
      Resultado.setText(numero);
      
    }//GEN-LAST:event_btnsumarActionPerformed

    private void btnrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestarActionPerformed
        contador --;
      String numero = String.valueOf(contador);
      Resultado.setText(numero);
    }//GEN-LAST:event_btnrestarActionPerformed

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed

    }//GEN-LAST:event_ResultadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contador;
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton btnrestar;
    private javax.swing.JButton btnsumar;
    private javax.swing.JPanel jpContador;
    // End of variables declaration//GEN-END:variables
}
