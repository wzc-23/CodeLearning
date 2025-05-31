package task.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams{
    public static void main(String[] args) {
         Solution solution = new GroupAnagrams().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String str:strs){
            char[] curStr = str.toCharArray();
            Arrays.sort(curStr);
            if(hashMap.containsKey(new String(curStr))){
                ans.get(hashMap.get(new String(curStr))).add(str);
            }else{
                ans.add(new ArrayList<>());
                ans.getLast().add(str);
                hashMap.put(new String(curStr),ans.size()-1);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}