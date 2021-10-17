package WarmpUp;

public class Problem8 {

    public static boolean posNeg(int a, int b, boolean negative) {

        if (negative) {
            return (a < 0 && b < 0);
          }
          else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
          }
        }

    public static void main(String[] args){

        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-4, -5, true));

    }
}
    

