package TwoPointers;

import java.util.HashMap;

public class PairWithTargetSum {
    public static int[] search(int[] arr, int targetSum) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int currentSum = arr[left] + arr[right];
            if(currentSum > targetSum){
                right--;
            } else if(currentSum < targetSum){
                left++;
            } else{
                return new int[] {left, right};
            };
        };

        return new int[] {-1, -1};
    };
    
    public static int[] search1(int[] arr, int targetSum) {
        HashMap<Integer, Integer> nums = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(nums.containsKey(targetSum - arr[i])){
                return new int[] {nums.get(targetSum - arr[i]), i};
            } else{
                nums.put(arr[i], i);
            };
        };

        return new int[] {-1, -1};
    };
    
    public static int[] search2(int[] arr, int targetSum) {
        int firstPointer = 0;
        int lastPointer = arr.length - 1;
        int sum;

        while(firstPointer < lastPointer){
            sum = arr[firstPointer] + arr[lastPointer];

            if(sum == targetSum){
                return new int[] {firstPointer, lastPointer};
            } else if(sum > targetSum){
                lastPointer--;
            } else{
                firstPointer++;
            };
        };

        return new int[] {-1, -1};
    };
    
    public static int[] search3(int[] arr, int targetSum) {
        HashMap<Integer, Integer> arrHash = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr.length; i++){
            if(arrHash.containsKey(targetSum - arr[i])){
                return new int[] {arrHash.get(targetSum - arr[i]), i};
            };

            arrHash.put(arr[i], i);
        };

        return new int[] {-1, -1};
    };
};

// int[] result = PairWithTargetSum.search1(new int[] { 1, 2, 3, 4, 6 }, 6);
// System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
// result = PairWithTargetSum.search1(new int[] { 2, 5, 9, 11 }, 11);
// System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");