class Solution {
    public String toLowerCase(String str) {
      char[] c = str.toCharArray();
       for (int i = 0; i < str.length(); ++i){
        
         if(c[i]>='A' && c[i]<='Z')
            c[i]+=32; 
        }
       
    return new String(c);
    }
}