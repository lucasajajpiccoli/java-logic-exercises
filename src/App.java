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

        multiplicationTable(0);
        multiplicationTable(1);
        multiplicationTable(2);
        multiplicationTable(5);
        multiplicationTable(10);
        multiplicationTable(50);
        multiplicationTable(100);
        multiplicationTable(200);

        pyramid(0);
        pyramid(1);
        pyramid(2);
        pyramid(3);
        pyramid(4);
        pyramid(5);
        pyramid(10);
        pyramid(20);
        
        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};
        findDuplicates(array1, array2);
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
        if(x == 0) {
            System.out.println("");
            return;
        } else if (x == 1) {
            System.out.println("0");
            return;
        }

        String fibonacciToPrint = "";

        long[] fibonacciSequence = new long[x];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;

        for(int i = 2; i < x; i++) {
            long secondLastElement = fibonacciSequence[i-2];
            long lastElement = fibonacciSequence[i-1];
            long currentElement = lastElement + secondLastElement;
            fibonacciSequence[i] = currentElement;
        }

        for(int j = 0; j < x; j++)  {
            fibonacciToPrint = fibonacciToPrint + fibonacciSequence[j] + " ";
        }

        fibonacciToPrint = fibonacciToPrint.substring(0, fibonacciToPrint.length() - 1);

        System.out.println(fibonacciToPrint);
    }

    public static void multiplicationTable(int n) {
        System.out.println("Tabela de multiplicação por " + n); 

        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

    public static void pyramid(int size) {
        if(size == 0) {
            System.out.println("");
        }

        for(int i = 1; i <= size; i++) {
            String line = "";
            for(int j = 1; j <= i; j++) {
                line = line + i;
            }
            System.out.println(line);
        }
    }

    public static void findDuplicates(String[] array1, String[] array2) {
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
