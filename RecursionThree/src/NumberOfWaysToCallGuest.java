public class NumberOfWaysToCallGuest {
    public static int printWays(int n){
        if(n <= 1){
            return 1;
        }

        // Single
        int wayOne = printWays(n-1);

        // Pair
        int wayTwo = (n-1) * printWays(n-2);

        return wayOne + wayTwo;
    }

    public static void main(String[] args){
        int n = 3;

        int total = printWays(n);
        System.out.println("Total: " + total);
    }
}
