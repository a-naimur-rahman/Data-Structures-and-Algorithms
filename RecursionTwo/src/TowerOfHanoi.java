public class TowerOfHanoi {
    public static void towerOfHanoi(int num, String src, String helper, String des){
        if(num == 1){
            System.out.println("Transfer " + num + " from " + src + " to " + des);
            return;
        }

        towerOfHanoi(num-1, src, des, helper);
        System.out.println("Transfer " + num + " from " + src + " to " + des);
        towerOfHanoi(num-1, helper, src, des);
    }

    public static void main(String[] args) {
        int num = 3;

        towerOfHanoi(num, "Source", "Helper", "Destination");
    }
}