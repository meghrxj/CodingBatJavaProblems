package WarmUp;

public class Problem16 {

    public static boolean startHi(String str){

        if (str.length() < 2) return false;
  
  // Pull out the string of the first two chars
  String firstTwo = str.substring(0, 2);
  
  // Test if it is equal to "hi"
  if (firstTwo.equals("hi")) {
    return true;
  } else {
    return false;
  }

    }
    public static void main(String[] args){

        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));

    }
    
}
