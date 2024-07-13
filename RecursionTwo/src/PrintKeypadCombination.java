public class PrintKeypadCombination {
    public static String[] keypad = {"_", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void printKeypadCombination(String str, int index, String combination){
        if(index == str.length()){
            System.out.println(combination);
            return;
        }

        char currentChar = str.charAt(index);
        String mapping = keypad[currentChar - '0'];

        for(int i = 0; i < mapping.length(); i++){
            printKeypadCombination(str, index+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args){
        String str = "24";

        printKeypadCombination(str, 0, "");
    }
}
