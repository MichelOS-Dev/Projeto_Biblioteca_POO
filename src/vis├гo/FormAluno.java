/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloConnection.ConexaoBD;
import modeloDao.DaoAluno;
import modeloBeans.BeansAluno;
import modeloBeans.ModeloTabela;

/**
 *
 * @author Michel
 */
public class FormAluno extends javax.swing.JFrame {

    BeansAluno modAluno = new BeansAluno();
    DaoAluno control = new DaoAluno();
    ConexaoBD conex = new ConexaoBD(); 
    int flag=0;
    
    public FormAluno() {
        initComponents();
        preencherTabela("select * from alunos order by nome");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1NomeTela = new javax.swing.JLabel();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAluno = new javax.swing.JTable();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jTextFieldQntLivrosLidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCurso = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxTurmas = new javax.swing.JComboBox<>();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabelIdAluno = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabelFundoAluno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setLayout(null);

        jLabel1NomeTela.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1NomeTela.setText("Cadastro de Alunos");
        jPanel3.add(jLabel1NomeTela);
        jLabel1NomeTela.setBounds(430, 20, 250, 40);

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonPesquisar);
        jButtonPesquisar.setBounds(689, 540, 100, 30);

        jTableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAluno);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(220, 580, 590, 130);
        jPanel3.add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(220, 540, 460, 30);

        jTextFieldQntLivrosLidos.setEnabled(false);
        jPanel3.add(jTextFieldQntLivrosLidos);
        jTextFieldQntLivrosLidos.setBounds(330, 410, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Livros lidos:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(241, 407, 90, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Curso:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(560, 407, 70, 30);

        jTextFieldCurso.setEnabled(false);
        jPanel3.add(jTextFieldCurso);
        jTextFieldCurso.setBounds(630, 410, 174, 30);

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCancelar);
        jButtonCancelar.setBounds(660, 470, 110, 25);

        jButtonDeletar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDeletar.setText("Deletar");
        jButtonDeletar.setEnabled(false);
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonDeletar);
        jButtonDeletar.setBounds(560, 470, 90, 25);

        jButtonAtualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setEnabled(false);
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAtualizar);
        jButtonAtualizar.setBounds(440, 470, 110, 25);

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSalvar);
        jButtonSalvar.setBounds(340, 470, 90, 25);

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonNovo);
        jButtonNovo.setBounds(240, 470, 90, 25);

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldNome);
        jTextFieldNome.setBounds(330, 320, 200, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(241, 330, 60, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Matrícula:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(238, 370, 80, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Turma:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(560, 367, 60, 20);

        jComboBoxTurmas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º A", "1º B", "1º C", "2º A", "2º B", "2º C", "3º A", "3º B", "3º C" }));
        jComboBoxTurmas.setEnabled(false);
        jComboBoxTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurmasActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxTurmas);
        jComboBoxTurmas.setBounds(630, 360, 174, 30);

        jTextFieldMatricula.setEnabled(false);
        jPanel3.add(jTextFieldMatricula);
        jTextFieldMatricula.setBounds(330, 360, 200, 30);

        jLabelIdAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelIdAluno.setText("ID do aluno:");
        jPanel3.add(jLabelIdAluno);
        jLabelIdAluno.setBounds(540, 320, 90, 30);

        jTextFieldId.setEnabled(false);
        jPanel3.add(jTextFieldId);
        jTextFieldId.setBounds(630, 320, 170, 30);

        jLabelFundoAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoAluno.png"))); // NOI18N
        jPanel3.add(jLabelFundoAluno);
        jLabelFundoAluno.setBounds(0, 0, 1080, 810);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1096, 849));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTurmasActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo NOME para continuar");
            jTextFieldNome.requestFocus();
        }else if(jTextFieldMatricula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo Matricula para continuar");
            jTextFieldMatricula.requestFocus();
        }else if(jTextFieldCurso.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo CURSO para continuar");
            jTextFieldCurso.requestFocus();
        }else if(jTextFieldQntLivrosLidos.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo LIVROS LIDOS para continuar");
            jTextFieldQntLivrosLidos.requestFocus();
        }else{

            if(flag == 1){
            modAluno.setNome(jTextFieldNome.getText());
            modAluno.setMatricula(Integer.parseInt(jTextFieldMatricula.getText()));
            modAluno.setCurso(jTextFieldCurso.getText());
            modAluno.setTurma((String)jComboBoxTurmas.getSelectedItem());
            modAluno.setLivrosLidos(Integer.parseInt(jTextFieldQntLivrosLidos.getText()));

            control.Salvar(modAluno);

            jTextFieldMatricula.setText("");
            jTextFieldNome.setText("");
            jTextFieldCurso.setText("");
            jTextFieldQntLivrosLidos.setText("");

            jTextFieldMatricula.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jTextFieldCurso.setEnabled(false);
            jTextFieldQntLivrosLidos.setEnabled(false);
            jComboBoxTurmas.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jTextFieldPesquisar.setText("");
            jTextFieldPesquisar.setEnabled(true);
            jButtonPesquisar.setEnabled(true);
            preencherTabela("select * from alunos order by nome");

            }else{
                modAluno.setCodigo(Integer.parseInt(jTextFieldId.getText()));
                modAluno.setNome(jTextFieldNome.getText());
                modAluno.setMatricula(Integer.parseInt(jTextFieldMatricula.getText()));
                modAluno.setCurso(jTextFieldCurso.getText());
                modAluno.setTurma((String)jComboBoxTurmas.getSelectedItem());
                modAluno.setLivrosLidos(Integer.parseInt(jTextFieldQntLivrosLidos.getText()));
                control.Atualizar(modAluno);

                jTextFieldId.setText("");
                jTextFieldMatricula.setText("");
                jTextFieldNome.setText("");
                jTextFieldCurso.setText("");
                jTextFieldQntLivrosLidos.setText("");
                jTextFieldMatricula.setEnabled(false);
                jTextFieldNome.setEnabled(false);
                jTextFieldCurso.setEnabled(false);
                jTextFieldQntLivrosLidos.setEnabled(false);
                jComboBoxTurmas.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jButtonNovo.setEnabled(true);
                jButtonCancelar.setEnabled(false);
                jTextFieldPesquisar.setText("");
                jTextFieldPesquisar.setEnabled(true);
                jButtonPesquisar.setEnabled(true);
                preencherTabela("select * from alunos order by nome");
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldNome.setEnabled(true);
        jTextFieldMatricula.setEnabled(true);
        jTextFieldCurso.setEnabled(true);
        jComboBoxTurmas.setEnabled(true);
        jTextFieldQntLivrosLidos.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        
        jTextFieldId.setText("");
        jTextFieldMatricula.setText("");
        jTextFieldNome.setText("");
        jTextFieldCurso.setText("");
        jTextFieldQntLivrosLidos.setText("");
        jButtonAtualizar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jTextFieldPesquisar.setText("");
        jTextFieldPesquisar.setEnabled(false);
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        modAluno.setPesquisa(jTextFieldPesquisar.getText());
        BeansAluno model = control.buscaAluno(modAluno);
        if(model.getMatricula() != 0){
            jTextFieldMatricula.setText(String.valueOf(model.getMatricula()));
            jTextFieldNome.setText(model.getNome());
            jComboBoxTurmas.setSelectedItem(model.getTurma());
            jTextFieldCurso.setText(model.getCurso());
            jTextFieldQntLivrosLidos.setText(String.valueOf(model.getLivrosLidos()));
            jTextFieldId.setText(String.valueOf(model.getCodigo()));

            jButtonAtualizar.setEnabled(true);
            jButtonDeletar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            preencherTabela("select * from alunos where nome ilike'%"+modAluno.getPesquisa()+"%'");
        }else{
            jButtonAtualizar.setEnabled(false);
            jButtonDeletar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            preencherTabela("select * from alunos where nome ilike'%"+modAluno.getPesquisa()+"%'");
        }
  
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
            jTextFieldNome.setEnabled(!true);
            jTextFieldMatricula.setEnabled(!true);
            jTextFieldCurso.setEnabled(!true);
            jComboBoxTurmas.setEnabled(!true);
            jTextFieldQntLivrosLidos.setEnabled(!true);
            jButtonSalvar.setEnabled(!true);
            jButtonCancelar.setEnabled(!true);
            jButtonNovo.setEnabled(true);
            jButtonAtualizar.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonDeletar.setEnabled(false);
            jTextFieldPesquisar.setText("");
            jTextFieldPesquisar.setEnabled(true);
            jButtonPesquisar.setEnabled(true);
            jTextFieldId.setText("");
            jTextFieldMatricula.setText("");
            jTextFieldNome.setText("");
            jTextFieldCurso.setText("");
            jTextFieldQntLivrosLidos.setText("");
        
        
       
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jTextFieldMatricula.setEnabled(true);
        jTextFieldCurso.setEnabled(true);
        jComboBoxTurmas.setEnabled(true);
        jTextFieldQntLivrosLidos.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonAtualizar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        
        
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente excluir!");
        if(resposta == JOptionPane.YES_OPTION){
            modAluno.setCodigo(Integer.parseInt(jTextFieldId.getText()));
            control.Excluir(modAluno);
            jTextFieldId.setText("");
            jTextFieldMatricula.setText("");
            jTextFieldNome.setText("");
            jTextFieldCurso.setText("");
            jTextFieldQntLivrosLidos.setText("");
            jTextFieldMatricula.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jTextFieldCurso.setEnabled(false);
            jTextFieldQntLivrosLidos.setEnabled(false);
            jComboBoxTurmas.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonAtualizar.setEnabled(false);
            jButtonDeletar.setEnabled(false);
            preencherTabela("select * from alunos order by nome");
        }else{
            jTextFieldId.setText("");
            jTextFieldMatricula.setText("");
            jTextFieldNome.setText("");
            jTextFieldCurso.setText("");
            jTextFieldQntLivrosLidos.setText("");
            jTextFieldMatricula.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jTextFieldCurso.setEnabled(false);
            jTextFieldQntLivrosLidos.setEnabled(false);
            jComboBoxTurmas.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonAtualizar.setEnabled(false);
            jButtonDeletar.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jTableAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunoMouseClicked
       String nome_aluno = ""+jTableAluno.getValueAt(jTableAluno.getSelectedRow(),2);
       //JOptionPane.showMessageDialog(null,nome_aluno);
       conex.conexao();
       conex.executeSql("select * from alunos where nome='"+nome_aluno+"'");
       try{      
                conex.rs.first();
                jTextFieldId.setText(String.valueOf(conex.rs.getInt("codigo")));
                jTextFieldMatricula.setText(String.valueOf(conex.rs.getInt("matricula")));
                jTextFieldNome.setText(conex.rs.getString("nome"));
                jComboBoxTurmas.setSelectedItem(conex.rs.getString("turma"));
                jTextFieldCurso.setText(conex.rs.getString("curso"));
                jTextFieldQntLivrosLidos.setText(String.valueOf(conex.rs.getInt("livroslidos")));
       
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Erro ao selecionar os dados!\nErro: "+ex);
           //Erro: org.postgresql.util.PSQLException:ResultSet não está posicionado corretamente, talvez você precise chamar next.
       }
       
       conex.desconecta();
            jTextFieldMatricula.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jTextFieldCurso.setEnabled(false);
            jTextFieldQntLivrosLidos.setEnabled(false);
            jComboBoxTurmas.setEnabled(false);
       jButtonAtualizar.setEnabled(true);
       jButtonDeletar.setEnabled(true);
       jButtonCancelar.setEnabled(true);
       jButtonSalvar.setEnabled(false);
    }//GEN-LAST:event_jTableAlunoMouseClicked

    public void preencherTabela(String Sql){
    
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Id",",Matrícula","Nome","Turma","Curso","Livros Lidos"};
        conex.conexao();
        conex.executeSql(Sql);
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("codigo"),conex.rs.getInt("matricula"),conex.rs.getString("nome"),conex.rs.getString("turma"),conex.rs.getString("curso"),conex.rs.getInt("livroslidos")});
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Busque por outro aluno para preencher a tabela!");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados,colunas); 
        
        jTableAluno.setModel(modelo);
        jTableAluno.getColumnModel().getColumn(0).setPreferredWidth(35);
        jTableAluno.getColumnModel().getColumn(0).setResizable(false);
        jTableAluno.getColumnModel().getColumn(1).setPreferredWidth(90);
        jTableAluno.getColumnModel().getColumn(1).setResizable(false);
        jTableAluno.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTableAluno.getColumnModel().getColumn(2).setResizable(false);
        jTableAluno.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTableAluno.getColumnModel().getColumn(3).setResizable(false);
        jTableAluno.getColumnModel().getColumn(4).setPreferredWidth(90);
        jTableAluno.getColumnModel().getColumn(4).setResizable(false);
        jTableAluno.getColumnModel().getColumn(5).setPreferredWidth(167);
        jTableAluno.getColumnModel().getColumn(5).setResizable(false);
        
        jTableAluno.getTableHeader().setReorderingAllowed(false);
        jTableAluno.setAutoResizeMode(jTableAluno.AUTO_RESIZE_OFF);
        jTableAluno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conex.desconecta();
    
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
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTurmas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1NomeTela;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFundoAluno;
    private javax.swing.JLabel jLabelIdAluno;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAluno;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldQntLivrosLidos;
    // End of variables declaration//GEN-END:variables
}
