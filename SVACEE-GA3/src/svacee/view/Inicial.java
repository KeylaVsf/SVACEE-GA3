package svacee.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import svacee.ctrl.DadoConsumoCtrl;
import svacee.model.DadoConsumo;

/**
 *
 * @author keylavsf
 */

public class Inicial extends javax.swing.JFrame {

    DadoConsumoCtrl dcc = new DadoConsumoCtrl();
    TabelaGraficoConsumo tgc;
    TabelaGraficoConsumo tabgrafcons = new TabelaGraficoConsumo();

    public Inicial() {
        initComponents();
        tgc = new TabelaGraficoConsumo();
        buttonObterDadosCSV.setToolTipText("Obter dados de arquivo CSV");
        buttonSair.setToolTipText("Sair do programa");
        buttonTabelaDados.setToolTipText("Obter dados da tabela");
        buttonGraficoConsumo.setToolTipText("Obter dados do gráfico");
        buttonSobre.setToolTipText("Sobre o programa");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainel = new javax.swing.JPanel();
        BarraFerramentas = new javax.swing.JToolBar();
        buttonObterDadosCSV = new javax.swing.JButton();
        buttonTabelaDados = new javax.swing.JButton();
        buttonGraficoConsumo = new javax.swing.JButton();
        buttonSobre = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        jlImg = new javax.swing.JLabel();
        jmbMenu = new javax.swing.JMenuBar();
        Arquivo = new javax.swing.JMenu();
        ObterDadosCSV = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();
        Visualizar = new javax.swing.JMenu();
        TabelaDados = new javax.swing.JMenuItem();
        GraficoConsumo = new javax.swing.JMenuItem();
        Ajuda = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Inicial - SVACEE");

        BarraFerramentas.setFloatable(false);
        BarraFerramentas.setRollover(true);
        BarraFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonObterDadosCSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/icones/csv2.png"))); // NOI18N
        buttonObterDadosCSV.setFocusable(false);
        buttonObterDadosCSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonObterDadosCSV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonObterDadosCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonObterDadosCSVActionPerformed(evt);
            }
        });
        BarraFerramentas.add(buttonObterDadosCSV);

        buttonTabelaDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/icones/tabela1.png"))); // NOI18N
        buttonTabelaDados.setFocusable(false);
        buttonTabelaDados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonTabelaDados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonTabelaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTabelaDadosActionPerformed(evt);
            }
        });
        BarraFerramentas.add(buttonTabelaDados);

        buttonGraficoConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/icones/grafico1.png"))); // NOI18N
        buttonGraficoConsumo.setFocusable(false);
        buttonGraficoConsumo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonGraficoConsumo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonGraficoConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGraficoConsumoActionPerformed(evt);
            }
        });
        BarraFerramentas.add(buttonGraficoConsumo);

        buttonSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/icones/sobre.png"))); // NOI18N
        buttonSobre.setFocusable(false);
        buttonSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSobreActionPerformed(evt);
            }
        });
        BarraFerramentas.add(buttonSobre);

        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/icones/sair.png"))); // NOI18N
        buttonSair.setFocusable(false);
        buttonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        BarraFerramentas.add(buttonSair);

        jlImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/images/logoLPV.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPainelLayout = new javax.swing.GroupLayout(jPainel);
        jPainel.setLayout(jPainelLayout);
        jPainelLayout.setHorizontalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPainelLayout.createSequentialGroup()
                .addComponent(jlImg)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPainelLayout.setVerticalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelLayout.createSequentialGroup()
                .addComponent(BarraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlImg, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
        );

        getContentPane().add(jPainel, java.awt.BorderLayout.CENTER);

        jmbMenu.setBackground(new java.awt.Color(79, 63, 253));

        Arquivo.setText("Arquivo");
        Arquivo.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N

        ObterDadosCSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/icones/csvF.png"))); // NOI18N
        ObterDadosCSV.setText("Obter Dados de CSV");
        ObterDadosCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObterDadosCSVActionPerformed(evt);
            }
        });
        Arquivo.add(ObterDadosCSV);

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/icones/sairF.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Arquivo.add(Sair);

        jmbMenu.add(Arquivo);

        Visualizar.setText("Visualizar");
        Visualizar.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N

        TabelaDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/icones/tabelaF.png"))); // NOI18N
        TabelaDados.setText("Tabela de Dados");
        TabelaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelaDadosActionPerformed(evt);
            }
        });
        Visualizar.add(TabelaDados);

        GraficoConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/icones/graficoF.png"))); // NOI18N
        GraficoConsumo.setText("Gráfico de Consumo");
        GraficoConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficoConsumoActionPerformed(evt);
            }
        });
        Visualizar.add(GraficoConsumo);

        jmbMenu.add(Visualizar);

        Ajuda.setText("Ajuda");
        Ajuda.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N

        Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/icones/sobreF.png"))); // NOI18N
        Sobre.setText("Sobre");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        Ajuda.add(Sobre);

        jmbMenu.add(Ajuda);

        setJMenuBar(jmbMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void TabelaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelaDadosActionPerformed
        DefaultTableModel model = tgc.getTableModel();
        tgc.getTableModel().getDataVector().removeAllElements();
        for (DadoConsumo dc : dcc.getDados()) {
            model.addRow(new Object[]{dc.getDataHora(), dc.getIdPontoColeta(), dc.getValorKwH()});
        }
        tgc.setTableModel(model);
        tgc.setVisible(true);
    }//GEN-LAST:event_TabelaDadosActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void ObterDadosCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObterDadosCSVActionPerformed
        buscarArquivoCSV();
    }//GEN-LAST:event_ObterDadosCSVActionPerformed

    private void GraficoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficoConsumoActionPerformed
        new TabelaGraficoConsumo().setVisible(true);
        preencherComboBox();
    }//GEN-LAST:event_GraficoConsumoActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        new Sobre().setVisible(true);
    }//GEN-LAST:event_SobreActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSobreActionPerformed
        new Sobre().setVisible(true);
    }//GEN-LAST:event_buttonSobreActionPerformed

    private void buttonGraficoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGraficoConsumoActionPerformed
        
    }//GEN-LAST:event_buttonGraficoConsumoActionPerformed

    private void buttonTabelaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTabelaDadosActionPerformed
        DefaultTableModel model = tgc.getTableModel();
        tgc.getTableModel().getDataVector().removeAllElements();
        for (DadoConsumo dc : dcc.getDados()) {
            model.addRow(new Object[]{dc.getDataHora(), dc.getIdPontoColeta(), dc.getValorKwH()});
        }
        tgc.setTableModel(model);
        tgc.setVisible(true);
      //  tgc.abrirAbaTabela();
    }//GEN-LAST:event_buttonTabelaDadosActionPerformed

    private void buttonObterDadosCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonObterDadosCSVActionPerformed
        buscarArquivoCSV();
    }//GEN-LAST:event_buttonObterDadosCSVActionPerformed

    /**
     * @param args the command line arguments
     */
    public void buscarArquivoCSV() {

        try {
            dcc.getDados().clear();
            JFileChooser jfc = new JFileChooser();
            int retorno = jfc.showOpenDialog(null);
            if (retorno == JFileChooser.APPROVE_OPTION) {
                File arq = jfc.getSelectedFile();

                dcc.obterDadosCSV(arq);
                dcc.preencherPontoColeta();
                tgc.preencherComboBox();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
    
    public void preencherComboBox() {
        tgc.getJcbPontoColeta().removeAllItems();

        Iterator i = dcc.getListaPontoColeta().iterator();
        while (i.hasNext()) {
            tgc.getJcbPontoColeta().addItem((String) i.next());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ajuda;
    private javax.swing.JMenu Arquivo;
    private javax.swing.JToolBar BarraFerramentas;
    private javax.swing.JMenuItem GraficoConsumo;
    private javax.swing.JMenuItem ObterDadosCSV;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JMenuItem TabelaDados;
    private javax.swing.JMenu Visualizar;
    private javax.swing.JButton buttonGraficoConsumo;
    private javax.swing.JButton buttonObterDadosCSV;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonSobre;
    private javax.swing.JButton buttonTabelaDados;
    private javax.swing.JPanel jPainel;
    private javax.swing.JLabel jlImg;
    private javax.swing.JMenuBar jmbMenu;
    // End of variables declaration//GEN-END:variables
}
