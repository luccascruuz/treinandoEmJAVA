package QuestaoLista;

import java.util.Scanner;

public class TesteLista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaMuitoLouca Lml = new ListaMuitoLouca();
        int cont = 100;

      while (cont!=0){
            System.out.println("---------- MENU ----------");
            System.out.println("1 - Adicionar na lista");
            System.out.println("2 - Buscar na lista");
            System.out.println("3 - Remover da lista");
            System.out.println("4 - Listar todos os itens da lista");
            System.out.println("0 - Finalizar programa");
            int numero = entrada.nextInt();
            switch (numero){
                case 1: {
                    System.out.println("Digite o nome que vai adicionar na lista: ");
                    int nome = entrada.nextInt();
                    System.out.println("Digite o número da posição: ");
                    int posicao = entrada.nextInt();
                    Lml.AddNum(nome, posicao-1);
                    break;
                }
                case 2: {
                    System.out.println("Digite o nome que você quer buscar na Lista: ");
                    int nome = entrada.nextInt();
                    System.out.println(Lml.BuscarNum(nome, 0));
                    break;
                }
                case 3: {
                    System.out.println("Digite o nome que você quer remover: ");
                    int nome = entrada.nextInt();
                    Lml.RemoverNome(nome);
                    break;
                }
                case 4: {
                    System.out.println(Lml.toString());
                    break;
                }
                case 0: {
                    cont = 0;
                    break;
                }
            }
        }
    }
}
