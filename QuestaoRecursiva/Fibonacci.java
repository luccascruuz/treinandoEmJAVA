package QuestaoRecursiva;

public class Fibonacci {
    public int fibonacci(int num){
        if  (num<2){
            return num;
        }
        else {
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
}
