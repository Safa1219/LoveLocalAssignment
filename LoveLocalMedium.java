//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class LoveLocalMedium {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int k = nums.length / 3 + 1, i;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            i = map.containsKey(num)? map.get(num) + 1 : 1;
            map.put(num, i);
            if(i == k)
                list.add(num);
        }
        return list;
    }

    public static void main(String[] args) {
        LoveLocalMedium solution = new LoveLocalMedium();


        int[] nums1 = {3, 2, 3};
        int[] nums2 = {1};
        int[] nums3 = {1, 2};

        System.out.println(solution.majorityElement(nums1));
        System.out.println(solution.majorityElement(nums2));
        System.out.println(solution.majorityElement(nums3));
    }
}

