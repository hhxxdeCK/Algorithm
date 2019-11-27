package sort;

//根据异或运算的特点，相同的数字经过异或运算后结果为0，除单独出现一次的数字外，其他数字都是出现两次的，那么这些数字经过异或运算后结果一定是0，任何数字与0进行异或运算都是该数字本身，所以运算结果就是题目的答案
public class 只出现一次的数字 {
    public static void main(String[] args) {
        int [] ck={3,3,4,4,5,6,6,7,7};
        singleNumber(ck);
    }
    static int singleNumber(int [] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++) {
            num=num^nums[i];
        }
        int a=5/2;
        System.out.println(a);
        System.out.println(num);
        return num;
    }
}