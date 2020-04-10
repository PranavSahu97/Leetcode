/*1119. Remove Vowels from a String
Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.

Example 1:

Input: "leetcodeisacommunityforcoders"
Output: "ltcdscmmntyfrcdrs"
Example 2:

Input: "aeiou"
Output: ""
 
Note:

S consists of lowercase English letters only.
1 <= S.length <= 1000
*/

class Solution {
    public String removeVowels(String S) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' || S.charAt(i) == 'u'){
                continue;
            }
            str.append(S.charAt(i));
        }
        return str.toString();
    }
}