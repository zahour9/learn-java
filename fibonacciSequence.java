import java.util.ArrayList;
import java.util.List;
public class fibonacciSequence {
    public static boolean isFibonacciNumber(int number){
        boolean output = false;
        List<Integer> fibonacciArr = new ArrayList<Integer>();
        fibonacciArr.add(0);
        fibonacciArr.add(1);
        int i = 1;
        while (fibonacciArr.get(i) <= number){
            if(fibonacciArr.get(i) < number){
            fibonacciArr.add(fibonacciArr.get(i - 1) + fibonacciArr.get(i));
            i++;
            }
            if(fibonacciArr.get(i) == number){
                output = true;
                break;
            }
        }
        
        return output;
    }
    public static void main(String args[]){
        System.out.println(isFibonacciNumber(5));
    }
}
