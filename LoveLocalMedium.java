import java.util.ArrayList;
import java.util.List;

public class LoveLocalMedium {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // In this step we will initialise all the candidate and their count
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        // First pass to find candidates
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Second pass to verify candidates
        count1 = count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        // Check if candidates have occurrences greater than n/3
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;
    }

    public static void main(String[] args) {
        LoveLocalMedium solution = new LoveLocalMedium();

        // Test cases
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {1};
        int[] nums3 = {1, 2};

        System.out.println(solution.majorityElement(nums1)); // Output: [3]
        System.out.println(solution.majorityElement(nums2)); // Output: [1]
        System.out.println(solution.majorityElement(nums3)); // Output: [1, 2]
    }
}

