package com.designPatternByKKUsingEnum.ResolveReflectionSingletopon;

public class Test {

    public static void main(String[] args) {
        String data = "1,2,0001731346,4,20241111174201";

        // Split the data by commas
        String[] columns = data.split(",");

        // Extract 3rd and 5th columns (index 2 and 4)
        long epochTimestamp1 = Long.parseLong(columns[2]); // 3rd column in Epoch (seconds)
        long timestamp2 = Long.parseLong(columns[4]); // 5th column in milliseconds (assuming this is the case)

        // Convert 5th column from milliseconds to seconds
        long timestamp2InSeconds = timestamp2 / 1000;

        // Calculate the difference in seconds
        long differenceSeconds = timestamp2InSeconds - epochTimestamp1;

        // Print the result
        System.out.println("Difference in seconds: " + differenceSeconds);
    }
}
