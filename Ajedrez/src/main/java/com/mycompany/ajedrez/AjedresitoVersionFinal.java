/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ajedrez;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import java.net.URL;

/**
 *
 * @author losro
 */
public class AjedresitoVersionFinal extends javax.swing.JFrame {
Stack<Movimiento> pila = new Stack<Movimiento>();
DefaultListModel l1 = new DefaultListModel();

List<Pieza> a = new ArrayList<Pieza>();
Juego o1 = new Juego();
Tablero a1 = new Tablero(this.getWidth(), this.getHeight());

int posinix=0;  int posiniy=0; int posfinx=0; int posfiny=0;
             int contador1=0;
             int contador2=0;
             int contador3=0;

    /**
     * Creates new form Ajedresito
     */
    public AjedresitoVersionFinal() {
        initComponents();
        
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
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        julian = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jaiba = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        Julio = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(julian);

        jaiba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jaibaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jaiba);

        jLabel3.setText("Selecciona la Pieza a mover");

        jLabel4.setText("Movimientos");

        jPanel.setMaximumSize(new java.awt.Dimension(25000, 25000));
        jPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMouseClicked(evt);
            }
        });

        Julio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Julio.setText("Click aqui para empezar");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(Julio)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(Julio)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        jButton1.setText("Reiniciar");
        jButton1.setActionCommand("Reiniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3)
                        .addContainerGap(101, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(139, 139, 139))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_formMouseClicked

    private void jPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMouseClicked
        // TODO add your handling code here:
          a1.dibujar(this.getGraphics(),this.jPanel);
        Julio.removeAll();
         DefaultListModel l4 = new DefaultListModel();
        a=o1.mostrarPizas();
        for(int i=0; i<a.size();i++){
             l4.addElement(a.get(i).getNombre()+" - "+a.get(i).getPosX()+","+a.get(i).getPosY());
        }
       
        jaiba.setModel(l4);
        
        
        a1.dibujar(this.getGraphics(), jPanel);
        Pieza[][] piezas =o1.getPiezas();
        a1.dibujar(this.getGraphics(), jPanel, piezas);
        Julio.removeAll();
       
    }//GEN-LAST:event_jPanelMouseClicked

    private void jaibaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaibaMouseClicked
        // TODO add your handling code here:
          
        a=o1.mostrarPizas();
         String g="";
         if(jaiba.getSelectedIndex()==-1){
           JOptionPane.showMessageDialog(null,"No se ha seleccionado una pieza para mover");
        }else {
             
           if(contador1>1){
               contador1=0;
           }
            
           if(contador1==0){
               posinix=a.get(jaiba.getSelectedIndex()).getPosX();
               posiniy=a.get(jaiba.getSelectedIndex()).getPosY();
               contador1=contador1+1;
           }else{
               contador1=0;
               
               posfinx=a.get(jaiba.getSelectedIndex()).getPosX();
               posfiny=a.get(jaiba.getSelectedIndex()).getPosY();
               
                Movimiento m1 = new Movimiento(o1.getPiezas()[posinix][posiniy],posfinx,posfiny);
                pila.push(m1);
                o1.setMovimientos(pila);
                
                l1.addElement(o1.mostrarMovimientos());
                julian.setModel(l1);
                
                DefaultListModel l4 = new DefaultListModel();
                a=o1.mostrarPizas();
                for(int i=0; i<a.size();i++){
                    l4.addElement(a.get(i).getNombre()+" - "+a.get(i).getPosX()+","+a.get(i).getPosY());
                }
                jaiba.setModel(l4);
                a1.dibujar(this.getGraphics(),this.jPanel);
                    DefaultListModel l3 = new DefaultListModel();
                   a=o1.mostrarPizas();
                   for(int i=0; i<a.size();i++){
                        l3.addElement(a.get(i).getNombre()+" - "+a.get(i).getPosX()+","+a.get(i).getPosY());
                   }
                   jaiba.setModel(l4);
                    a1.dibujar(this.getGraphics(), jPanel);
                    Pieza[][] piezas =o1.getPiezas();
                    
                    a1.dibujar(this.getGraphics(), jPanel, piezas);
                   
           } 
        }   
    }//GEN-LAST:event_jaibaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Juego ba = new Juego();
        o1.setPiezas(ba.getPiezas());
        
        DefaultListModel l4 = new DefaultListModel();
                a=o1.mostrarPizas();
                for(int i=0; i<a.size();i++){
                    l4.addElement(a.get(i).getNombre()+" - "+a.get(i).getPosX()+","+a.get(i).getPosY());
                }
                jaiba.setModel(l4);
                a1.dibujar(this.getGraphics(),this.jPanel);
                    DefaultListModel l3 = new DefaultListModel();
                   a=o1.mostrarPizas();
                   for(int i=0; i<a.size();i++){
                        l3.addElement(a.get(i).getNombre()+" - "+a.get(i).getPosX()+","+a.get(i).getPosY());
                   }
                   jaiba.setModel(l4);
                    a1.dibujar(this.getGraphics(), jPanel);
                    Pieza[][] piezas =o1.getPiezas();
                    
                    a1.dibujar(this.getGraphics(), jPanel, piezas);
                    
                    DefaultListModel a = new DefaultListModel();
                    l1=a;
                    julian.setModel(l1);
                    
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AjedresitoVersionFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjedresitoVersionFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjedresitoVersionFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjedresitoVersionFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjedresitoVersionFinal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Julio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> jaiba;
    private javax.swing.JList<String> julian;
    // End of variables declaration//GEN-END:variables
}
