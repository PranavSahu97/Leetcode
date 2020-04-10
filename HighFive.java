/*1086. High Five
Given a list of scores of different students, return the average score of each student's top five scores in the order of each student's id.

Each entry items[i] has items[i][0] the student's id, and items[i][1] the student's score.  The average score is calculated using integer division.

Example 1:

Input: [[1,91],[1,92],[2,93],[2,97],[1,60],[2,77],[1,65],[1,87],[1,100],[2,100],[2,76]]
Output: [[1,87],[2,88]]
Explanation: 
The average of the student with id = 1 is 87.
The average of the student with id = 2 is 88.6. But with integer division their average converts to 88.
 

Note:

1. 1 <= items.length <= 1000
2. items[i].length == 2
3. The IDs of the students is between 1 to 1000
4. The score of the students is between 1 to 100
5. For each student, there are at least 5 scores
*/

class Solution {
    public int[][] highFive(int[][] items) {
		TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for(int item[] : items){
            int id = item[0];
            int score = item[1];
            if(map.containsKey(id)){
                List<Integer> l = map.get(id);
                l.add(score);
                map.put(id, l);
            }
            else{
                List<Integer> l = new ArrayList<>();
                l.add(score);
                map.put(id, l);
            }
        }
        int res[][] = new int[map.size()][2];
        for(int id : map.keySet()){
            List<Integer> l = map.get(id);
            Collections.sort(l, Collections.reverseOrder());
            int sum=0;
            for(int i=0; i<5; i++){
                sum += l.get(i);
            }
            res[id-1][0] = id;
            res[id-1][1] = (int)sum/5;
        }
        return res;
    }
}