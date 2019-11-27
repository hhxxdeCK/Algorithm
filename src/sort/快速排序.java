package sort;

import java.util.Arrays;

public class 快速排序 {
    public static void main(String[] args) {
        int[] ck = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int len = ck.length - 1;
        Sort(ck, 0, len);
        System.out.println(Arrays.toString(ck));
    }

    static void Sort(int[] nums, int left, int right) {
        int i, j, temp;
        if (left > right) {
            return;
        }
        temp = nums[left];//temp中存基准数
        i = left;
        j = right;
        while (i != j) {
            while (nums[j] >= temp && i < j) {
                j--;
            }
            while (nums[i] <= temp && i < j) {
                i++;
            }
            if (i < j) {
                int a = nums[i];
                nums[i] = nums[j];
                nums[j] = a;
            }
        }
        nums[left] = nums[i];
        nums[i] = temp;
        Sort(nums, left, i - 1);
        Sort(nums, i + 1, right);

    }
}