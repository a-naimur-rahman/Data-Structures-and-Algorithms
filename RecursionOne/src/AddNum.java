import java.util.Scanner;

public class AddNum {
    public static void addNum(int i, int num, int sum){
        if(i > num){
            System.out.print("Summation: " + sum);
            return;
        }

        sum += i;
        addNum(i+1, num, sum);
    }

    public static void main(String[] args){
        int firstNum;
        int lastNum;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("First Number: ");
        firstNum = scanner.nextInt();
        System.out.print("Second Number: ");
        lastNum = scanner.nextInt();
        
        addNum(firstNum, lastNum, sum);
    }
}
