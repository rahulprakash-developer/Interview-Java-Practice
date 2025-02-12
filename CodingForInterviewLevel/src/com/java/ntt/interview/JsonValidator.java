package com.java.ntt.interview;



public class JsonValidator {
    public static void main(String[] args) {
        // Sample JSON string (valid JSON)
        String jsonString = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";

        // Validate JSON
        if (isValidJSON(jsonString)) {
            System.out.println("Valid JSON!");
        } else {
            System.out.println("Invalid JSON!");
        }
    }

    // Function to validate JSON
    public static boolean isValidJSON(String jsonString) {
        try {
            new JSONObject(jsonString); // Will throw an exception if invalid
            return true; // If no exception, JSON is valid
        } catch (JSONException e) {
            return false; // If exception occurs, JSON is invalid
        }
    }
}
