package task.leetcode.editor.cn;

import java.util.HashSet;

public class LongestConsecutiveSequence{
    public static void main(String[] args) {
         Solution solution = new LongestConsecutiveSequence().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int maxAns = 0;
        for(int i:nums){
            hashSet.add(i);
        }
        for(int i:hashSet){
            if(hashSet.contains(i-1)){
                continue;
            }else {
                int curIndex = i;
                int midMaxAns = 1;
//                hashSet.remove(i);
                while (hashSet.contains(curIndex + 1)) {
                    midMaxAns++;
                    curIndex++;
//                    hashSet.remove(curIndex);
                }
                maxAns = Math.max(maxAns, midMaxAns);
            }
        }
        return maxAns;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}