package QuestaoOrdenacao;

import java.util.Random;

public class OrdenacaoSelecao {
    Random random = new Random();
    int vet[]= {2, 9, 8, 1, 10, 3};
    int vetaux[] = new int[vet.length];
    int num;
    int cont;
    /*public void preenchervet(){
        for (int i = 0; i <vet.length ; i++) {
            num = random.nextInt(10)+1;
            if (i != 0) {
                cont = 0;
                while (cont < i) {
                    if (vet[cont] == num) {
                        num = random.nextInt(10) + 1;
                        cont = 0;
                    } else {
                        cont++;
                    }
                }
            }
            vet[i]=num;
        }
    }*/
    public void printvet(){
        for (int i = 0; i <vet.length ; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println( " " );
    }
    public void mergesort(){
        OrdenaMergeSort(vet, vetaux, 0, vet.length-1);
    }
    public void OrdenaBolha(){
        for (int i = vet.length-1; i >=1; i--) {
            for (int j = 0; j <i ; j++) {
                if (vet[j]>vet[j+1]){
                    int aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1]= aux;
                }
            }
        }
    }
    public void OrdenaMergeSort(int vet[], int aux[], int inicio, int fim){
        if (inicio<fim){
            int meio = (inicio+fim)/2;
            OrdenaMergeSort(vet, vetaux, inicio, meio);
            OrdenaMergeSort(vet, vetaux, meio+1, fim);
            Intercalar(vet, vetaux, inicio, meio, fim);
        }
    }
    public void Intercalar(int vet[], int vetaux[], int inicio, int meio, int fim){
        for (int k = inicio; k <=fim ; k++) {
            vetaux[k] = vet[k];
        }

        int i = inicio;
        int j = meio+1;

        for (int k = inicio; k <=fim ; k++) {
            if (i>meio){
                vet[k] = vetaux[j++];
            }
            else if(j>fim){
                vet[k] = vetaux[i++];
            }
            else if (vetaux[i]<vetaux[j]){
                vet[k] = vetaux[i++];
            }
            else{
                vet[k] = vetaux[j++];
            }
        }
    }
    public void OrdenaSelessa(){
        int aux = 100;
       for (int i = 0; i <vet.length ; i++) {
            for (int j = 0; j <vet.length ; j++) {
                if (vet[i]<vet[j]){
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }
}
