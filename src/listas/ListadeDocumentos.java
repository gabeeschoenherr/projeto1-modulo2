package listas;

import classes.Documento;
import classes.Funcionario;
import classes.Supervisor;

import java.util.ArrayList;
import java.util.List;

public class ListadeDocumentos {
    private static List<Documento> docCriadoPeloFunc = new ArrayList<>();
    private static List<Documento> docDoSupervisor = new ArrayList<>();

    private static  List<Documento> docDoGerente = new ArrayList<>();

    private static List<Documento> docArquivados = new ArrayList<>();

    public static void addDocCriadoPeloFunc(Documento documento){
        docCriadoPeloFunc.add(documento);

    }
    public static void addDocDoSupervisor(Documento documento){
        docDoSupervisor.add(documento);
    }

    public static void addDocDoGerente(Documento documento){
        docDoGerente.add(documento);
    }

    public static void addDocArquivados(Documento documento){
        docArquivados.add(documento);
    }

    public static List<Documento> getDocCriadoPeloFunc() {
        return docCriadoPeloFunc;
    }
    public static List<Documento> getDocDoSupervisor() {
        return docDoSupervisor;
    }
    public static List<Documento> getDocDoGerente() {
        return docDoGerente;
    }
    public static List<Documento> getDocArquivados() {
        return docArquivados;
    }
}
