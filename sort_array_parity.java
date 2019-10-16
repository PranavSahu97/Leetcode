class Solution {
    public int[] sortArrayByParity(int[] A) {
       int low=0, mid=0, high=A.length-1;
        int temp;
        while(mid<=high){
            if(A[mid]==0){
                temp=A[mid];
                A[mid]=A[low];
                A[low]=temp;
                low++;
                mid++;
            }
            else if(A[mid]%2==0){
                mid++;
            }
            else{
                temp=A[mid];
                A[mid]=A[high];
                A[high]=temp;
                high--;
            }
        }
        return A;
    }
}