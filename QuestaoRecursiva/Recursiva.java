package QuestaoRecursiva;
//dado um vetor ordenado de 100 a 200 e um numero x informado pelo usuario calcule quantos espaços
//são necessarios ate que a posição de número seja encontrado
public class Recursiva {
    int posicaoInicial;
    int posicaoFinal;
    int vet[];

    public Recursiva(int posicaoInicial, int posiciaoFinal) {
        this.posicaoInicial = posicaoInicial;
        this.posicaoFinal = posiciaoFinal;
        int posicaovet = posiciaoFinal-posicaoInicial;
        vet = new int[posicaovet+1];
        for (int i = 0; i <vet.length ; i++) {
            vet[i] = this.posicaoInicial;
            this.posicaoInicial++;
        }
    }

    public int recursividade(int num, int posicaoInicial, int posicaoFinal){
       if (num == posicaoInicial || posicaoFinal==num){
           return 1;
       }

       else if (num>(posicaoFinal+posicaoInicial)/2){
           return 1+recursividade(num, (posicaoInicial+posicaoFinal)/2, posicaoFinal );
       }

       else{
           return 1+recursividade(num, posicaoInicial, (posicaoInicial+posicaoFinal)/2);
       }

    }


}
