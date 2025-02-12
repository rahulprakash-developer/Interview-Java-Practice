package com.kafka.producer.example;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.ListTopicsResult;

import java.util.Properties;
import java.util.Set;

public class ListKafkaTopics {

    public static void main(String[] args) {
        // Step 1: Set up the Kafka admin client configuration
        Properties properties = new Properties();
        properties.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092"); // Kafka broker address

        // Step 2: Create the AdminClient instance
        try (AdminClient adminClient = AdminClient.create(properties)) {

            // Step 3: List the topics
            ListTopicsResult listTopicsResult = adminClient.listTopics();
            Set<String> topics = listTopicsResult.names().get(); // Get all topic names

            // Step 4: Print the topics
            System.out.println("List of Kafka Topics:");
            for (String topic : topics) {
                System.out.println(topic);
            }

        } catch (Exception e) {
            System.err.println("Error listing topics: " + e.getMessage());
        }
    }
}
