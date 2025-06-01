package task.leetcode.editor.cn;

import java.util.PriorityQueue;

public class SlidingWindowMaximum{
    public static void main(String[] args) {
         Solution solution = new SlidingWindowMaximum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        //优先队列
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        int length = nums.length-k+1;
//        int[] ans = new int[length];
//        PriorityQueue<int[]> queue = new PriorityQueue<>((x,y)->y[0]-x[0]);
//        int l = 0;
//        int r = k-1;
//        for(int i = 0;i<k;i++){
//            queue.add(new int[]{nums[i],i});
//        }
//        while(r!=nums.length){
//            queue.add(new int[]{nums[r],r});
//            while(queue.peek()[1]<l){
//                queue.poll();
//            }
//            ans[l] = queue.peek()[0];
//            r++;
//            l++;
//        }
//        return ans;
//    }

        // 优先队列
        public int[] maxSlidingWindow(int[] nums, int k) {
            int length = nums.length-k+1;
            int[] ans = new int[length];
            //todo
            return null;
        }

}
//leetcode submit region end(Prohibit modification and deletion)

}