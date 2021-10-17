package WarmUp;

public class Problem18 {

    public static boolean in1020(int a, int b){

        if((a >= 10 && a <= 20) || (b >= 10 && b <= 20)){
            return true;

        } else {
            return false;
        }

    }
    public static void main(String[] args){

        System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(8, 99));
    }
    
}
