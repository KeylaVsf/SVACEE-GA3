package svacee.view;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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

public class TabelaGraficoConsumo extends javax.swing.JFrame {

    DadoConsumoCtrl dcc = new DadoConsumoCtrl();
    String itemSelect;
    
    public TabelaGraficoConsumo() {
        initComponents();
        Sair.setToolTipText("Voltar à Tela Inicial");
    }

    public void preencherComboBox() {
        getJcbPontoColeta().removeAllItems();

        Iterator i = dcc.getListaPontoColeta().iterator();
        while (i.hasNext()) {
            getJcbPontoColeta().addItem((String) i.next());
        }
    }
    
    public void montarGrafico() {
        JPanel grafico = createChartPanel();
        add(grafico, BorderLayout.CENTER);
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
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
    
    public void setTableModel(TableModel model){
        Table.setModel(model);
    }
    
    public DefaultTableModel getTableModel(){
        return (DefaultTableModel) Table.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        Sair = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Guias = new javax.swing.JTabbedPane();
        Tabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Grafico = new javax.swing.JPanel();
        VisualizarGrafico = new javax.swing.JButton();
        Informacao = new javax.swing.JLabel();
        PontoColeta = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela de Consumo de Energia - SVACEE");

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/icones/sairb.png"))); // NOI18N
        Sair.setFocusable(false);
        Sair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Sair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Tabela e Gráfico de Consumo de Energia");

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

        javax.swing.GroupLayout TabelaLayout = new javax.swing.GroupLayout(Tabela);
        Tabela.setLayout(TabelaLayout);
        TabelaLayout.setHorizontalGroup(
            TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        TabelaLayout.setVerticalGroup(
            TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Guias.addTab("Tabela", Tabela);

        VisualizarGrafico.setText("Visualizar gráfico");
        VisualizarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarGraficoActionPerformed(evt);
            }
        });

        Informacao.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        Informacao.setText("Selecionar gráfico por equipamento:");

        PontoColeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PontoColetaActionPerformed(evt);
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
                        .addComponent(Informacao)
                        .addGap(18, 18, 18)
                        .addComponent(PontoColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GraficoLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(VisualizarGrafico)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        GraficoLayout.setVerticalGroup(
            GraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GraficoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(GraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Informacao)
                    .addComponent(PontoColeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(VisualizarGrafico)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        Guias.addTab("Visualizar Gráfico", Grafico);

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Guias)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sair)))
                .addContainerGap())
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sair))
                .addGap(18, 18, 18)
                .addComponent(Guias)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void VisualizarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarGraficoActionPerformed
        montarGrafico();
    }//GEN-LAST:event_VisualizarGraficoActionPerformed

    private void PontoColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PontoColetaActionPerformed
        dcc.getListaGrafico().clear();
        String item = (String) getJcbPontoColeta().getSelectedItem();
        dcc.preencherGrafico(item);
        itemSelect = item;
    }//GEN-LAST:event_PontoColetaActionPerformed

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
            java.util.logging.Logger.getLogger(TabelaGraficoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaGraficoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaGraficoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaGraficoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaGraficoConsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Grafico;
    private javax.swing.JTabbedPane Guias;
    private javax.swing.JLabel Informacao;
    private javax.swing.JPanel Painel;
    private javax.swing.JComboBox<String> PontoColeta;
    private javax.swing.JButton Sair;
    private javax.swing.JPanel Tabela;
    private javax.swing.JTable Table;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VisualizarGrafico;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jcbPontoColeta
     */
    public javax.swing.JComboBox<String> getJcbPontoColeta() {
        return PontoColeta;
    }

    /**
     * @param jcbPontoColeta the jcbPontoColeta to set
     */
    public void setJcbPontoColeta(javax.swing.JComboBox<String> jcbPontoColeta) {
        this.PontoColeta = jcbPontoColeta;
    }
}
