public class PrintAllSubsequence {
    public static void printAllSubsequence(String str, int index, String newStr){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(index);
        printAllSubsequence(str, index+1, newStr+currentChar);
        printAllSubsequence(str, index+1, newStr);
    }
    public static void main(String[] args){
        String str = "abc";

        printAllSubsequence(str, 0, "");
    }
}
