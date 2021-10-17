package WarmUp;

public class Problem10 {

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);
  
        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n+1, str.length());
        
        return front + back;
      }
public static void main(String[] args) {

    System.out.println(missingChar("kitten", 1));
    System.out.println(missingChar("kitten", 0));
    System.out.println(missingChar("kitten", 4));
}

            
    }
    

