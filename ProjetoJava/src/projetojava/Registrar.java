/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package projetojava;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author vinib
 */
public class Registrar extends JPanel {
    
    JPanel cards;
    /**
     * Creates new form Registrar
     */
    public Registrar(JPanel cards) {
        this.cards = cards;
        initComponents();
        limparMensagens();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        tfConfirmaSenha = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        lbResultado = new javax.swing.JLabel();
        lbErrUsuario = new javax.swing.JLabel();
        lbErrSenha = new javax.swing.JLabel();
        lbErrConfirmaSenha = new javax.swing.JLabel();
        bntVoltar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Registrar");

        jLabel2.setText("Usuario (no máximo 30 caracteres)");

        jLabel4.setText("Senha (pelo menos 8 caracteres)");

        jLabel5.setText("Confirma senha");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lbResultado.setText("Resultado");

        lbErrUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lbErrUsuario.setText("Erro");

        lbErrSenha.setForeground(new java.awt.Color(255, 0, 0));
        lbErrSenha.setText("Erro");

        lbErrConfirmaSenha.setForeground(new java.awt.Color(255, 0, 0));
        lbErrConfirmaSenha.setText("Erro");

        bntVoltar.setText("Voltar");
        bntVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfConfirmaSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbErrUsuario)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbErrSenha)
                                    .addComponent(lbErrConfirmaSenha)
                                    .addComponent(lbResultado))
                                .addContainerGap(341, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbErrUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbErrSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbErrConfirmaSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(lbResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntVoltar)
                .addContainerGap(369, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void limparMensagens() {
        lbErrUsuario.setText("");
        lbErrSenha.setText("");
        lbErrConfirmaSenha.setText("");
        lbResultado.setText("");
    }
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        limparMensagens();
        try {
            //checar se usuario já existe
            Connection conn = ConexaoMySQL.conectarBanco();
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(
                "SELECT nome FROM projeto_java.Usuarios WHERE nome = \"" + tfUsuario.getText() + "\";"
            );
            if (rs.next()) {
                lbErrUsuario.setText("Nome de usuário já existe");
                conn.close();
                return;
            }
           
            
            //checar tamanho da senha
            if (tfSenha.getPassword().length < 8) {
                lbErrSenha.setText("Senha muito curta");
                conn.close();
                return;
            }
            //checar se senhas batem
            if (!(new String(tfSenha.getPassword())).contentEquals(new String(tfConfirmaSenha.getPassword()))) {
                lbErrConfirmaSenha.setText("Senhas não são iguais");
                conn.close();
                return;
            }
            
        
            //inserir novo usuario
            String sql = "insert into projeto_java.Usuarios (nome, senha) values (";
            sql += "\"" + tfUsuario.getText() + "\", ";
            sql += "\"" + new String(tfSenha.getPassword()) + "\", ";
            st.executeUpdate(sql);
            lbResultado.setText("Sucesso");
            
            conn.close();
        }
        catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void bntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarActionPerformed
        limparMensagens();
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, "LOGIN");
    }//GEN-LAST:event_bntVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntVoltar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbErrConfirmaSenha;
    private javax.swing.JLabel lbErrSenha;
    private javax.swing.JLabel lbErrUsuario;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JPasswordField tfConfirmaSenha;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
