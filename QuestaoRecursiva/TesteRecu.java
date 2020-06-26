package QuestaoRecursiva;
import java.util.Scanner;

public class TesteRecu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite posição Inicial: ");
        int pi = entrada.nextInt();
        System.out.println("Digite a posição Final");
        int pf = entrada.nextInt();
       Recursiva recursiva = new Recursiva(pi, pf);

        System.out.println("Digite o número que procura: ");
        int num = entrada.nextInt();
        System.out.println(recursiva.recursividade(num, pi, pf));


    }
}
