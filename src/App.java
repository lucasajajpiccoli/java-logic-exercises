import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        whichNumberIsThis(0);
        whichNumberIsThis(-15);
        whichNumberIsThis(10);
        whichNumberIsThis(7);
        whichNumberIsThis(-6);

        fibonacci(0);
        fibonacci(1);
        fibonacci(2);
        fibonacci(3);
        fibonacci(4);
        fibonacci(5);
        fibonacci(10);
        fibonacci(20);
    }

    public static void whichNumberIsThis(long inputNumber) {
        String parity = "ímpar";
        String signal = "negativo";
    
        if(inputNumber % 2 == 0) {
            parity = "par";
        }
        
        if(inputNumber >= 0) {
            signal = "positivo";
        }
        
        System.out.println(inputNumber + " é " + parity + " e " + signal + ".");
    }

    public static void fibonacci(int x) {
        String fibonacciToPrint = "";
        List<String> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add("0");
        fibonacciSequence.add("1");

        for(int i = 2; i < x; i++) {
            long secondLastElement = Long.parseLong(fibonacciSequence.get(i-2));
            long lastElement = Long.parseLong(fibonacciSequence.get(i-1));
            long currentElement = lastElement + secondLastElement;
            fibonacciSequence.add(Long.toString(currentElement));
        }

        for(int j = 0; j < x; j++)  {
            fibonacciToPrint = fibonacciToPrint + " " + fibonacciSequence.get(j);
        }

        System.out.println(fibonacciToPrint);
    }
}
