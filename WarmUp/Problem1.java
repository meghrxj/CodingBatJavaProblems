package WarmpUp;

public class Problem1{

    public static boolean sleepIn(boolean weekday, boolean vacation) {
 
        if (!weekday || vacation){
          return true;
        }
         return false;
       }
    public static void main(String[] args){

        System.out.println(sleepIn(false, true));
    }
}