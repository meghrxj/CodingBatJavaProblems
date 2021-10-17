package WarmpUp;

public class Problem9 {

    public static String notString(String str){

        if(str.length() >= 3 && str.substring(0, 3).equals ("not")){
            return str;
        }
        return "not " + str;
    }

    public static void main(String[] args){

        System.out.println(notString("candy"));
        System.out.println(notString("X"));
        System.out.println(notString("not bad"));
    }
}
