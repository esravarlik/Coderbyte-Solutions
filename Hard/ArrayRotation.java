import java.util.*; 
import java.io.*;

class Main {

  public static int ArrayChallenge(int[] arr) {
    int location = arr[0];
    int result = 0;
    for(int i=location;i < arr.length;i++){
      result *= 10;
      result += arr[i];  
    } 
    for(int j=0;j< location;j++){
      result *= 10;
      result += arr[j];
    }
    return result;
  }

  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(s.nextLine())); 
  }

}
