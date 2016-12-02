package svacee.ctrl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import svacee.model.DadoConsumo;

/**
 *
 * @author keylavsf
 */

public class DadoConsumoCtrl {

    private File arq;
    private List<DadoConsumo> dados = new ArrayList<>();
    private List<String> listaPontoColeta = new ArrayList<>();
    private List<DadoConsumo> listaGrafico = new ArrayList<>();

    public void obterDadosCSV(File arq) throws FileNotFoundException, IOException {

        setArq(arq);

        String linha = "";
        String[] linhas;
        String[] coluna;

        BufferedReader br = null;
        FileReader fr = new FileReader(arq);

        br = new BufferedReader(fr);

        DadoConsumo sdc;

        while ((linha = br.readLine()) != null) {
            linhas = linha.split(";");

            for (String v : linhas) {
                coluna = v.split(",");

                sdc = new DadoConsumo();

                sdc.setDataHora(Timestamp.valueOf(coluna[0]));
                sdc.setIdPontoColeta(coluna[1]);
                sdc.setValorKwH(Double.parseDouble(coluna[2]));

                getDados().add(sdc);
            }
        }
    }

    public void preencherPontoColeta() {
        for (DadoConsumo sdc : getDados()) {
            if (!listaPontoColeta.contains(sdc.getIdPontoColeta())) {
                getListaPontoColeta().add(sdc.getIdPontoColeta());
            } else {
                //System.out.println("Ponto já existe!");
            }
        }
    }

    public void preencherGrafico(String item) {
        for (DadoConsumo sdc : getDados()) {
            if (sdc.getIdPontoColeta().equalsIgnoreCase(item)) {
                sdc.getDataHora();
                sdc.getValorKwH();
                getListaGrafico().add(sdc);

            }
        }
    }

    public File getArq() {
        return arq;
    }

    public void setArq(File arq) {
        this.arq = arq;
    }

    public List<DadoConsumo> getDados() {
        return dados;
    }

    public void setDados(List<DadoConsumo> dados) {
        this.dados = dados;
    }

    public List<String> getListaPontoColeta() {
        return listaPontoColeta;
    }

    public void setListaPontoColeta(List<String> listaPontoColeta) {
        this.listaPontoColeta = listaPontoColeta;
    }

    public List<DadoConsumo> getListaGrafico() {
        return listaGrafico;
    }

    public void setListaGrafico(List<DadoConsumo> listaGrafico) {
        this.listaGrafico = listaGrafico;
    }
}
