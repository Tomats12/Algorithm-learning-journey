import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
                char[] chars=s.toCharArray();
                int result=0;
                for (int i=0; i<chars.length;i++){
                    int cunt = 0;
                    HashSet<Character> set=new HashSet<>();
                    for (int a=i;a<chars.length;a++){
                        if (set.add(chars[a])){
                            break;
                        }else {
                            cunt++;
                        }
                    }
                    if(cunt>result){
                        result=cunt;
                    }

                }
                return result;
    }

    public int lengthOfLongestSubstring1(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

}
