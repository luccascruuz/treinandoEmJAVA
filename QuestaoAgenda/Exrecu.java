package QuestaoAgenda;

public class Exrecu {

     public void preencher(Pessoa aux1[], Pessoa aux2[], int pos){
         if (pos == aux1.length){
             return;
         }
         aux2[pos] = aux1[pos];
         preencher(aux1, aux2, pos+1);
     }
}
