public class PrintReverseString {
    public static void printReverseString(String fullName, int index){
        if(index < 0){
            return;
        }

        System.out.print(fullName.charAt(index));
        printReverseString(fullName, index-1);
    }

    public static void main(String[] args){
        String fullName = "Naimur Rahman";
        int index = fullName.length()-1;

        printReverseString(fullName, index);
    }
}
