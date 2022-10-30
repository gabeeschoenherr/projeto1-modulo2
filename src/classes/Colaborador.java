package classes;

public abstract class Colaborador extends Pessoa {

    public Colaborador(){

    }
    public Colaborador(String nome, String sobrenome, String dataDeNascimento, String cpf, String enderecoCompleto) {
        super(nome, sobrenome, dataDeNascimento, cpf, enderecoCompleto);
    }

    public void cadastrarDocumento(){

    }
    public void listarDocumento(){

    }
    public void tramitarDocumento(){

    }

}
