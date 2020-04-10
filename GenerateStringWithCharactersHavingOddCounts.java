/*1374. Generate a String With Characters That Have Odd Counts
Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.

The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.  

Example 1:

Input: n = 4
Output: "pppz"
Explanation: "pppz" is a valid string since the character 'p' occurs three times and the character 'z' occurs once. Note that there are many other valid strings such as "ohhh" and "love".
Example 2:

Input: n = 2
Output: "xy"
Explanation: "xy" is a valid string since the characters 'x' and 'y' occur once. Note that there are many other valid strings such as "ag" and "ur".
Example 3:

Input: n = 7
Output: "holasss"
*/

class Solution {
    public String generateTheString(int n) {
        
        char []alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 
                        'h', 'i', 'j', 'k', 'l', 'm', 'n',  
                        'o', 'p', 'q', 'r', 's', 't', 'u', 
                        'v', 'w', 'x', 'y', 'z' }; 
  
        String res = ""; 
        if(n%2==0){
            for (int i = 0; i < n-1; i++)  
                res = res + alphabet[0];
            res= res+ alphabet[1];
        }
        else{
            for (int i = 0; i < n; i++)  
                res = res + alphabet[0];
        }
        return res; 
    }
}