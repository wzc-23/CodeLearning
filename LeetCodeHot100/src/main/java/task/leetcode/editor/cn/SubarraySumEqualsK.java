package task.leetcode.editor.cn;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Solution solution = new SubarraySumEqualsK().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int n = nums.length;
            int[] pre = new int[n + 1];
            pre[0] = 0;
            for (int i = 1; i < pre.length; i++) {
                pre[i] = nums[i - 1] + pre[i - 1];
            }
            int ans = 0;
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int target = pre[i + 1] - k;
                hashMap.put(pre[i], hashMap.getOrDefault(pre[i], 0) + 1);
                if (hashMap.containsKey(target)) {
                    ans += hashMap.get(target);
                }
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}