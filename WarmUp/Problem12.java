package WarmUp;

public class Problem12 {
    
    public static String front3(String str){

        if(str.length >= 3) {

            front = str.substring(0, 3);
        } else {
            front = str;
        }
        return front + front + front;

    }

    public static void main(String[] args){
        System.out.println(front3("Java"));
        System.out.println(front3("chocolate"));
        System.out.println(front3("abc"));
    }

}
