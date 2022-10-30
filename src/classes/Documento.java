package classes;
import enums.EstadoDoDocumento;

public class Documento {
    public static Integer contador = 0;
    private Integer idDocumento;
    private Integer idColabResp;
    private Integer idColabCria;
    private String linkDocumento;
    private EstadoDoDocumento estadoDoDocumento;

    public Documento(){

    }
    public Documento(Integer idColabResp, Integer idColabCria, String linkDocumento, EstadoDoDocumento estadoDoDocumento) {
        this.idColabResp = idColabResp;
        this.idColabCria = idColabCria;
        this.linkDocumento = linkDocumento;
        this.estadoDoDocumento = estadoDoDocumento;
        this.idDocumento = contador;
        contador++;
    }

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public Integer getIdColabResp() {
        return idColabResp;
    }

    public Integer getIdColabCria() {
        return idColabCria;
    }

    public String getLinkDocumento() {
        return linkDocumento;
    }

    public EstadoDoDocumento getEstadoDoDocumento() {
        return estadoDoDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public void setIdColabResp(Integer idColabResp) {
        this.idColabResp = idColabResp;
    }

    public void setIdColabCria(Integer idColabCria) {
        this.idColabCria = idColabCria;
    }

    public void setLinkDocumento(String linkDocumento) {
        this.linkDocumento = linkDocumento;
    }

    public void setEstadoDoDocumento(EstadoDoDocumento estadoDoDocumento) {
        this.estadoDoDocumento = estadoDoDocumento;
    }
}
