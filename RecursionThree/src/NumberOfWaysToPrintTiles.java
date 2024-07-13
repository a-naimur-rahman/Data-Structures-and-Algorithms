public class NumberOfWaysToPrintTiles {
    public static int printWays(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }

        // Vertical Placement
        int verticalPlacement = printWays(n-m, m);

        // Horizontal Placement
        int horizontalPlacement = printWays(n-1, m);

        return verticalPlacement + horizontalPlacement;
    }

    public static void main(String[] args){
        int n = 3;
        int m = 3;

        int total = printWays(n, m);
        System.out.println("Total: " + total);
    }
}