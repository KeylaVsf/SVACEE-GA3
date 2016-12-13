package svacee.view;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import svacee.ctrl.DadoConsumoCtrl;
import svacee.model.DadoConsumo;

/**
 *
 * @author keylavsf
 */

public class Inicial extends javax.swing.JFrame {

    DadoConsumoCtrl dcc = new DadoConsumoCtrl();
    DadoConsumo dc = new DadoConsumo();
    String itemSelect;

    public Inicial() {
        initComponents();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jlImg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Grafico = new javax.swing.JPanel();
        VisualizarGrafico = new javax.swing.JButton();
        Informacao = new javax.swing.JLabel();
        pontoColeta = new javax.swing.JComboBox<String>();
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

        buttonSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/images/care-about-planet.png"))); // NOI18N
        buttonSobre.setFocusable(false);
        buttonSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSobreActionPerformed(evt);
            }
        });
        BarraFerramentas.add(buttonSobre);

        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/images/exit.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlImg, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Inicial", jPanel1);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data e Hora", "Valor ID Ponto Coleta", "Valor KwH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tabela Consumo", jPanel2);

        VisualizarGrafico.setText("Visualizar gráfico");
        VisualizarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarGraficoActionPerformed(evt);
            }
        });

        Informacao.setFont(new java.awt.Font("Serif", 0, 17)); // NOI18N
        Informacao.setText("Selecionar gráfico:");

        pontoColeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoColetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GraficoLayout = new javax.swing.GroupLayout(Grafico);
        Grafico.setLayout(GraficoLayout);
        GraficoLayout.setHorizontalGroup(
            GraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GraficoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(GraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GraficoLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(VisualizarGrafico)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GraficoLayout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addComponent(Informacao)
                        .addGap(82, 82, 82)
                        .addComponent(pontoColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        GraficoLayout.setVerticalGroup(
            GraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GraficoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(GraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Informacao)
                    .addComponent(pontoColeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(VisualizarGrafico)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Grafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Grafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Grafico Consumo", jPanel3);

        javax.swing.GroupLayout jPainelLayout = new javax.swing.GroupLayout(jPainel);
        jPainel.setLayout(jPainelLayout);
        jPainelLayout.setHorizontalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPainelLayout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPainelLayout.setVerticalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelLayout.createSequentialGroup()
                .addComponent(BarraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
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
        jTabbedPane1.setSelectedComponent(jPanel2);
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.getDataVector().removeAllElements();
        for (DadoConsumo dc : dcc.getDados()) {
            model.addRow(new Object[]{dc.getDataHora(), dc.getIdPontoColeta(), dc.getValorKwH()});
        }
    }//GEN-LAST:event_TabelaDadosActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void ObterDadosCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObterDadosCSVActionPerformed
        buscarArquivoCSV();
    }//GEN-LAST:event_ObterDadosCSVActionPerformed

    private void GraficoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficoConsumoActionPerformed
        jTabbedPane1.setSelectedComponent(jPanel3);
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
        jTabbedPane1.setSelectedComponent(jPanel3);
    }//GEN-LAST:event_buttonGraficoConsumoActionPerformed

    private void buttonTabelaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTabelaDadosActionPerformed
        jTabbedPane1.setSelectedComponent(jPanel2);
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.getDataVector().removeAllElements();
        for (DadoConsumo dc : dcc.getDados()) {
            model.addRow(new Object[]{dc.getDataHora(), dc.getIdPontoColeta(), dc.getValorKwH()});
        }
    }//GEN-LAST:event_buttonTabelaDadosActionPerformed

    private void buttonObterDadosCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonObterDadosCSVActionPerformed
        buscarArquivoCSV();
    }//GEN-LAST:event_buttonObterDadosCSVActionPerformed

    private void VisualizarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarGraficoActionPerformed
        montarGrafico();
    }//GEN-LAST:event_VisualizarGraficoActionPerformed

    private void pontoColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoColetaActionPerformed
        dcc.getListaGrafico().clear();
        String item = (String) pontoColeta.getSelectedItem();
        dcc.preencherGrafico(item);
        itemSelect = item;
    }//GEN-LAST:event_pontoColetaActionPerformed

    public void preencherComboBox() {
        pontoColeta.removeAllItems();

        Iterator i = dcc.getListaPontoColeta().iterator();
        while (i.hasNext()) {
            pontoColeta.addItem((String) i.next());
        }
    }
    
    public void montarGrafico() {
        JPanel chartPanel = createChartPanel();
            jTabbedPane1.add(chartPanel, "Gráfico Consumo");
            jTabbedPane1.setSelectedComponent(chartPanel);
    }
    
    private JPanel createChartPanel() {
        String chartTitle = "Gráfico de consumo:" + itemSelect;
        String xAxisLabel = "Hora (Hora.minuto)";
        String yAxisLabel = "Valor KwH";

        XYDataset dataset = createDataset();

        JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
                xAxisLabel, yAxisLabel, dataset);

        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(renderer);

        return new ChartPanel(chart);
    }

    private XYDataset createDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries linha = new XYSeries(itemSelect);

        SimpleDateFormat formataHora = new SimpleDateFormat("HH.mm");

        for (DadoConsumo dc : dcc.getListaGrafico()) {
            linha.add(Double.parseDouble(formataHora.format(dc.getDataHora())), dc.getValorKwH());
            
        }
        dataset.addSeries(linha);

        return dataset;
    }
    
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
                preencherComboBox();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ajuda;
    private javax.swing.JMenu Arquivo;
    private javax.swing.JToolBar BarraFerramentas;
    private javax.swing.JPanel Grafico;
    private javax.swing.JMenuItem GraficoConsumo;
    private javax.swing.JLabel Informacao;
    private javax.swing.JMenuItem ObterDadosCSV;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JMenuItem TabelaDados;
    private javax.swing.JTable Table;
    private javax.swing.JMenu Visualizar;
    private javax.swing.JButton VisualizarGrafico;
    private javax.swing.JButton buttonGraficoConsumo;
    private javax.swing.JButton buttonObterDadosCSV;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonSobre;
    private javax.swing.JButton buttonTabelaDados;
    private javax.swing.JPanel jPainel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jlImg;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JComboBox<String> pontoColeta;
    // End of variables declaration//GEN-END:variables
}
