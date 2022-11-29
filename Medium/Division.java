import java.util.*; 
import java.io.*;

class Main {

  public static int MathChallenge(int num1, int num2) {
    int ebob = 0;
    int result = 1;
    int result2 = 1;
    if(num1 > num2){
      result = num1;
      result2 = num2;
    }else{
      result = num2;
      result2 = num1;
    }
    for(int i=1;i<result;i++){
      if(result % i == 0 && result2 % i == 0){
        ebob = i;
      }
    }
    return ebob;
  }

  public static void main (String[] args) {     
    Scanner s = new Scanner(System.in);
    System.out.print(MathChallenge(s.nextLine())); 
  }

}
