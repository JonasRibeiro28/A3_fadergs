package Visao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import Controle.ControleContato;
import Modelo.DadosContato;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_HORIZ;

public class Listar extends javax.swing.JInternalFrame {

    public Listar() {
        initComponents();
       

        //desabilitar o botão de maximizar
        setResizable(false);
    }

    //modelar a tabela
    DefaultTableModel dtm = new DefaultTableModel(
    
            new Object [][]{},
            new Object []{"Registro(ID)","Nome","Preco","Quantidade","Lote","Marca","Validade"}                                        
    );
    
    public void AtualizarTabela()
    {
        try
        {
            ControleContato cc = new ControleContato();
            //criar um Arralist vazio ára receber o Arraylist ja criado na classe BancoContato
            ArrayList<DadosContato> lista = new ArrayList<>();
            lista = cc.Listar();
            //limpar a tebla na interface
            dtm.setNumRows(0);
            //PERCORRER A TABELA NA INTERFACE COLOCANDO OS REQUISITOS QUE O COMANDO DE SQL(Select) RESULTOU
            for (int i = 0; i < lista.size(); i++)
            {
            dtm.addRow(
                         new String[]{
                                       Integer.toString(lista.get(i).getId()),
                                       lista.get(i).getNome(),
                                       lista.get(i).getPreco(),
                                       lista.get(i).getQuantidade(),
                                       lista.get(i).getLote(),    
                                       lista.get(i).getMarca(),
                                       lista.get(i).getValidade()
                                     }//new String
                      );
            
            }//for
            tabela.setModel(dtm);
            
        }//try 
        catch (Exception erro)
        {
            JOptionPane.showMessageDialog(null, "Erro em atulizar a tabela dos produtos. \nCausa: "+erro.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }//catch
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btListar = new javax.swing.JButton();
        btApagar = new javax.swing.JButton();
        btSelecionar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Campoid = new javax.swing.JTextField();
        Campopreco = new javax.swing.JTextField();
        Campoquantidade = new javax.swing.JTextField();
        Campolote = new javax.swing.JTextField();
        btAtualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Campomarca = new javax.swing.JTextField();
        Campovalidade = new javax.swing.JTextField();
        Camponome = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Lista De Contatos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro(ID)", "Nome", "Preço", "Quantidade", "Lote", "Marca", "Validade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AÇÕES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        btListar.setBackground(new java.awt.Color(0, 204, 51));
        btListar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btListar.setText("<html>    <p>VISUALIZAR</p>    <p>PRODUTOS</p> </html>");
        btListar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        btApagar.setBackground(new java.awt.Color(204, 0, 0));
        btApagar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btApagar.setText("<html>    <p>&nbsp;&nbsp;APAGAR</p>    <p>PRODUTO</p> </html>");
        btApagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });

        btSelecionar.setBackground(new java.awt.Color(204, 204, 0));
        btSelecionar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btSelecionar.setText("<html> <p>SELECIONAR</p>                        <p>PRODUTO</p> <html>");
        btSelecionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(btApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(btSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btApagar.getAccessibleContext().setAccessibleName("<html>\n   <p>   APAGAR</p>\n   <p>CONTATO</p>\n</html>");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("NOME:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Preço:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Lote:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("REGISTRO(ID):");

        Campoid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoidActionPerformed(evt);
            }
        });

        Campopreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoprecoActionPerformed(evt);
            }
        });

        Campoquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoquantidadeActionPerformed(evt);
            }
        });

        Campolote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoloteActionPerformed(evt);
            }
        });

        btAtualizar.setBackground(new java.awt.Color(0, 0, 255));
        btAtualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btAtualizar.setText("<html> <p>ATUALIZAR</p> <p>PRODUTO</p> <html>");
        btAtualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Marca:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Validade:");

        Campomarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampomarcaActionPerformed(evt);
            }
        });

        Campovalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampovalidadeActionPerformed(evt);
            }
        });

        Camponome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamponomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Campoid, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Campopreco, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Campoquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Campolote, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(128, 128, 128)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Campovalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Camponome, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(47, 47, 47)
                                .addComponent(Campomarca, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Campoid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Campopreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Campoquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Campomarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Campolote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Campovalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
    AtualizarTabela();
    }//GEN-LAST:event_btListarActionPerformed

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarActionPerformed
        try 
        {
            //pegar o retorno na linha seleciona na interface
            int linha = tabela.getSelectedRow();
            if(linha !=-1)
            {
                //verificar a confirmação do usuario
                
                int confirmar = JOptionPane.showConfirmDialog(null,"VocÊ realmente deseja apagar? ","EXCLUIR",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                
                if(confirmar == 0)  //if2
                        {
                            //pegar o valor de referencia da linha e coluna
                           String codigo = (String)tabela.getValueAt(linha, 0);
                           DadosContato dc = new DadosContato();
                           dc.setId(Integer.parseInt(codigo));
                           ControleContato cc = new ControleContato();
                           cc.Apagar(dc);
                           //atualizar a tabela na interface
                           AtualizarTabela();
                           JOptionPane.showMessageDialog(null,"Produto apagado com sucesso."," Sucesso",JOptionPane.INFORMATION_MESSAGE);       

                            
                       }//if2 
                
            }//if  
                
                
            else
            {
             JOptionPane.showMessageDialog(null,"Selecione sua linha."," ATENÇÃO",JOptionPane.WARNING_MESSAGE);       
            }//else
     
        }
        catch (Exception erro)
        {
            JOptionPane.showMessageDialog(null,"Erro ao apagar da o produto da tabela \nCausa:"+erro.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btApagarActionPerformed

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
    //Selecionar contato   
    int linha = tabela.getSelectedRow();
    if(linha != -1)
    {
     jPanel3.setVisible(true);
     //pegar os dados  da linha (registro na tabela) selecionada
     //preencher  os campos  de formulario

     Campoid.setText((String)tabela.getValueAt(linha, 0)); 
     Camponome.setText((String)tabela.getValueAt(linha, 1));
     Campopreco.setText((String)tabela.getValueAt(linha, 2));
     Campoquantidade.setText((String)tabela.getValueAt(linha, 3));
     Campolote.setText((String)tabela.getValueAt(linha, 4)); 
     Campomarca.setText((String)tabela.getValueAt(linha, 5)); 
     Campovalidade.setText((String)tabela.getValueAt(linha, 6)); 


    }//if
    else
    {
     JOptionPane.showMessageDialog(null,"Selecione sua linha."," ATENÇÃO",JOptionPane.WARNING_MESSAGE);       
    }//else
    }//GEN-LAST:event_btSelecionarActionPerformed

    private void CampoidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoidActionPerformed
       
    }//GEN-LAST:event_CampoidActionPerformed

    private void CampoprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoprecoActionPerformed
       
    }//GEN-LAST:event_CampoprecoActionPerformed

    private void CampoquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoquantidadeActionPerformed
      
    }//GEN-LAST:event_CampoquantidadeActionPerformed

    private void CampoloteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoloteActionPerformed
        
    }//GEN-LAST:event_CampoloteActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
    //Atualizar Contato
        try 
        {
        //passar os dados nos campos da interface para a classe DadosContatos
            DadosContato dc = new DadosContato();
            dc.setId(Integer.parseInt(Campoid.getText()));
            dc.setNome(Camponome.getText());//Aqui está o erro, esta vindo o Campopreço
            dc.setPreco(Campopreco.getText());
            dc.setQuantidade(Campoquantidade.getText());
            dc.setLote(Campolote.getText());
            dc.setMarca(Campomarca.getText());
            dc.setValidade(Campovalidade.getText());

            ControleContato cc = new ControleContato();
            cc.Atualizar(dc);
            AtualizarTabela();
            JOptionPane.showMessageDialog(null,"Produto"
                    + " foi alterado com sucesso. "," SUCESSO",JOptionPane.INFORMATION_MESSAGE);        
           jPanel3.setVisible(false);
           
        }//try
        
        catch (Exception erro) 
        {
        JOptionPane.showMessageDialog(null,"Erro ao atualizar dados. \nCausa:"+erro.getMessage()," ERRO",JOptionPane.ERROR_MESSAGE);        
        }//catch
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void CampomarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampomarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampomarcaActionPerformed

    private void CampovalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampovalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampovalidadeActionPerformed

    private void CamponomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamponomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CamponomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campoid;
    private javax.swing.JTextField Campolote;
    private javax.swing.JTextField Campomarca;
    private javax.swing.JTextField Camponome;
    private javax.swing.JTextField Campopreco;
    private javax.swing.JTextField Campoquantidade;
    private javax.swing.JTextField Campovalidade;
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
