package array;

import java.util.Arrays;

/**
 * @author ck
 * @questionStem：
 *         给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *         不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @date
 */

public class removeDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        sortedArray(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int sortedArray(int[] nums){
        int index = 1;
        if(nums.length<=2){
            return nums.length;
        }
         for(int i=1;i<nums.length-1;i++){
             if((nums[i]!=nums[i-1])){
                 nums[++index] =  nums[i];
             }
         }
         return ++index;
    }
}
