package task.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{
      public static void main(String[] args) {

          Solution solution = new TwoSum().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int curTarget = target - nums[i];
            if(hashMap.containsKey(curTarget)){
                return new int[]{i,hashMap.get(curTarget)};
            }
           hashMap.put(nums[i],i);
       }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }