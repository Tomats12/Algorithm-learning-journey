

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        boolean sig = true;
        int cp;
        int[] anwser=new int[2];
        for (int i=0;i<nums.length-1;i++){
            cp = nums[i];
            for (int n=i+1;n<nums.length;n++){
                if((cp+nums[n])==target){
                    anwser[0]=i;
                    anwser[1]=n;
                    sig = false;
                    break;
                }
            }
            System.out.println(" ");
        }
        return anwser;
    }
}

