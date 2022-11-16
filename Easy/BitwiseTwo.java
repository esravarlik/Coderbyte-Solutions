import java.util.*; 
import java.io.*;

class Main {

  public static String ArrayChallenge(String[] strArr) {
    String[] a = strArr[0].split("");
    String[] b = strArr[1].split("");
    String result = "";
    for(int i=0;i<a.length;i++){
      if(a[i].equals(b[i]) && a[i].equals("1")){
        result += "1";
      }else{
      result += "0";
      }
    }
    return result;
  }

  public static void main (String[] args) {   
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(s.nextLine())); 
  }

}
