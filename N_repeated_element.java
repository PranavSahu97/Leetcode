class Solution {
    public int repeatedNTimes(int[] A) {
        
        List list = new ArrayList();
        for(int n:A){
            if(list.contains(n))
                return n;
            list.add(n);
        }
        return -1;
    }
}