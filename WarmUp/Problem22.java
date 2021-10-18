package WarmUp;

public class Problem22 {

    public static boolean mixStart(String str){

        if (str.length() < 3) return false;

        String two = str.substring(0, 3);

        if(two.equals("ix")){
            return true;
        } else {
            return false;
        }

        //or return(two.equals("ix"))

    }
    public static void main(String[] args){

        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
    }
    
}
