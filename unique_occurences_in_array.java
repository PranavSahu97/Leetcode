import java.util.HashSet;
import java.util.HashMap;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, !map.containsKey(i) ? 1 : (map.get(i) + 1));
        }
        return map.size() == (new HashSet<Integer>(map.values())).size();
    }
}