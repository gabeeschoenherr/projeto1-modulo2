import classes.Documento;
import classes.Funcionario;
import classes.Gerente;
import classes.Supervisor;
import enums.EstadoDoDocumento;
import listas.ListadeDocumentos;
import listas.ListasDeColaboradores;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       try {
           menuprincipal();
       }
       catch (Exception e){
           System.out.println("Algo deu errado");
       }

        }

        //MENU PRINCIPAL
        private static void menuprincipal () {
            System.out.println("Digite a sua opção: \n 1 - Entrar em Colaborador.\n 2 - Cadastrar Colaborador. \n 3 - Gerar relatórios. \n 0 - Encerrar programa.");
            Scanner scanner = new Scanner(System.in);
            Integer opInicio = scanner.nextInt();
            switch (opInicio) {
                case 1:
                    entrarEmColaborador();
                    break;

                case 2:
                    cadastrarColaborador();
                    break;
                case 3:
                    gerarRelatorios();
                    break;
                case 0:
                    break;


            }
        }

        //LOGIN DO COLABORADOR
        private static void entrarEmColaborador () {
            System.out.println("Em qual tipo de conta você deseja entrar? \n 1 - Funcionário \n 2 - Supervisor \n 3 - Gerente \n 0 - Encerrar programa.");
            Scanner scanner = new Scanner(System.in);
            Integer opColab = scanner.nextInt();
            switch (opColab) {
                //LOGIN DO FUNCIONÁRIO
                case 1:
                    System.out.println("Os funcionários cadastrados são:");
                    ListasDeColaboradores.getFuncionarioLista().forEach(fun -> System.out.println("Nome: " + fun.getNome() + " ID: " + fun.getId()));
                    System.out.println("Selecione o funcionário pelo ID:");
                    Integer opFunc = scanner.nextInt();
                    Funcionario funcionario2 = new Funcionario();

                    logaFuncionario(opFunc, funcionario2);
                    break;

                //LOGIN DO SUPERVISOR
                case 2:
                    System.out.println("Os supervisores cadastrados são:");
                    ListasDeColaboradores.getSupervisorLista().forEach(sup -> System.out.println("Nome: " + sup.getNome() + " ID: " + sup.getId()));
                    System.out.println("Selecione o supervisor pelo ID:");
                    Integer opSup = scanner.nextInt();
                    Supervisor supervisor2 = new Supervisor();

                    logaSupervisor(opSup, supervisor2);
                    break;

                //LOGIN DO GERENTE
                case 3:
                    System.out.println("Os gerentes cadastrados são:");
                    ListasDeColaboradores.getGerenteLista().forEach(ger -> System.out.println("Nome: " + ger.getNome() + " ID: " + ger.getId()));
                    System.out.println("Selecione o gerente pelo ID:");
                    Integer opGer = scanner.nextInt();
                    Gerente gerente2 = new Gerente();

                    logaGerente(opGer, gerente2);
                    break;

            }
        }

        //CADASTRO DE COLABORADOR
        private static void cadastrarColaborador () {
            System.out.println("Bem-vindo ao sistema de cadastro, digite o tipo de colaborador: \n 1 - Funcionário. \n 2 - Supervisor. \n 3 - Gerente.\n 0 - Voltar");
            Scanner scanner = new Scanner(System.in);
            Integer opCadastro = scanner.nextInt();
            switch (opCadastro) {
                //CADASTRO DE FUNCIONÁRIO
                case 1:
                    System.out.println("Digite seu nome:");
                    String nome = scanner.next();
                    System.out.println("Digite seu sobrenome:");
                    String sobrenome = scanner.next();
                    System.out.println("Digite a data de nascimento, no formato AAAA-MM-DD:");
                    String dataDeNascimento = scanner.next();
                    System.out.println("Digite seu CPF:");
                    String cpf = scanner.next();
                    System.out.println("Digite o endereço completo:");
                    String enderecoCompleto = scanner.next();

                    Funcionario funcionario = new Funcionario(nome, sobrenome, dataDeNascimento, cpf, enderecoCompleto);

                    ListasDeColaboradores.addFuncionario(funcionario);
                    ListasDeColaboradores.getFuncionarioLista().forEach(func -> System.out.println("Funcionário de nome " + func.getNome() + " e de ID" + func.getId()));


                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;
                //CADASTRO DE SUPERVISOR
                case 2:
                    System.out.println("Digite seu nome:");
                    String nome2 = scanner.next();
                    System.out.println("Digite seu sobrenome:");
                    String sobrenome2 = scanner.next();
                    System.out.println("Digite a data de nascimento, no formato AAAA-MM-DD:");
                    String dataDeNascimento2 = scanner.next();
                    System.out.println("Digite seu CPF:");
                    String cpf2 = scanner.next();
                    System.out.println("Digite o endereço completo:");
                    String enderecoCompleto2 = scanner.next();
                    Supervisor supervisor = new Supervisor(nome2, sobrenome2, dataDeNascimento2, cpf2, enderecoCompleto2);

                    ListasDeColaboradores.addSupervisor(supervisor);
                    ListasDeColaboradores.getFuncionarioLista().forEach(sup -> System.out.println("Funcionário de nome " + sup.getNome() + " e de ID" + sup.getId()));

                    System.out.println("Supervisor cadastrado com sucesso!");
                    break;
                //CADASTRO DE GERENTE
                case 3:
                    System.out.println("Digite seu nome:");
                    String nome3 = scanner.next();
                    System.out.println("Digite seu sobrenome:");
                    String sobrenome3 = scanner.next();
                    System.out.println("Digite a data de nascimento, no formato AAAA-MM-DD:");
                    String dataDeNascimento3 = scanner.next();
                    System.out.println("Digite seu CPF:");
                    String cpf3 = scanner.next();
                    System.out.println("Digite o endereço completo:");
                    String enderecoCompleto3 = scanner.next();
                    Gerente gerente = new Gerente(nome3, sobrenome3, dataDeNascimento3, cpf3, enderecoCompleto3);

                    ListasDeColaboradores.addGerente(gerente);
                    ListasDeColaboradores.getGerenteLista().forEach(ger -> System.out.println("Funcionário de nome " + ger.getNome() + " e de ID" + ger.getId()));

                    System.out.println("Gerente cadastrado com sucesso!");
                    break;

                case 0:

                    break;

            }
            //VOLTAR AO MENU PRINCIPAL
            menuprincipal();
        }

        //LOGIN FUNCIONÁRIO
        private static void logaFuncionario (Integer opFunc, Funcionario funcionario2){
            for (Integer i = 0; i < ListasDeColaboradores.getFuncionarioLista().size(); i++) {
                funcionario2 = ListasDeColaboradores.getFuncionarioLista().get(i);
                if (funcionario2.getId() == opFunc) {
                    System.out.println("Usuário logado: " + funcionario2.getNome() + ", de ID: " + funcionario2.getId());
                    System.out.println("Selecione a opção: \n 1 - Criar Documento \n 2 - Tramitar Documento \n 3 - Listar Documentos cadastrados por " + funcionario2.getNome() + "\n 0 - Voltar para o menu Principal");
                    Scanner scanner = new Scanner(System.in);
                    Integer opFuncInterno = scanner.nextInt();
                    opSwitchFuncionario(opFunc, opFuncInterno, funcionario2);

                }
            }

        }

        //OPÇÕES DO FUNCIONÁRIO
        private static void opSwitchFuncionario (Integer opFun, Integer opFuncInterno, Funcionario funcionario2){
            switch (opFuncInterno) {
                //CRIAR DOCUMENTO
                case 1:
                    System.out.println("Criação de documento, digite o link do documento:");
                    Scanner scanner = new Scanner(System.in);
                    String linkDoDocumento = scanner.next();
                    Integer idColabResp = funcionario2.getId();
                    Integer idColabCria = funcionario2.getId();
                    EstadoDoDocumento estadoDoDocumento = EstadoDoDocumento.ATIVO;
                    Documento documento = new Documento(idColabResp, idColabCria, linkDoDocumento, estadoDoDocumento);
                    ListadeDocumentos.addDocCriadoPeloFunc(documento);
                    System.out.println("Documento criado!");
                    ListadeDocumentos.getDocCriadoPeloFunc().forEach(doc -> System.out.println("Documento de ID " + doc.getIdDocumento() + ", Criado pelo funcionário " + doc.getIdColabCria() + " ,Com o link" + doc.getLinkDocumento()));

                    logaFuncionario(opFun, funcionario2);
                    break;
                //TRAMITAR DOCUMENTO
                case 2:
                    for (Integer i = 0; i < ListadeDocumentos.getDocCriadoPeloFunc().size(); i++) {
                        if (ListadeDocumentos.getDocCriadoPeloFunc().get(i).getIdColabCria() == funcionario2.getId()) {
                            System.out.println("Documento de ID: " + ListadeDocumentos.getDocCriadoPeloFunc().get(i).getIdDocumento());

                        }

                    }
                    System.out.println("Escolha o documento que o supervisor irá receber pelo ID:");
                    Scanner scanner2 = new Scanner(System.in);
                    Integer docFuncParaSuper = scanner2.nextInt();
                    System.out.println("Agora escolha da lista abaixo pelo ID o supervisor que irá receber o documento:");
                    ListasDeColaboradores.getSupervisorLista().forEach(sup -> System.out.println("Supervisor " + sup.getNome() + ", de ID " + sup.getId()));
                    Integer supQueIraReceber = scanner2.nextInt();
                    Supervisor supervisor3 = new Supervisor();

                    for (Integer i = 0; i < ListasDeColaboradores.getSupervisorLista().size(); i++) {
                        if (supQueIraReceber == ListasDeColaboradores.getSupervisorLista().get(i).getId()) {
                            supervisor3 = ListasDeColaboradores.getSupervisorLista().get(i);
                        }
                    }


                    for (Integer i = 0; i < ListadeDocumentos.getDocCriadoPeloFunc().size(); i++) {
                        if (docFuncParaSuper == ListadeDocumentos.getDocCriadoPeloFunc().get(i).getIdDocumento()) {
                            Documento docSup = new Documento();
                            ListadeDocumentos.getDocCriadoPeloFunc().get(i).setIdColabResp(supervisor3.getId());

                            docSup = ListadeDocumentos.getDocCriadoPeloFunc().get(i);

                            ListadeDocumentos.addDocDoSupervisor(docSup);

                            ListadeDocumentos.getDocCriadoPeloFunc().remove(ListadeDocumentos.getDocCriadoPeloFunc().get(i));
                            System.out.println("Documento de ID " + docSup.getIdDocumento() + ", enviado para o supervisor responsável " + docSup.getIdColabResp());
                        }

                    }

                    logaFuncionario(opFun, funcionario2);
                    break;
                //LISTAR DOCUMENTOS DO FUNCIONÁRIO ESPECÍFICO
                case 3:
                    System.out.println("Os documentos criados por esse funcionário foram:");
                    for (Integer i = 0; i < ListadeDocumentos.getDocCriadoPeloFunc().size(); i++) {
                        if (funcionario2.getId() == ListadeDocumentos.getDocCriadoPeloFunc().get(i).getIdColabCria()) {
                            System.out.println("Documento de ID: " + ListadeDocumentos.getDocCriadoPeloFunc().get(i).getIdDocumento() + " e de link: " + ListadeDocumentos.getDocCriadoPeloFunc().get(i).getLinkDocumento());

                        }
                    }
                    logaFuncionario(opFun, funcionario2);
                    break;
                //VOLTAR AO MENU PRINCIPAL
                case 0:
                    menuprincipal();
                    break;
            }

        }

        //LOGIN DO SUPERVISOR
        private static void logaSupervisor (Integer opSup, Supervisor supervisor2){
            for (Integer i = 0; i < ListasDeColaboradores.getFuncionarioLista().size(); i++) {
                supervisor2 = ListasDeColaboradores.getSupervisorLista().get(i);
                if (supervisor2.getId() == opSup) {
                    System.out.println("Usuário logado: " + supervisor2.getNome() + ", de ID: " + supervisor2.getId());
                    System.out.println("Selecione a opção: \n 1 - Verificar Documento  \n 0 - Voltar para o menu Principal");
                    Scanner scanner = new Scanner(System.in);
                    Integer opSupcInterno = scanner.nextInt();
                    opSwitchSupervisor(opSupcInterno, opSup, supervisor2);

                }
            }

        }

        //OPÇÕES DO SUPERVISOR
        private static void opSwitchSupervisor (Integer opSupInterno, Integer opSup, Supervisor supervisor2){
            switch (opSupInterno) {
                case 1:
                    System.out.println("Documentos para a verificação:");
                    ListadeDocumentos.getDocDoSupervisor().forEach(doc -> System.out.println("Documento de ID " + doc.getIdDocumento() + " e link " + doc.getLinkDocumento()));
                    System.out.println("Digite o ID do documento que você quer tramitar:");
                    Scanner scanner = new Scanner(System.in);
                    Integer idDocTramSup = scanner.nextInt();
                    System.out.println("Digite sua opção: \n 1 - Retornar documento ao funcionário \n 2 - Encaminhar documento a um gerente");
                    Integer opDocTramSup = scanner.nextInt();
                    switch (opDocTramSup) {
                        //RETORNAR O DOCUMENTO PARA O FUNCIONÁRIO
                        case 1:
                            for (Integer i = 0; i < ListadeDocumentos.getDocDoSupervisor().size(); i++) {
                                if (ListadeDocumentos.getDocDoSupervisor().get(i).getIdDocumento() == idDocTramSup) {
                                    ListadeDocumentos.getDocDoSupervisor().get(i).setIdColabResp(ListadeDocumentos.getDocDoSupervisor().get(i).getIdColabCria());
                                    ListadeDocumentos.addDocCriadoPeloFunc(ListadeDocumentos.getDocDoSupervisor().get(i));
                                    ListadeDocumentos.getDocDoSupervisor().remove(ListadeDocumentos.getDocDoSupervisor().get(i));

                                }

                            }
                            break;
                        //ENCAMINHAR O DOCUMENTO PARA O GERENTE
                        case 2:
                            for (Integer i = 0; i < ListadeDocumentos.getDocDoSupervisor().size(); i++) {
                                if (ListadeDocumentos.getDocDoSupervisor().get(i).getIdDocumento() == idDocTramSup) {
                                    System.out.println("Gerentes disponíveis:");
                                    ListasDeColaboradores.getGerenteLista().forEach(ger -> System.out.println("Gerente de nome " + ger.getNome() + " e de ID " + ger.getId()));
                                    System.out.println("Digite o ID do gerente que receberá o documento:");

                                    Integer idDoGer = scanner.nextInt();
                                    Gerente gerente2 = new Gerente();
                                    for (Integer a = 0; a < ListasDeColaboradores.getGerenteLista().size(); a++) {
                                        if (ListasDeColaboradores.getGerenteLista().get(i).getId() == idDoGer) {
                                            gerente2 = ListasDeColaboradores.getGerenteLista().get(a);
                                            System.out.println("Escolhido gerente " + gerente2.getNome() + ", de ID " + gerente2.getId());
                                        }
                                    }
                                    Documento docGer = new Documento();
                                    docGer = ListadeDocumentos.getDocDoSupervisor().get(i);
                                    docGer.setIdColabResp(gerente2.getId());
                                    ListadeDocumentos.addDocDoGerente(docGer);
                                    ListadeDocumentos.getDocDoSupervisor().remove(ListadeDocumentos.getDocDoSupervisor().get(i));

                                }
                            }

                            break;
                    }
                    logaSupervisor(opSup, supervisor2);
                    break;
                case 0:
                    menuprincipal();
                    break;
            }

        }

        //LOGIN DO GERENTE
        private static void logaGerente (Integer opGer, Gerente gerente2){
            for (Integer i = 0; i < ListasDeColaboradores.getFuncionarioLista().size(); i++) {
                gerente2 = ListasDeColaboradores.getGerenteLista().get(i);
                if (gerente2.getId() == opGer) {
                    System.out.println("Usuário logado: " + gerente2.getNome() + ", de ID: " + gerente2.getId());
                    System.out.println("Selecione a opção: \n 1 - Verificar Documentos \n 2 - Arquivar Documentos \n 3 - Desarquivar Documentos \n 0 - Voltar para o menu Principal");
                    Scanner scanner = new Scanner(System.in);
                    Integer opGerInterno = scanner.nextInt();
                    opSwitchGerente(opGerInterno, opGer, gerente2);

                }
            }

        }
        //OPÇÕES DO GERENTE
        private static void opSwitchGerente (Integer opGerInterno, Integer opGer, Gerente gerente2){
            switch (opGerInterno) {
                //VERIFICAR DOCUMENTOS
                case 1:
                    System.out.println("Esses são os documentos disponíveis para o gerente " + gerente2.getNome() + ":");

                    for (Integer i = 0; i < ListadeDocumentos.getDocDoGerente().size(); i++) {
                        if (ListadeDocumentos.getDocDoGerente().get(i).getIdColabResp() == gerente2.getId()) {
                            System.out.println("O ID do documento é " + ListadeDocumentos.getDocDoGerente().get(i).getIdDocumento() + " e seu link é " + ListadeDocumentos.getDocDoGerente().get(i).getLinkDocumento());
                        }
                    }
                    logaGerente(opGer, gerente2);
                    break;
                //ARQUIVAR DOCUMENTOS
                case 2:

                    System.out.println("Esses são os documentos disponíveis para o gerente " + gerente2.getNome() + ":");

                    for (Integer a = 0; a < ListadeDocumentos.getDocDoGerente().size(); a++) {
                        if (ListadeDocumentos.getDocDoGerente().get(a).getIdColabResp() == gerente2.getId()) {
                            System.out.println("O ID do documento é " + ListadeDocumentos.getDocDoGerente().get(a).getIdDocumento() + " e seu link é " + ListadeDocumentos.getDocDoGerente().get(a).getLinkDocumento());
                        }
                    }
                    System.out.println("Escolha pelo ID qual documento você quer arquivar:");
                    Scanner scanner = new Scanner(System.in);
                    Integer opGerDocArquivar = scanner.nextInt();
                    for (Integer i = 0; i < ListadeDocumentos.getDocDoGerente().size(); i++) {
                        if (opGerDocArquivar == ListadeDocumentos.getDocDoGerente().get(i).getIdDocumento()) {
                            ListadeDocumentos.addDocArquivados(ListadeDocumentos.getDocDoGerente().get(i));
                            ListadeDocumentos.getDocDoGerente().remove(ListadeDocumentos.getDocDoGerente().get(i));
                            System.out.println("O documento foi arquivado com sucesso!");
                        }

                    }
                    logaGerente(opGer, gerente2);
                    break;
                //DESARQUIVAR DOCUMENTOS
                case 3:
                    System.out.println("Esses são os documentos arquivados:");
                    ListadeDocumentos.getDocArquivados().forEach(doc -> System.out.println("Documento de ID " + doc.getIdDocumento() + ". Criado pelo funcionário " + doc.getIdColabCria() + ". Arquivado pelo gerente " + doc.getIdColabResp()));
                    System.out.println("Escolha o documento para ser desarquivado pelo ID:");
                    Scanner scanner2 = new Scanner(System.in);
                    Integer opDocDes = scanner2.nextInt();
                    for (Integer i = 0; i < ListadeDocumentos.getDocArquivados().size(); i++) {
                        if (ListadeDocumentos.getDocArquivados().get(i).getIdDocumento() == opDocDes) {
                            ListadeDocumentos.getDocArquivados().get(i).setIdColabResp(gerente2.getId());
                            ListadeDocumentos.addDocDoGerente(ListadeDocumentos.getDocArquivados().get(i));
                            ListadeDocumentos.getDocArquivados().remove(ListadeDocumentos.getDocArquivados().get(i));


                        }


                    }
                    logaGerente(opGer, gerente2);
                    break;


                case 0:
                    menuprincipal();
                    break;
            }

        }

        //GERAR RELATÓRIOS
        private static void gerarRelatorios () {
            System.out.println("Escolha o tipo de relatório que você quer gerar: \n 1 - Todos os documentos. \n 2 - Todos os colaboradores. \n 3 - Total de documentos arquivados. \n 0 - Voltar ao menu principal. ");
            Scanner scanner = new Scanner(System.in);
            Integer opGerarRela = scanner.nextInt();
            switch (opGerarRela) {
                case 1:
                    ListadeDocumentos.getDocCriadoPeloFunc().forEach(doc -> System.out.println("Documento de ID " + doc.getIdDocumento() + ". Criado pelo funcionário " + doc.getIdColabCria() + ". Com o colaborador responsável " + doc.getIdColabResp() + ". E de link " + doc.getLinkDocumento()));
                    ListadeDocumentos.getDocDoSupervisor().forEach(doc -> System.out.println("Documento de ID " + doc.getIdDocumento() + ". Criado pelo funcionário " + doc.getIdColabCria() + ". Com o colaborador responsável " + doc.getIdColabResp() + ". E de link " + doc.getLinkDocumento()));
                    ListadeDocumentos.getDocDoGerente().forEach(doc -> System.out.println("Documento de ID " + doc.getIdDocumento() + ". Criado pelo funcionário " + doc.getIdColabCria() + ". Com o colaborador responsável " + doc.getIdColabResp() + ". E de link " + doc.getLinkDocumento()));
                    menuprincipal();
                    break;
                case 2:
                    System.out.println("Funcionários:");
                    ListasDeColaboradores.getFuncionarioLista().forEach(fun -> System.out.println("Funcionário de nome " + fun.getNome() + " " + fun.getSobrenome() + ". De ID " + fun.getId()));
                    System.out.println("Supervisores:");
                    ListasDeColaboradores.getSupervisorLista().forEach(sup -> System.out.println("Supervisor de nome " + sup.getNome() + " " + sup.getSobrenome() + ". De ID " + sup.getId()));
                    System.out.println("Gerentes");
                    ListasDeColaboradores.getGerenteLista().forEach(ger -> System.out.println("Gerente de nome " + ger.getNome() + " " + ger.getSobrenome() + ". De ID " + ger.getId()));
                    menuprincipal();
                    break;
                case 3:
                    System.out.println("A quantidade de itens arquivados é de " + ListadeDocumentos.getDocArquivados().size());
                    menuprincipal();
                    break;
                case 0:
                    menuprincipal();
                    break;
            }


        }

}