import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i ++){
            int j = i + 1;            
            int k = nums.length - 1;

            if(i > 0 && nums[i] == nums[i - 1]) continue;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    
                    while(j + 1 < k && nums[j] == nums[j + 1]) j ++;
                    while(k - 1 > j && nums[k] == nums[k - 1]) k --;

                    j ++;
                    k --;
                }else if(sum < 0){
                    j ++;
                }else{
                    k --;
                }
            }
        }
        return answer;
    }
}