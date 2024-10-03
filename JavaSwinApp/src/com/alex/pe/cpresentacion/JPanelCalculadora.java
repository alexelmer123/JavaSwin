/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.alex.pe.cpresentacion;

/**
 *
 * @author Soporte
 */
public class JPanelCalculadora extends javax.swing.JPanel {

    /**
     * Creates new form JPanelCalculadora
     */
    public JPanelCalculadora() {
        initComponents();
        
        this.Resultado.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
     private void operacion(String sentencia){
        if (sentencia.contains("+")) {
            this.numeroOperado(sentencia, "\\+", "+");
            
        } else if (sentencia.contains("-")){
            this.numeroOperado(sentencia, "-","-");
            
        }else if (sentencia.contains("/")){
            this.numeroOperado(sentencia, "/","/");
            
        }else if (sentencia.contains("x")){
            this.numeroOperado(sentencia, "x","x");
        }
    }
      public void numeroOperado(String sentencia, String Simbolo,String valida){
        String[] cortar =  sentencia.split("");
        String[] numero;
        float primerNumero = 0;
        float SegundoNumero = 0;
        if(cortar[0].contains(valida)){
            numero = sentencia.substring(1,sentencia.length()).split(Simbolo);
             primerNumero = Float.parseFloat(numero[0])- Float.parseFloat(numero[0])*2 ;
             SegundoNumero = 0;
        }else{
          numero = sentencia.split(Simbolo);
          primerNumero = Float.parseFloat(numero[0]) ;
          SegundoNumero = Float.parseFloat(numero[1]) ;
        }
        float resultado = 0;
        if (Simbolo.equals("\\+")) {
            resultado = primerNumero + SegundoNumero;
        }else if(Simbolo.equals("-")){
            resultado = primerNumero - SegundoNumero;
        }else if(Simbolo.equals("x")){
            resultado = primerNumero * SegundoNumero;
        }else if(Simbolo.equals("/")){
            resultado = primerNumero / SegundoNumero;
        }
        this.Resultado.setText(String.valueOf(resultado));
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Calculadora = new javax.swing.JPanel();
        calculadora = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();
        btncc = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnce = new javax.swing.JButton();
        btndivicion = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnmultiplicacion = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        bnt2 = new javax.swing.JButton();
        btnsuma = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        bntcero = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();
        bntarroba = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        Calculadora.setBackground(new java.awt.Color(0, 0, 0));
        Calculadora.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calculadora.setBackground(new java.awt.Color(255, 255, 255));
        calculadora.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        calculadora.setForeground(new java.awt.Color(255, 255, 255));
        calculadora.setText("calculadora");
        Calculadora.add(calculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        Resultado.setFont(new java.awt.Font("Trebuchet MS", 3, 48)); // NOI18N
        Resultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });
        Calculadora.add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 380, 125));

        btncc.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btncc.setText("cc");
        btncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnccActionPerformed(evt);
            }
        });
        Calculadora.add(btncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 70, 60));

        btnPorcentaje.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        Calculadora.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 70, 60));

        btnce.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnce.setText("ce");
        btnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceActionPerformed(evt);
            }
        });
        Calculadora.add(btnce, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 70, 60));

        btndivicion.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btndivicion.setText("/");
        btndivicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivicionActionPerformed(evt);
            }
        });
        Calculadora.add(btndivicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 70, 60));

        btn9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        Calculadora.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 70, 60));

        btn7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        Calculadora.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 70, 60));

        btn8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        Calculadora.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 70, 60));

        btnmultiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnmultiplicacion.setText("x");
        btnmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicacionActionPerformed(evt);
            }
        });
        Calculadora.add(btnmultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 70, 60));

        btn5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        Calculadora.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 70, 60));

        btnresta.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnresta.setText("-");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });
        Calculadora.add(btnresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 70, 60));

        btn6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        Calculadora.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 70, 60));

        btn4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        Calculadora.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 70, 60));

        bnt2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        bnt2.setText("2");
        bnt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt2ActionPerformed(evt);
            }
        });
        Calculadora.add(bnt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 70, 60));

        btnsuma.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnsuma.setText("+");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });
        Calculadora.add(btnsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 70, 60));

        btn3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        Calculadora.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 70, 60));

        btn1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        Calculadora.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 70, 60));

        bntcero.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        bntcero.setText("0");
        bntcero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntceroActionPerformed(evt);
            }
        });
        Calculadora.add(bntcero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 70, 60));

        btnigual.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });
        Calculadora.add(btnigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 70, 60));

        btnpunto.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnpunto.setText(".");
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });
        Calculadora.add(btnpunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 70, 60));

        bntarroba.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        bntarroba.setText("@");
        bntarroba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntarrobaActionPerformed(evt);
            }
        });
        Calculadora.add(bntarroba, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 70, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Calculadora, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Calculadora, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
        
    }//GEN-LAST:event_ResultadoActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        
        this.Resultado.setText(this.Resultado.getText() + "7");
        
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        this.Resultado.setText(this.Resultado.getText()+ "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       this.Resultado.setText(this.Resultado.getText() +"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void bntarrobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntarrobaActionPerformed
        this.operacion(this.Resultado.getText());
        this.Resultado.setText(this.Resultado.getText() + "@");
    }//GEN-LAST:event_bntarrobaActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        this.Resultado.setText(this.Resultado.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void bnt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt2ActionPerformed
        this.Resultado.setText(this.Resultado.getText() + "2");
    }//GEN-LAST:event_bnt2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        this.Resultado.setText(this.Resultado.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        this.Resultado.setText(this.Resultado.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
      this.Resultado.setText(this.Resultado.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       this.Resultado.setText(this.Resultado.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btndivicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivicionActionPerformed
        this.operacion(this.Resultado.getText());
        this.Resultado.setText(this.Resultado.getText() + "/");
    }//GEN-LAST:event_btndivicionActionPerformed

    private void btnmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicacionActionPerformed
         this.operacion(this.Resultado.getText());
        this.Resultado.setText(this.Resultado.getText() +"x");
    }//GEN-LAST:event_btnmultiplicacionActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
         this.operacion(this.Resultado.getText());
        this.Resultado.setText(this.Resultado.getText() +"-");
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
       this.operacion(this.Resultado.getText());
        this.Resultado.setText(this.Resultado.getText() +"+");
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed
         this.Resultado.setText(this.Resultado.getText() +".");
    }//GEN-LAST:event_btnpuntoActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
         this.operacion(this.Resultado.getText());
    }//GEN-LAST:event_btnigualActionPerformed

    private void btnccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnccActionPerformed
     this.Resultado.setText("");
    }//GEN-LAST:event_btnccActionPerformed

    private void btnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceActionPerformed
      int tamanio = this.Resultado.getText().length();
      this.Resultado.setText(this.Resultado.getText().substring(0,tamanio-1));
    }//GEN-LAST:event_btnceActionPerformed

    private void bntceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntceroActionPerformed
        this.Resultado.setText(this.Resultado.getText() + "0");
    }//GEN-LAST:event_bntceroActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
         this.operacion(this.Resultado.getText());
        this.Resultado.setText(this.Resultado.getText() + "%");
    }//GEN-LAST:event_btnPorcentajeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Calculadora;
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton bnt2;
    private javax.swing.JButton bntarroba;
    private javax.swing.JButton bntcero;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btncc;
    private javax.swing.JButton btnce;
    private javax.swing.JButton btndivicion;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmultiplicacion;
    private javax.swing.JButton btnpunto;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JLabel calculadora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
