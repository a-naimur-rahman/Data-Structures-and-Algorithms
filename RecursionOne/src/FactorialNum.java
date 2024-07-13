import java.util.Scanner;

public class FactorialNum {
    public static void factorialNum(int num, int factorial){
        if(num == 0){
            System.out.println("Factorial: " + factorial);
            return;
        }

        factorial *= num;
        factorialNum(num-1, factorial);
    }

    public static void main(String[] args){
        int num;
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        num = scanner.nextInt();

        factorialNum(num, factorial);
    }
}