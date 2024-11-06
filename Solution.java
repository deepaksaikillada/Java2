import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>ump= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remain=target-nums[i];
//            String y=Integer.toString(remain);
            if(ump.containsKey(remain)){
                return new int[]{ump.get(remain),i};
            }else{
                ump.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}


//class Solution {
//    public boolean isPalindrome(int x) {
//        String y = Integer.toString(x);
//        int z=y.length();
//        for(int i=0;i<z/2;i++){
//            if(y.charAt(i)!=y.charAt(z-i)){
//                return false;
//            }
//        }
//        return true;
//    }
//}