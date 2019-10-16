import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean s=true;
            int num=i;
            while(num>0){
                int digit=num%10;
                if(digit==0 || i%digit!=0){
                    s=false;
                    break;
                }
                num/=10;
            }
            if(s)
            list.add(i);
        }   
        return list;
    }
}