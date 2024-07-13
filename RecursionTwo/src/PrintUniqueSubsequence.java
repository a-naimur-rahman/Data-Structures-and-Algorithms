import java.util.HashSet;

public class PrintUniqueSubsequence{
    public static void printUniqueSubsequence(String str, int index, String newStr, HashSet<String> set){
        if(index == str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char currentChar = str.charAt(index);
        printUniqueSubsequence(str, index+1, newStr+currentChar, set);
        printUniqueSubsequence(str, index+1, newStr, set);
    }

    public static void main(String[] args){
        String str = "aaa";
        HashSet<String> set = new HashSet<String>();

        printUniqueSubsequence(str, 0, "", set);
    }
}