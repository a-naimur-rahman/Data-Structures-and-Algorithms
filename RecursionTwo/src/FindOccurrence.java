public class FindOccurrence{
    public static int first = -1;
    public static int last = -1;

    public static void findOccurrence(String fullName, int index, char element){
        if(index == fullName.length()){
            System.out.println("First: " + first);
            System.out.println("Last: " + last);
            return;
        }

        char currentChar = fullName.charAt(index);
        if(currentChar == element){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }

        findOccurrence(fullName, index+1, element);
    }

    public static void main(String[] args){
        String fullName = "Naimur Rahman";

        findOccurrence(fullName, 0, 'a');
    }
}
