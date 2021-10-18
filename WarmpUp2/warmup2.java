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

    for ( int i = str.indexOf( "xx" ); i != -1; i = str.indexOf( "xx", i + 1 ) )
    {
        count++;
    }

    return count;
  
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
    }

}
