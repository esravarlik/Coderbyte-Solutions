import java.util.*; 
import java.io.*;

class Main {
  
  public static int OffBinary(String[] strArr) {
    
    String[] arr = strArr[1].split("");
    int integerr = Integer.valueOf(strArr[0]);
    String[] arr2 = (Integer.toBinaryString(integerr)).split("");
    int count = 0;
    
    for(int i=0;i<arr.length;i++){
      if(!arr[i].equals(arr2[i])){
        count++;
      }
    }
    
    return count;
  }
  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(OffBinary(s.nextLine())); 
  }
}
