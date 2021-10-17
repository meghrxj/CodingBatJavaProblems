package WarmpUp;

public class Problem5 {

    public static boolean parrotTrouble(boolean talking, int hour) {

        return (talking && hour < 7 || hour > 22);

             
    }

    public static void main(String[] args){

        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 23));
        System.out.println(parrotTrouble(true, 9));
        System.out.println(parrotTrouble(false, 5));
    }
    
}
