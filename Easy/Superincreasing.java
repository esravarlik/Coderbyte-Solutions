import java.util.*; 
import java.io.*;

class Main {

  public static String ArrayChallenge(int[] arr) {
    if(arr.length == 1){
      return "true";
    }

    int sum = 0;
    for(int i=0;i<arr.length-1;i++){
      sum += arr[i];
      if(arr[i+1] <= sum){
        return "false";
      }
    }
    return "true";
  }

  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(s.nextLine())); 
  }

}
