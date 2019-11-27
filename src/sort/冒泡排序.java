package sort;/*基本思想：
        从无序序列头部开始，进行两两比较，根据大小交换位置，直到最后将最大（小）的数据元素交换到了无序队列的对位，从而成为有序序列的一部分；下一次继续这个过程，直到所有数据元素都排好序。


        1、比较相邻的元素。如果第一个比第二个大（小），就交换他们两个。

        2、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大（小）的数。

        3、针对所有的元素重复以上的步骤，除了最后已经选出的元素（有序）。

        4、持续每次对越来越少的元素（无序元素）重复上面的步骤，直到没有任何一对数字需要比较，则序列最终有序。*/
import java.util.Arrays;
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] ck = {3, 3, 9,4, 5, 6, 6, 7, 7};
        singleNumber(ck);
        System.out.println(Arrays.toString(ck));
    }

    static void singleNumber(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}

