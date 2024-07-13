public class MoveXEnd{
    public static void moveXEnd(String str, int index, char element, int count, String newStr){
        if(index == str.length()){
            for(int i = 0; i < count; i++){
                newStr += element;
            }
            System.out.println("New String: " + newStr);
            return;
        }

        char currentChar = str.charAt(index);
        if(currentChar == element){
            count++;
            moveXEnd(str, index+1, element, count, newStr);
        }
        else{
            newStr += currentChar;
            moveXEnd(str, index+1, element, count, newStr);
        }
    }

    public static void main(String[] args){
        String str = "axbxcxdxex";
        String newStr = "";

        moveXEnd(str, 0, 'x', 0, newStr);
    }
}