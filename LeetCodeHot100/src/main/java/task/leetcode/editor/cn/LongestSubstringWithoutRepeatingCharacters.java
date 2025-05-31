package task.leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters{
    public static void main(String[] args) {
         Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> charMap = new HashMap<>();
        int l = 0;
        int r = 0;
        int midAns = 0;
        int ans = 0;
        while(r!=s.length()){
            char curChar = s.charAt(r);
            if(!charMap.containsKey(curChar)){
                charMap.put(curChar,r);
                r++;
                midAns++;
            }else{
                ans = Math.max(midAns,ans);
                int index = charMap.get(curChar);
                while(l != index+1){
                    charMap.remove(s.charAt(l));
                    l++;
                    midAns--;
                }
            }
        }
        ans = Math.max(midAns,ans);
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}