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
public static String stringBits(String str){

  String result = "";
  // Note: the loop increments i by 2
  for (int i=0; i<str.length(); i+=2) {
    result = result + str.substring(i, i+1);
    // Alternately could use str.charAt(i)
  }
  return result;

}

/*
Given a non-empty string like "Code" return a string like "CCoCodCode".
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"*/
public static String stringSplosion(String str){

  String result = "";
  // On each iteration, add the substring of the chars 0..i
  for (int i=0; i<str.length(); i++) {
    result = result + str.substring(0, i+1);
  }
  return result;

}

/*
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2*/
public static int last2(String str) {

  if (str.length() < 2) return 0;
  
  String end = str.substring(str.length()-2);
  // Note: substring() with 1 value goes through the end of the string
  int count = 0;
  
  // Check each substring length 2 starting at i
  for (int i=0; i<str.length()-2; i++) {
    String sub = str.substring(i, i+2);
    if (sub.equals(end)) {  // Use .equals() with strings
      count++;
    }
  }

  return count;
  
}
/*
Given an array of ints, return the number of 9's in the array.
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3*/

public static int arrayCount9(int[] nums){

          int count = 0;

          for(int i=0; i<nums.length; i++){
            if(nums[i] == 9){
              count++;
            }
          }
          return count;
    
}

/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false*/

public static boolean arrayFront9(int[] nums) {

          boolean result = false;

          for(int i = 0; i <nums.length; i++) {
            if(i <= 3 && nums[i] == 9) {
              result = true;
            }
          }
          return result;
  
}

/*Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true*/
public static boolean array123(int[] nums) {

    boolean result = false;

    for(int i = 0; i < nums.length - 2; i++) {
      if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
        result = true;
      }
    }
    return result;
  
}

/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0*/

public int stringMatch(String a, String b){

    int count = 0;

    if(a.length() >= 2 && b.length() >= 2){

      for(int i = 0; i < a.length() - 1 && i < b.length() - 1; i++){
          if(a.substring(i, i + 2) == b.substring(i, i + 2)){

            count++;
          }

          
      }
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

    //countXX
    System.out.println(countXX("abcxx"));
    System.out.println(countXX("xxx"));
    System.out.println(countXX("xxxxx"));


    //doubleX 

    System.out.println(doubleX("axxbb"));
    System.out.println(doubleX("axaxax"));
    System.out.println(doubleX("xxxxxx"));

    //stringBits

    System.out.println(stringBits("Hello"));
    System.out.println(stringBits("Hi"));
    System.out.println(stringBits("Heeololeo"));

    //stringSplosion

    System.out.println(stringSplosion("Code"));
    System.out.println(stringSplosion("abc"));
    System.out.println(stringSplosion("ab"));

    //last2

    System.out.println(last2("hixxhi"));
    System.out.println(last2("xaxxaxaxx"));
    System.out.println(last2("axxxaaxx"));
    
  

    }

}
