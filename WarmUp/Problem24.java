package WarmUp;

public class Problem24 {

    public static int intMax(int a, int b, int c){

        int max;

        if(a > b){
            max = a;
        } else {
            max = b; } 
        
        if(c > max){
            max = c;
        } 

        return max;

    }
    public static void main(String[] args){

        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));

    }
    
}
