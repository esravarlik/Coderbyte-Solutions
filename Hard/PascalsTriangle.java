/*
Have the function PascalsTriangle(arr) take arr which will be a partial row from Pascal's triangle.
Pascal's triangle starts with a[1] at the first row of the triangle. Then the second row is [1,1] 
and the third row is [1,2,1]. The next row begins with 1 and ends with 1, and the inside of the row
is determined by adding the k - 1 and kth elements from the previous row. T he next row in the
triangle would then be [1,3,3,1] and so on. The input, arr will be some almost completed row from
the triangle, for example [1,4,6,4] and your program should return the next element in that row.
In this example your program should return 1. Another example: if arr [1,5,10] your program should
return 10.
If the whole row is entered as input and there is no next number, your program should return -1.

Input: [1,3]
Output: 3
*/


//Solution;

    public static int PascalsTriangle1(int[] arr) {
        int row = arr[1];
        int col = arr.length-1;
        int number = 1;
        int result = 0;

        for (int i = 0; i < row+1;i++){
            number = 1;
            for (int j = 0; j <= i; j++){
                number = number * (i - j) / (j + 1);
                if (i == row && j == col){
                  result = number;
                } 
            }
        }
        return result == 0 ? -1 : result;
    }
