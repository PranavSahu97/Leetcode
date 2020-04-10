class Solution {
    public int subtractProductAndSum(int n) {
        int rem;
        int product = 1;
        int sum = 0;
        int result;
        while(n>0){
            rem = n % 10;
            n = n/10;
            product *= rem;
            sum += rem;
        }
        result = product -sum ;
        return result;
    }
}