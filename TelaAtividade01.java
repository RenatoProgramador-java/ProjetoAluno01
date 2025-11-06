package view;

import model.Aluno;
import java.text.DecimalFormat;

public class TelaAvaliacao extends javax.swing.JFrame {
    
    String nome;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaAvaliacao.class.getName());

    public TelaAvaliacao() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaHistorico = new javax.swing.JTextArea();
        jtfNota1 = new javax.swing.JTextField();
        jtfDisplay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfAlunosNome = new javax.swing.JTextField();
        jtfNota3 = new javax.swing.JTextField();
        jtfNota2 = new javax.swing.JTextField();
        jbtnCalcular = new javax.swing.JButton();
        jbtnLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtnLimparHist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));

        jtaHistorico.setBackground(new java.awt.Color(58, 19, 71));
        jtaHistorico.setColumns(20);
        jtaHistorico.setForeground(new java.awt.Color(255, 255, 232));
        jtaHistorico.setRows(5);
        jScrollPane1.setViewportView(jtaHistorico);

        jtfNota1.setBackground(new java.awt.Color(58, 51, 49));
        jtfNota1.setForeground(new java.awt.Color(255, 255, 232));
        jtfNota1.setMinimumSize(new java.awt.Dimension(68, 10));
        jtfNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNota1ActionPerformed(evt);
            }
        });

        jtfDisplay.setBackground(new java.awt.Color(58, 51, 49));
        jtfDisplay.setForeground(new java.awt.Color(255, 255, 232));
        jtfDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDisplayActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Kreadon Regular", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 232));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calculadora de Média");

        jtfAlunosNome.setBackground(new java.awt.Color(58, 51, 49));
        jtfAlunosNome.setForeground(new java.awt.Color(255, 255, 232));
        jtfAlunosNome.setMinimumSize(new java.awt.Dimension(68, 10));
        jtfAlunosNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAlunosNomeActionPerformed(evt);
            }
        });

        jtfNota3.setBackground(new java.awt.Color(58, 51, 49));
        jtfNota3.setForeground(new java.awt.Color(255, 255, 232));
        jtfNota3.setMinimumSize(new java.awt.Dimension(68, 10));
        jtfNota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNota3ActionPerformed(evt);
            }
        });

        jtfNota2.setBackground(new java.awt.Color(58, 51, 49));
        jtfNota2.setForeground(new java.awt.Color(255, 255, 232));
        jtfNota2.setMinimumSize(new java.awt.Dimension(68, 10));
        jtfNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNota2ActionPerformed(evt);
            }
        });

        jbtnCalcular.setBackground(new java.awt.Color(86, 110, 252));
        jbtnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnCalcular.setForeground(new java.awt.Color(255, 255, 232));
        jbtnCalcular.setText("Calcular");
        jbtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularActionPerformed(evt);
            }
        });

        jbtnLimpar.setBackground(new java.awt.Color(86, 110, 252));
        jbtnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnLimpar.setForeground(new java.awt.Color(255, 255, 232));
        jbtnLimpar.setText("Limpar");
        jbtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 232));
        jLabel1.setText("Nota 1:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 232));
        jLabel3.setText("Nome:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 232));
        jLabel4.setText("Nota 2:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 232));
        jLabel5.setText("Nota 3:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 232));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Resultado:");

        jbtnLimparHist.setBackground(new java.awt.Color(251, 127, 215));
        jbtnLimparHist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnLimparHist.setForeground(new java.awt.Color(0, 0, 0));
        jbtnLimparHist.setText("Limpar Historico");
        jbtnLimparHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparHistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jbtnCalcular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnLimparHist))
                            .addComponent(jtfDisplay)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfAlunosNome, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(32, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(213, 213, 213))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtfAlunosNome, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jtfNota1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jtfNota2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jtfNota3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbtnLimparHist)
                    .addComponent(jbtnLimpar)
                    .addComponent(jbtnCalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNota1ActionPerformed

    private void jtfAlunosNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAlunosNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAlunosNomeActionPerformed

    private void jtfNota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNota3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNota3ActionPerformed

    private void jtfNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNota2ActionPerformed

    private void jbtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparActionPerformed
        jtfAlunosNome.setText("");
        jtfNota1.setText("");
        jtfNota2.setText("");
        jtfNota3.setText("");
        jtfDisplay.setText("");
        jtfAlunosNome.requestFocus(); // cursor vai para o primeiro campo
    }//GEN-LAST:event_jbtnLimparActionPerformed

    private void jbtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularActionPerformed
        if(jtfAlunosNome.getText().trim().isEmpty() || jtfNota1.getText().trim().isEmpty() || jtfNota2.getText().trim().isEmpty() || jtfNota3.      getText().trim().isEmpty()) {
            jtfDisplay.setText("Preencha todos os campos\n");
            jtfNota1.requestFocus();
            return;
        }
        
        try {
            nome = jtfAlunosNome.getText();
            double nota1  = Double.parseDouble(jtfNota1.getText());
            double nota2  = Double.parseDouble(jtfNota2.getText());
            double nota3  = Double.parseDouble(jtfNota3.getText());
            
            Aluno escola = new Aluno();
            DecimalFormat formatter = new DecimalFormat("#.#"); // controle de quantidade de casas decimais exibidas
            
            double resultado = escola.calcularMedia(nota1, nota2, nota3);
            
            jtfDisplay.setText(nome + " | N1: " + nota1 + " | N2: " + nota2 + " | N3: " + nota3 + " | Média: " + formatter.format(resultado));
            jtaHistorico.append(nome + " | N1: " + nota1 + " | N2: " + nota2 + " | N3: " + nota3 + " | Média: " + formatter.format(resultado) + " " + escola.getSituacao() + "\n");
        } catch (NumberFormatException ex) {
            jtfDisplay.setText("Digite valores numéricos!");
        } catch (ArithmeticException ex) {
            jtfDisplay.setText(ex.getMessage());
        }
    }//GEN-LAST:event_jbtnCalcularActionPerformed

    private void jtfDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDisplayActionPerformed

    private void jbtnLimparHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparHistActionPerformed
        jtaHistorico.setText("");
        jtfAlunosNome.requestFocus();
    }//GEN-LAST:event_jbtnLimparHistActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaAvaliacao().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCalcular;
    private javax.swing.JButton jbtnLimpar;
    private javax.swing.JButton jbtnLimparHist;
    private javax.swing.JTextArea jtaHistorico;
    private javax.swing.JTextField jtfAlunosNome;
    private javax.swing.JTextField jtfDisplay;
    private javax.swing.JTextField jtfNota1;
    private javax.swing.JTextField jtfNota2;
    private javax.swing.JTextField jtfNota3;
    // End of variables declaration//GEN-END:variables
}
