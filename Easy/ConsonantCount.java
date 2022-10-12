/* 
Have the function take the str string parameter being passed 
and return the number of consonants the string contains.

Example;
Input: "Hello World"
Output: 7

Input: "Alphabets"
Output: 6 
*/

//Solution;

public static String ConsonantCount(String str) {
    //Delete uppercase and lowercase vowels
    str= str.replaceAll("[aeiouAEIOU]","");
    //Delete non-alphanumeric
    str= str.replaceAll("[^a-zA-Z0-9]","");
    return String.valueOf(str.length());
  }
