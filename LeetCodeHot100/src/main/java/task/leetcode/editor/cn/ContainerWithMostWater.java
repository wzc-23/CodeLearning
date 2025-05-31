package task.leetcode.editor.cn;
public class ContainerWithMostWater{
    public static void main(String[] args) {
         Solution solution = new ContainerWithMostWater().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int right = 0;
        int left = n-1;
        int leftHeight = 0;
        int rightHeight = 0;
        int midMaxArea = 0;
        int maxArea = 0;
        while(right!=left){
            leftHeight = height[left];
            rightHeight = height[right];
            midMaxArea = (left-right)*Math.min(leftHeight,rightHeight);
            maxArea = Math.max(maxArea,midMaxArea);
            if(leftHeight<rightHeight){
                left--;
            }else{
                right++;
            }
        }
        return maxArea;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}