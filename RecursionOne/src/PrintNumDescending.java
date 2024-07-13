public class PrintNumDescending {
    public static void printNum(int num){
        if(num == 0){
            return;
        }

        System.out.print(num + " ");
        printNum(num - 1);
    }

    public static void main(String[] args) {
        int num = 10;
        printNum(num);
    }
}