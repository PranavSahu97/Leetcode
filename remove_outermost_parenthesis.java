class Solution {
    public String removeOuterParentheses(String S) {
     int counter=0;
        char [] c= S.toCharArray();
        String res="";
        for(int i=0;i<S.length();i++){ 
        if(c[i]=='('){
            if (counter>0)
                res+=c[i];
            counter++;
        }
        if(c[i]==')'){
            counter--;
            if(counter>0)
                res+=c[i];
    
        }
    }
    return res;
    }
}