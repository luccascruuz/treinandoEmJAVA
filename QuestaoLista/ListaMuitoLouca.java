package QuestaoLista;

import java.util.Arrays;

public class ListaMuitoLouca {
    int vet[] = new int[5];

    public void AddNum(int num, int pos){
        int cont = 0;
        for (int i = 0; i <vet.length ; i++) {
            if (vet[i]!= 0){
                cont++;
            }
        }
        if (cont==vet.length){
            System.out.println("Lista está cheia, remova algo da lista");
            return;
        }
        vet[pos] = num;
    }

    public int BuscarNum(int num, int pos) {
        try {
            if (num == vet[pos]) {
                System.out.println("O item buscado está na posição: "); return pos;
            }
        }
        catch (Exception e ){
            System.out.println("Lista está vazia");
            return 0;
        }

       return BuscarNum(num, pos+1);
    }

    public void RemoverNome(int num){
        vet[BuscarNum(num, 0)] = 0;
        return;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListaMuitoLouca)) return false;
        ListaMuitoLouca that = (ListaMuitoLouca) o;
        return Arrays.equals(vet, that.vet);
    }

    @Override
    public String toString() {
        return "ListaMuitoLouca{ "+ Arrays.toString(vet) +" }";
    }
}
