package Visao;

import Controle.ControleContato;
import Modelo.DadosContato;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JInternalFrame {
    public Cadastro() {          

        initComponents();

        //desabilitar o botão de maximizar
        setResizable(false);
   
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Camponome = new javax.swing.JTextField();
        Campoquantidade = new javax.swing.JTextField();
        Campolote = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        Campomarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Campovalidade = new javax.swing.JTextField();
        Campopreco = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CADASTRO DE PRODUTOS ESTOQUE");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Preço:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Lote:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Camponome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Camponome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamponomeActionPerformed(evt);
            }
        });

        Campoquantidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Campolote.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Campolote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoloteActionPerformed(evt);
            }
        });

        Cadastrar.setBackground(new java.awt.Color(0, 153, 0));
        Cadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Limpar.setBackground(new java.awt.Color(255, 0, 0));
        Limpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Campomarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Campomarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampomarcaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Marca:");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Ano de validade:");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Campovalidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Campovalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampovalidadeActionPerformed(evt);
            }
        });

        Campopreco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Campopreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoprecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Camponome)
                    .addComponent(Campolote)
                    .addComponent(Campoquantidade)
                    .addComponent(Campomarca)
                    .addComponent(Campopreco)
                    .addComponent(Campovalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Campopreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Campoquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Campolote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campomarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campovalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CamponomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamponomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CamponomeActionPerformed

    private void CampoloteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoloteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoloteActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        try 
        {
            
            
           DadosContato dc = new DadosContato();
           dc.setNome(Camponome.getText());
           dc.setPreco(Campopreco.getText());
           dc.setQuantidade(Campoquantidade.getText());
           dc.setLote(Campolote.getText());
           dc.setMarca(Campomarca.getText());
           dc.setValidade(Campovalidade.getText());

           
           ControleContato cc = new ControleContato();
           
           cc.Cadastrar(dc);
           
           JOptionPane.showMessageDialog(null,"Cadastro do produto realizado com sucesso!","",JOptionPane.INFORMATION_MESSAGE);
           
        }//try 
        catch (Exception erro) 
        {
           JOptionPane.showMessageDialog(null,"Erro ao realizar o cadastro do produto.\n Causa:"+erro.getMessage(),"ERRO",JOptionPane.INFORMATION_MESSAGE);

        }//catch

    }//GEN-LAST:event_CadastrarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        limpar();
        
        
    }//GEN-LAST:event_LimparActionPerformed

    private void CampomarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampomarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampomarcaActionPerformed

    private void CampovalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampovalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampovalidadeActionPerformed

    private void CampoprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoprecoActionPerformed
    private void limpar() {
    
    
  
        Camponome.setText(null);
        Campopreco.setText(null);
        Campoquantidade.setText(null);
        Campolote.setText(null);
        Campomarca.setText(null);
        Campovalidade.setText(null);

      
        JOptionPane.showMessageDialog(null, "Sistema pronto para cadastrar um novo produto ", "LIMPAR TELA ", JOptionPane.INFORMATION_MESSAGE);
    

    
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField Campolote;
    private javax.swing.JTextField Campomarca;
    private javax.swing.JTextField Camponome;
    private javax.swing.JTextField Campopreco;
    private javax.swing.JTextField Campoquantidade;
    private javax.swing.JTextField Campovalidade;
    private javax.swing.JButton Limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables



}// fechamento do public class Cadastro extends javax.swing.JInternalFrame 

