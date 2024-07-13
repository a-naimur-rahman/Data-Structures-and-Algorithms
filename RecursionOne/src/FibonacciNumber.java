public class FibonacciNumber{
    public static void fibonacciNumber(int firstNum, int secondNum, int numTerm){
        if(numTerm == 0){
            return;
        }

        int fibonacciNum = firstNum + secondNum;
        System.out.print(fibonacciNum + " ");
        fibonacciNumber(secondNum, fibonacciNum, numTerm-1);
    }

    public static void main(String[] args){
        int firstNum = 0;
        int secondNum = 1;
        int numTerm = 5;

        System.out.print(firstNum + " ");
        System.out.print(secondNum + " ");

        fibonacciNumber(firstNum, secondNum, numTerm-2);
    }
}
