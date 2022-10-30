package enums;

public enum EstadoDoDocumento {
    ARQUIVADO("Arquivado"),
    ATIVO("Ativo");

    private String estadoDoDocumentoOp;
    EstadoDoDocumento(String estadoDoDocumentoOp) {
        this.estadoDoDocumentoOp = estadoDoDocumentoOp;
    }
    public String getEstadoDoDocumentoOp(){
        return estadoDoDocumentoOp;
    }
}
