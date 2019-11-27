package sort;

import java.util.Arrays;

public class 插入排序 {
    public static void main(String[] args) {
        int[] ck = {3, 9, 4, 5, 6, 7,4,1,3,5,4,6,6,1,3,32,12};
        Sort(ck);
        System.out.println(Arrays.toString(ck));
    }
    static void Sort(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            int temp = nums[i];
            for (int j = i; j >0; j--) {
                if (temp < nums[j - 1]) {
                    nums[j] = nums[j-1];
                } else {
                    nums[j] = temp;
                    break;
                }
            }
        }
    }
}
