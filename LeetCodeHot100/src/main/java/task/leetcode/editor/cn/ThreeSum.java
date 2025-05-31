package task.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{
    public static void main(String[] args) {
         Solution solution = new ThreeSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int target;
        for(int i = 0;i<(nums.length-1);i++){
            if(i!=0&&nums[i]==nums[i-1]){
                continue;
            }
            target = -nums[i];
            int l = i+1;
            int r = nums.length-1;
            int preLValue = nums[l]-1;
            int preRValue = nums[r]-1;
            while(l!=r){
                if(preLValue==nums[l]){
                    l++;
                    continue;
                }
                int curSum = nums[l]+nums[r];
                if(curSum==target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    ans.add(list);
                }

                if(curSum>target){
                    preRValue = nums[r];
                    r--;

                }else{
                    preLValue = nums[l];
                    l++;
                }

            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}