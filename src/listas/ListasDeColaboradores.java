package listas;

import classes.Colaborador;
import classes.Funcionario;
import classes.Gerente;
import classes.Supervisor;

import java.util.ArrayList;
import java.util.List;

public class ListasDeColaboradores {
    private static List<Funcionario> funcionarioLista = new ArrayList<>();
    private static ArrayList<Supervisor> supervisorLista = new ArrayList<>();
     private static ArrayList<Gerente> gerenteLista = new ArrayList<>();
    ArrayList<Colaborador> colaboradorLista = new ArrayList<>();


    public static ArrayList<Supervisor> getSupervisorLista() {
        return supervisorLista;
    }

    public static ArrayList<Gerente> getGerenteLista() {
        return gerenteLista;
    }

    public ArrayList<Colaborador> getColaboradorLista() {
        return colaboradorLista;
    }

    public static List<Funcionario> getFuncionarioLista() {
        return funcionarioLista;
    }

    public static void addFuncionario(Funcionario funcionario){
        funcionarioLista.add(funcionario);

    }
    public static void addSupervisor(Supervisor supervisor){
        supervisorLista.add(supervisor);

    }

    public static void addGerente(Gerente gerente){
        gerenteLista.add(gerente);

    }




}
