public class TotalPaths {
    public static int totalPaths(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 || j == m-1){
            return 1;
        }

        // Downpaths
        int downPaths = totalPaths(i+1, j, n, m);

        // Rightpaths
        int rightPaths = totalPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }

    public static void main(String[] args){
        int n = 3;
        int m = 3;

        int total = totalPaths(0, 0, n, m);
        System.out.println("Total Paths: " + total);
    }
}