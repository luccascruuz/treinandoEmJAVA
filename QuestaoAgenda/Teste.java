package QuestaoAgenda;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Agenda addAgenda = new Agenda();
        Pessoa p = new Pessoa("ana", "maria", "012", "65");
        Filho f = new Filho("Luccas", "ribeiro", "026", "25", "012");
        Pessoa s = new Pessoa("ge", "cruz", "013", "65");
        Pessoa p1 = new Pessoa("f", "s", "05", "d");
        Pessoa p2 = new Pessoa("q", "ss", "06", "dd");
        Pessoa p4 = new Pessoa("s", "w", "08", "44");
        Pessoa p3 = new Pessoa("xx", "aa", "01", "44");
        Filho f1 = new Filho("dd", "dd", "ni", "dd", "05");
        Filho f2 = new Filho("rr", "ff", "ff", "ff", "01");
        addAgenda.addPessoa(p);
        addAgenda.addPessoa(p1);
        addAgenda.addPessoa(p2);
        addAgenda.addPessoa(p3);
        addAgenda.addPessoa(p4);
        addAgenda.addPessoa(f1);
        addAgenda.addPessoa(f2);
        addAgenda.addPessoa(f);
        addAgenda.addPessoa(s);
        addAgenda.listar();
        System.out.println("n tem filhos");
        addAgenda.naotemfilho();


       /*Scanner entrada = new Scanner(System.in);
        int cont = 10;
        while (cont!=0){
            System.out.println("---------- MENU ----------");
            System.out.println("1 - Adicionar Pessoa");
            System.out.println("2 - Adicionar Filho");
            System.out.println("3 - Mostrar todos os contatos da Agenda");
            System.out.println("4 - Remover Pessoa");
            System.out.println("5 - Relatório dos filhos de uma mãe");
            System.out.println("6 - Relatório de todos os filhos na agenda");
            System.out.println("7 - Pessoas que não tem filhos");
            System.out.println("0 - Finalizar programa");
            int num = entrada.nextInt();
            switch (num){
                case 1: {
                    System.out.println("Digite o nome da pessoa: ");
                    String np = entrada.next();
                    System.out.println("Digite o sobrenome da pessoa: ");
                    String sp = entrada.next();
                    System.out.println("Digite o CPF da pessoa: ");
                    String cp = entrada.next();
                    System.out.println("Digite a idade da pessoa: ");
                    String ip = entrada.next();
                    Pessoa p = new Pessoa(np, sp, cp, ip);
                    addAgenda.addPessoa(p);
                    break;
                }
                case 2: {
                    System.out.println("Digite o nome do Filho: ");
                    String nf = entrada.next();
                    System.out.println("Digite o sobrenome do Filho: ");
                    String ns = entrada.next();
                    System.out.println("Digite o cpf do filho: ");
                    String cf = entrada.next();
                    System.out.println("Digite a idade do filho: ");
                    String idf = entrada.next();
                    System.out.println("Digite o cpf da mãe: ");
                    String cm = entrada.next();
                    System.out.println("O filho tem pai?");
                    String tp = entrada.next();
                    if (tp.equalsIgnoreCase("sim")){
                        System.out.println("Digite o cpf do pai: ");
                        String cp = entrada.next();
                        Filho f = new Filho(nf, ns, cf, idf, cm, cp);
                        addAgenda.addPessoa(f);
                    }
                    else {
                        Filho f = new Filho(nf, ns, cf, idf, cm);
                        addAgenda.addPessoa(f);
                    }
                    break;
                }
                case 3: {
                    addAgenda.listar();
                    break;
                }
                case 4: {
                    System.out.println("Digite o cpf da pessoa para remover da agenda: ");
                    String cr = entrada.next();
                    addAgenda.RemoverPessoas(cr);
                    break;
                }
                case 5: {
                    System.out.println("Digite o cpf da mãe: ");
                    String cm = entrada.next();
                    addAgenda.filhosdamae(cm);
                    break;
                }
                case 6: {
                    addAgenda.todosfilhos();
                }
                case 7:{
                    addAgenda.naotemfilho();
                    break;
                }
                case 0: {
                    cont = 0;
                    break;
                }
            }
        }*/
    }

}
