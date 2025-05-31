package task.leetcode.editor.cn;
public class TrappingRainWater{
    public static void main(String[] args) {
         Solution solution = new TrappingRainWater().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = 0;
        rightMax[n-1] = 0;
        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i-1]);
            rightMax[n-1-i] = Math.max(rightMax[n-i],height[n-i]);
        }
        int ans = 0;
        for(int i = 0;i<n;i++){
            ans+=Math.max((Math.min(leftMax[i],rightMax[i])-height[i]),0);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}