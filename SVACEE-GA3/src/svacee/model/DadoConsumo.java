package svacee.model;

import java.sql.Timestamp;

/**
 *
 * @author keylavsf
 */

public class DadoConsumo {

    private Timestamp dataHora;
    private String idPontoColeta;
    private double valorKwH;
    
    public DadoConsumo(){
        
    }

    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }

    public String getIdPontoColeta() {
        return idPontoColeta;
    }

    public void setIdPontoColeta(String idPontoColeta) {
        this.idPontoColeta = idPontoColeta;
    }

    public double getValorKwH() {
        return valorKwH;
    }

    public void setValorKwH(double valorKwH) {
        this.valorKwH = valorKwH;
    }
}
