import java.util.*;
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
      
        //reverse the rows
        for(int j = 0; j <A.length; j++){
         for(int i = 0; i < A[j].length / 2; i++) {
            int temp = A[j][i];
            A[j][i] = A[j][A[j].length - i - 1];
            A[j][A[j].length - i - 1] = temp;
            }
          }
        
        //invert the rows
        for(int i =0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(A[i][j]==1)
                    A[i][j]=0;
                else
                    A[i][j]=1;
            }
        }
      
        return A;
    }
}