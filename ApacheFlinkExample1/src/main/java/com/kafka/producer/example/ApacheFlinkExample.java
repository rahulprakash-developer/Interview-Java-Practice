package com.kafka.producer.example;


import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;

import java.util.Collections;
import java.util.Properties;

public class ApacheFlinkExample {

    public static void main(String[] args) {
        // Step 1: Set up properties for AdminClient
        Properties properties = new Properties();
        properties.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092"); // Replace with your broker address

        // Step 2: Create AdminClient instance
        try (AdminClient adminClient = AdminClient.create(properties)) {

            // Step 3: Define the topic parameters
            String topicName = "my_topic1";
            int partitions = 3;           // Number of partitions
            short replicationFactor = 1;  // Replication factor (should not exceed the number of brokers)

            // Step 4: Create the NewTopic object
            NewTopic newTopic = new NewTopic(topicName, partitions, replicationFactor);

            // Step 5: Create the topic
            adminClient.createTopics(Collections.singleton(newTopic)).all().get();
            System.out.println("Topic created successfully!");

        } catch (Exception e) {
            System.err.println("Failed to create topic: " + e.getMessage());
        }

    }
}
