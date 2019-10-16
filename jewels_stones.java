import java.util.*;
class Solution {
    public int numJewelsInStones(String J, String S) {
        int i=0;
        int count=0;
        for(int j=0;j<J.length();j++){
            for(i=0;i<S.length();i++){
                if(J.charAt(j)==S.charAt(i))
                    count++;
            }
        }
        return count;
    }
}