class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        if(queries == null || words == null || queries.length == 0 || words.length == 0){
            return null;
        }
        
        int q [] = new int [queries.length];
        int w [] = new int [words.length];
        
        for(int i=0; i<queries.length;i++){
            q[i] = frequency(queries[i]);
        }
        for(int i=0; i<words.length;i++){
            w[i] = frequency(words[i]);
        }
        
        List<Integer> count = new ArrayList<>();
        for(int i=0; i<queries.length;i++){
            int counter=0;
            for(int j=0;j<words.length;j++){
                if(q[i]<w[j]){
                    counter++;
                }
            }
            count.add(counter);
        }
        int [] ans = new int[queries.length];
        for(int i=0; i<count.size();i++){
            ans[i]=count.get(i);
        }
        return ans;
    }
    
    private int frequency(String word) {
        int[] charFreq = new int[256];
        for(char ch : word.toCharArray()){
            charFreq[ch - 'A'] +=1;
        }
        for(int i=0;i<charFreq.length;i++){
            if(charFreq[i] > 0) return charFreq[i];
        }
        return 0;
    }     
}