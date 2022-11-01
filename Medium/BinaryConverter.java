import java.util.*; 
import java.io.*;

class Main {

  public static int MathChallenge(String str) {
    int decimal = Integer.parseInt(str,2);
    return decimal;
  }

  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(MathChallenge(s.nextLine())); 
  }

}
