package CyclicSort;
import java.util.*;

public class AllMissingNumbers {
    public static List<Integer> findNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        int i = 0;
        int placeholder;

        while(i < nums.length){
            placeholder = nums[i] - 1;

            if(nums[i] != nums[placeholder]){
                swap(nums, i, placeholder);
            } else{
                i++;
            };
        };

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                missingNumbers.add(j + 1);
            };
        };
        
        return missingNumbers;
    };

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    };
};

// List<Integer> missing = AllMissingNumbers.findNumbers(new int[] { 2, 3, 1, 8, 2, 3, 5, 1 });
//     System.out.println("Missing numbers: " + missing);

//     missing = AllMissingNumbers.findNumbers(new int[] { 2, 4, 1, 2 });
//     System.out.println("Missing numbers: " + missing);

//     missing = AllMissingNumbers.findNumbers(new int[] { 2, 3, 2, 1 });
//     System.out.println("Missing numbers: " + missing);