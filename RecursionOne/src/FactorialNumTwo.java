public class FactorialNumTwo {
    public static int factNum(int num){
        if(num == 1){
            return 1;
        }

        int factNumNew = factNum(num - 1);
        int factorial = num * factNumNew;
        return factorial;
    }

    public static void main(String[] args){
        int num = 5;

        int factorial = factNum(num);
        System.out.println("Factorial: " + factorial);
    }
}
