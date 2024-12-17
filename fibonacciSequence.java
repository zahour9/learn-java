import java.util.ArrayList;
public class fibonacciSequence {
    public static boolean fibonacciSeqMethod(int num){
        boolean output = false;
        ArrayList<Integer> fibonacciArr = new ArrayList<>();
        fibonacciArr.add(1);
        fibonacciArr.add(1);
        int i = 1;
        while (fibonacciArr.get(i) < num){
            fibonacciArr.add(fibonacciArr.get(i - 1) + fibonacciArr.get(i));
            i++;
        }
        for(int j = 0; j < fibonacciArr.size(); j++){
            if(fibonacciArr.get(j) == num){
                output = true;
                break;
            }
        }
        return output;
    }
    public static void main(String args[]){
        System.out.println(fibonacciSeqMethod(1000094949));
    }
}
