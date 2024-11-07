public class Solution {
    public String longestPalindrome(String s) {
        int head,tail;
        for (int i=0;i<s.length();i++){
            
        }
        return s;
    }

    public static boolean isPalindrome(String s) {
        //将字符串反转在匹配
        String regex = "[\\s\\p{Punct}]";
        String result = s.replaceAll(regex, "");
        String resultlow = result.toLowerCase();

        StringBuilder reversed = new StringBuilder(resultlow).reverse();
        String reversedd=reversed.toString();

        return reversedd.equals(resultlow);
    }
}