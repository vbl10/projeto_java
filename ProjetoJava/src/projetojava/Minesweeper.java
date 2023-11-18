/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package projetojava;
import javax.swing.*;
/**
 *
 * @author vinib
 */
public class Minesweeper extends javax.swing.JPanel {
    
    JPanel cards;
    
    JButton btnField[];
    
    private final int dimX = 16;
    private final int dimY = 16;
    private final int dimBtn = 36;
    private final int bombas = 35;
    private boolean field[], revelado[], marcado[];
    private int marcas = 0, reveladas = 0;
    private boolean minado = false;
    private int tempo = 0;
    private int melhor = -1;
    
    Timer timer;
    
    /**
     * Creates new form Minesweeper
     * @param cards
     */
    
    private String formataTempo(int t) {
        int min = t / 60;
        int seg = t % 60;
        String str = new String();
        if (min < 10) str += '0';
        str += min;
        str += ':';
        if (seg < 10) str += '0';
        str += seg;
        return str;
    }
    
    public Minesweeper(JPanel cards) {
        this.cards = cards;
        
        initComponents();
        
        timer = new Timer(1000, (java.awt.event.ActionEvent evt) -> {
            tempo += 1;
            lbTempo.setText(formataTempo(tempo));
        });
        
        lbMarcas.setText("0/" + Integer.toString(bombas));
        
        field = new boolean[dimX * dimY];
        revelado = new boolean[dimX * dimY];
        marcado = new boolean[dimX * dimY];
        btnField = new JButton[dimX * dimY];
        
        for (int y = 0; y < dimY; y++) {
            for (int x = 0; x < dimX; x++) {
                JButton btn = btnField[x + y * dimX] = new JButton();
                btn.setFont(new java.awt.Font("Segoi UI", 0, 14));
                btn.setSize(dimBtn, dimBtn);
                btn.setLocation(x * dimBtn, y * dimBtn);
                btn.putClientProperty("x", x);
                btn.putClientProperty("y", y);
                btn.addActionListener((java.awt.event.ActionEvent evt) -> {
                    JButton btn_ = (JButton)evt.getSource();
                    btnFieldActionPerformed((Integer)btn_.getClientProperty("x"), (Integer)btn_.getClientProperty("y"));
                });
                btn.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mousePressed(java.awt.event.MouseEvent evt) {
                        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) {
                            JButton btn = (JButton)evt.getSource();
                            int x = (int)btn.getClientProperty("x");
                            int y = (int)btn.getClientProperty("y");
                            marcado[x + y * dimX] = !marcado[x + y * dimX];
                            marcas += marcado[x + y * dimX] ? 1 : -1;
                            lbMarcas.setText(Integer.toString(marcas) + "/" + Integer.toString(bombas));
                            btn.setText(marcado[x + y * dimX] ? "f" : "");
                        }
                    }
                });
                pnlCampo.add(btn);
            }
        }
        reset();
        pnlCampo.revalidate();
        pnlCampo.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCampo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbTempo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbMelhor = new javax.swing.JLabel();
        btnRecomecar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbMarcas = new javax.swing.JLabel();

        javax.swing.GroupLayout pnlCampoLayout = new javax.swing.GroupLayout(pnlCampo);
        pnlCampo.setLayout(pnlCampoLayout);
        pnlCampoLayout.setHorizontalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        pnlCampoLayout.setVerticalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tempo:");

        lbTempo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTempo.setText("00:00");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Melhor:");

        lbMelhor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMelhor.setText("00:00");

        btnRecomecar.setText("Recomeçar");
        btnRecomecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecomecarActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Marcas:");

        lbMarcas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMarcas.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTempo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMelhor)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMarcas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRecomecar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbTempo)
                    .addComponent(jLabel3)
                    .addComponent(lbMelhor)
                    .addComponent(jLabel5)
                    .addComponent(lbMarcas)
                    .addComponent(btnRecomecar)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecomecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecomecarActionPerformed
        reset();
    }//GEN-LAST:event_btnRecomecarActionPerformed
    
    private void reset() {
        for (int i = 0; i < dimX * dimY; i++) {
            field[i] = false;
            marcado[i] = false;
            revelado[i] = false;
            btnField[i].setText("");
            btnField[i].setEnabled(true);
        }
        minado = false;
        marcas = 0;
        tempo = 0;
        lbTempo.setText("00:00");
        
    }
    
    private void minar(int nx, int ny) {
        for (int i = 0; i < bombas; i++) {
            int x, y;
            do {
                x = (int)(Math.random() * dimX);
                y = (int)(Math.random() * dimY);
            } while ((x == nx && y == ny) || field[x + y * dimX]);
            field[x + y * dimX] = true;
        }
        minado = true;
        timer.start();
    }
    
    private void revelaCelula(int x, int y) {
        int nBombas = 0;
        for (int y1 = y - 1; y1 <= y + 1; y1++) {
            for (int x1 = x - 1; x1 <= x + 1; x1++) {
                if (y1 >= 0 && y1 < dimY && x1 >= 0 && x1 < dimX && field[x1 + y1 * dimX]) {
                    nBombas++;
                }
            }
        }
        reveladas++;
        btnField[x + y * dimX].setEnabled(false);
        revelado[x + y * dimX] = true;
        if (nBombas > 0) {
            btnField[x + y * dimX].setText(Integer.toString(nBombas));
        }
        else {
            for (int y1 = y - 1; y1 <= y + 1; y1++) {
                for (int x1 = x - 1; x1 <= x + 1; x1++) {
                    if (y1 >= 0 && y1 < dimY && x1 >= 0 && x1 < dimX && !revelado[x1 + y1 * dimX]) {
                        revelaCelula(x1, y1);
                    }
                }
            }
        }
    }
    
    private void btnFieldActionPerformed(int x, int y) {
        if (!marcado[x + y * dimX]) {
            if (!minado)
                minar(x, y);
            if (!field[x + y * dimX]) {
                revelaCelula(x, y);
                if (dimX * dimY - reveladas == bombas) {
                    //ganhou
                    timer.stop();
                    if (tempo < melhor || melhor == -1) {
                        melhor = tempo;
                        lbMelhor.setText(formataTempo(melhor));
                    }
                }
            }
            else {
                //perdeu
                timer.stop();
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecomecar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbMarcas;
    private javax.swing.JLabel lbMelhor;
    private javax.swing.JLabel lbTempo;
    private javax.swing.JPanel pnlCampo;
    // End of variables declaration//GEN-END:variables
}
