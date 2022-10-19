import java.util.*; 
import java.io.*;

class Main {

  public static String LetterCapitalize(String str) {
    String[] strArray = str.split(" ");
    String result = "";
    for(String s: strArray){
      result += s.substring(0,1).toUpperCase() + s.substring(1,s.length());
      result += " ";
    }
    return result.trim();
  }

  public static void main (String[] args) {     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }

}
