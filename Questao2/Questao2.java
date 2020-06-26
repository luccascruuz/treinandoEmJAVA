package Questao2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x = entrada.nextInt();
        double f = x;
        int cont = 0;

        while(x>1){
            f = f*(x-1);
            x--;
            cont++;
        }

        System.out.println(cont);
    }
}
