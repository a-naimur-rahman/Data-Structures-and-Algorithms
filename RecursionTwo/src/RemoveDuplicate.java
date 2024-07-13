public class RemoveDuplicate{
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, int index, String newStr){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(index);
        if(map[currentChar - 'a']){
            removeDuplicate(str, index+1, newStr);
        }
        else{
            newStr += currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicate(str, index+1, newStr);
        }
    }

    public static void main(String[] args){
        String str = "aabbccddee";
        String newStr = "";

        removeDuplicate(str, 0, newStr);
    }
}