package WarmUp;

public class Problem19 {

    public static boolean hasTeen(int a, int b, int c){

        if(a >= 13 && a <= 19){
            return true;
        } else if(b >= 13 && b <= 19){
            return true;
        } else if(c >= 13 && c <= 19){
            return true;
        } else {
            return false;
        }
    }
    
    
    public static void main(String[] args){

        System.out.println(hasTeen(13,  20, 10));
        System.out.println(hasTeen(20,  19, 10));
        System.out.println(hasTeen(20,  10, 13));
        System.out.println(hasTeen(35, 40, 60));
    }
    
}
