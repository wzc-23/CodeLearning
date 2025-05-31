package task.leetcode.editor.cn;
public class MoveZeroes{
    public static void main(String[] args) {
         Solution solution = new MoveZeroes().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;
        int n = nums.length;
        while(fast<n){
            if(nums[fast] != 0){
                swap(nums,slow,fast);
                slow++;
            }
            fast++;
        }
    }
    public void swap(int[] nums,int i,int j){
        int mid = nums[i];
        nums[i] = nums[j];
        nums[j] = mid;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}