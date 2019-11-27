package array;

import java.util.Arrays;

/**
 * @author ck
 * @date
 */
public class removeDuplicatesII {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        sortedArray(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int sortedArray(int[] nums){
        if(nums.length <= 2) {
            return nums.length;
        }
        int pos = 1,flag = 1,int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == last) {
                flag++;
            } else {
                flag = 1;
            }
            if (flag <= 2) {
                nums[pos] = nums[i];
                pos++;
            }
            last = nums[i];
        }
        return pos;
    }
}
