import java.util.Arrays;

public class 快速排序 {
    public static void main(String[] args) {
        int[] ck = {3, 9, 4, 5, 4,4,4,6,654,98,79,735,4,32, 5, 6, 1, 3, 6, 7};
        int len=ck.length-1;
        Sort(ck,0,len);
        System.out.println(Arrays.toString(ck));
    }

    static void cover(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void Sort(int[] nums, int left, int right) {
        int i, j, t, temp;
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
                cover(nums[i], nums[j]);
            }
            nums[left] = nums[i];
            nums[i] = temp;
            Sort(nums, left, i - 1);
            Sort(nums, i + 1, right);
        }
    }
}