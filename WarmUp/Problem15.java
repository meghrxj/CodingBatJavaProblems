package WarmUp;

public class Problem15 {

    public static String front22(String str) {

        int take = 2;

        if(take > str.length()) {
            take = str.length();
        } 

        String front = str.substring(0, take);
        return front + str + front;

  
    }

    public static void main(String[] args){

        System.out.println(front22("abc"));
        System.out.println(front22("Ha"));
        System.out.println(front22("kitten"));
    }
    
}
