import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 众数 {
    public static void main(String[] args) {
        int [] ck={2,4,4,4,5,4,5,5,5,5,5,5};
        singleNumber(ck);
    }
    static int singleNumber(int [] nums) {
        /*Arrays.sort(nums);
        int a =(nums.length/2);
        System.out.println(nums[a]);
        return nums[a];*/

        /*HashMap<Integer, Integer> map = new HashMap<>();
        for (int num :
                nums) {
            Integer cnt = map.get(num);
            if (cnt == null) {
                cnt = 1;
            } else {
                cnt++;
            }
            if (cnt > nums.length / 2) {
                return num;
            }
            map.put(num, cnt);
        }
        return 0;*/
        int maj = nums[0];
        int count = 1;
        for (int num : nums) {
            if (maj == num) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    maj = num;
                    count = 1;
                }
            }
        }
        System.out.println(maj);
        return maj;
    }
}