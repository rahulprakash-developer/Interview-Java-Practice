package com.java.ntt.interview;

import java.util.Arrays;

public class CountFromInputData {
    public static void main(String[] args) {
        // Available inputs (like coin denominations)
        int[] inputs = {5, 10, 25};

        // Example target input (to calculate minimum counts)
        int target = 40;

        int result = minCount(inputs, target);

        System.out.println("Minimum number of inputs required: " + result);
    }

    public static int minCount(int[] inputs, int target) {
        // Create an array to store minimum counts for each value from 0 to target
        int[] dp = new int[target + 1];

        // Initialize dp array with a large number (like infinity) for all values except dp[0]
        Arrays.fill(dp, target + 1);
        dp[0] = 0; // No input needed to make 0

        // Iterate through all values from 1 to target
        for (int i = 1; i <= target; i++) {
            for (int input : inputs) {
                // If the input can be used to form the value i
                if (i - input >= 0) {
                    // Take the minimum of the current value or 1 plus the previous subproblem result
                    dp[i] = Math.min(dp[i], dp[i - input] + 1);
                }
            }
        }

        // If dp[target] is still the initialized value, it means no solution exists
        return dp[target] > target ? -1 : dp[target];
    }
}

