package classes;

import enums.EstadoDoDocumento;
import listas.ListadeDocumentos;

import java.util.Scanner;

public class Funcionario extends Colaborador {

    public Funcionario() {

    }

    public Funcionario(String nome, String sobrenome, String dataDeNascimento, String cpf, String enderecoCompleto) {
        super(nome, sobrenome, dataDeNascimento, cpf, enderecoCompleto);
    }

}
