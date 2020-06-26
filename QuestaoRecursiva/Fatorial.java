package QuestaoRecursiva;

public class Fatorial {
    public int fatorial(int num){
        if (num<2){
            return 1;
        }
        else{
            return num*fatorial(num-1);
        }
    }
}
