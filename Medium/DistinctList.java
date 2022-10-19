/* 
Have the function DistinctList(arr) take the array of numbers stored in arr and determine
the total number of duplicate entries. For example if the input is [1, 2, 2, 2, 3] then your
program should output 2 because there are two duplicates of one the elements.

Input: new int[] {0, -2, -2, 5, 5, 5}
Output: 3

Input: new int[] {100, 2, 101, 4}
Output: 0
*/


//Solution; 

import java.util.*;
import java.io.*;

class Main{
  
  public static int DistinctList(int[] arr){
    Arrays.sort(arr);
    int temp = arr[0];
    int count = 0;
    for(int i=1; i < arr.length; i++){
      if(arr[i] == temp)
          count++;
      else
        temp = arr[i];
    }
    return count;
  }
  
  public static void main (String[] args){
  Scanner s = new Scanner(System.in);
  System.out.println(DistinctList(s.nextLine()));
  }

}
