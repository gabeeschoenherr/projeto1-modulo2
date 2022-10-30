package classes;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private Integer id;

    public static Integer contador = 0;
    private String nome;
    private String sobrenome;
    private String dataDeNascimento;
    private String cpf;
    private String enderecoCompleto;

    public Pessoa(){

    }

    public Pessoa(String nome, String sobrenome, String dataDeNascimento, String cpf, String enderecoCompleto) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.enderecoCompleto = enderecoCompleto;
        this.id = contador;
        contador++;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setCpf(String cpf) {
            this.cpf = cpf;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }
    public int idade(String dataDeNascimento){
        LocalDate dataDeNascimentoConvertida = LocalDate.parse(dataDeNascimento);
        LocalDate dataAtual = LocalDate.now();
        if((dataDeNascimentoConvertida != null)&&(dataAtual != null)){
            return Period.between(dataDeNascimentoConvertida, dataAtual).getYears();
        }
        else{
            return 0;
        }

    }
}


