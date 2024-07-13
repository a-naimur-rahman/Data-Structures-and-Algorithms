public class PrintNumAscending {
    public static void printNum(int num){
        if(num > 10){
            return;
        }

        System.out.print(num + " ");
        printNum(num + 1);
    }

    public static void main(String[] args){
        int num = 1;

        printNum(num);
    }
}
