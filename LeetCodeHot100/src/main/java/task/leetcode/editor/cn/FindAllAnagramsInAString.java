package task.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString{
    public static void main(String[] args) {
         Solution solution = new FindAllAnagramsInAString().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()){
            return new ArrayList<>();
        }
        int l = 0;
        int r = p.length();
        List<Integer> ans = new ArrayList<>();
        while(r!=s.length()+1){
            if(isAnagrams(s.substring(l,r),p)){
                ans.add(l);
            }
            l++;
            r++;
        }
        return ans;
    }

    public boolean isAnagrams(String str,String pattern){
        int[] strInt = new int[26];
        int[] patternInt = new int[26];
        for(int i = 0;i<str.length();i++){
            strInt[str.charAt(i)-'a']++;
            patternInt[pattern.charAt(i)-'a']++;
        }
        if(Arrays.equals(strInt,patternInt)){
            return true;
        }else {
            return false;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}