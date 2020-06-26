package Questao1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String entrada = ler.next();
        int cont = 0;

        while (cont < entrada.length()){
            if (entrada.charAt(cont) != entrada.charAt(entrada.length()-cont-1)){
                System.out.println("falso");
                cont=entrada.length();
            }
            cont++;
        }
        if (cont == entrada.length()){
            System.out.println("verdadeiro");
        }
    }
}
