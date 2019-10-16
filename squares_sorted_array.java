class Solution {
    public int[] sortedSquares(int[] A) {
        int temp=0;
        for(int i=0;i<A.length;i++){
            A[i]=(int)Math.pow(A[i],2);
        }
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                    }
            }
        }
    return A;
    }
}