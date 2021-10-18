package WarmpUp2;

public class warmup2 
{

/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi" */

public static String stringTimes(String str, int n) {

    String s = "";

    for (int i = 0; i < n; i++){
        s = s + str;

    } return s;
  
}

/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
*/ 
public static String frontTimes(String str, int n) {
    int frontLen = 3;
    if (frontLen > str.length()) {
      frontLen = str.length();
    }
    String front = str.substring(0, frontLen);
    
    String result = "";
    for (int i=0; i<n; i++) {
      result = result + front;
    }
    return result;
  }

  /*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3 */ 

public static int countXX(String str) {

    int count = 0;

    for (int i = str.indexOf( "xx" ); i != -1; i = str.indexOf( "xx", i + 1 ) )
    {
        count++;
    }

    return count;
  
}

/*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true*/

public static boolean doubleX(String str){

    int i = str.indexOf( 'x' );

    if ( i == -1 || i == str.length() - 1 )
    {
        return false;
    }

    return str.substring( i, i + 2 ).equals( "xx" );
  
  // Another approach -- .startsWith() simplifies the logic
  // String x = str.substring(i);
  // return x.startsWith("xx");

}
/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"*/
public static String strinBits(String str){



}

public static void main(String[] args){

    //stringTimes
    System.out.println(stringTimes("Hi", 2));
    System.out.println(stringTimes("Hi", 3));
    System.out.println(stringTimes("Hi", 1));

    //frontTimes 
    
    System.out.println(frontTimes("Chocolate", 2));
    System.out.println(frontTimes("Chocolate", 3));
    System.out.println(frontTimes("Abc", 3));

    //countXX
    System.out.println(countXX("abcxx"));
    System.out.println(countXX("xxx"));
    System.out.println(countXX("xxxxx"));


    //doubleX 

    System.out.println(doubleX("axxbb"));
    System.out.println(doubleX("axaxax"));
    System.out.println(doubleX("xxxxxx"));

    //stringBits
    







    }

}
