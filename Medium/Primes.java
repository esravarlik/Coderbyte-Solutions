import java.util.*; 
import java.io.*;

class Main {

  public static String MathChallenge(int num) {
    return isPrime(num);
  }

  public static String isPrime(int num){
    for(int i= 2;i<num;i++){
      if(num % i == 0){
        return "false";
      }
    }
    return "true";
  }

  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(MathChallenge(s.nextLine())); 
  }

}
