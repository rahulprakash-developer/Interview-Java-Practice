package com.kafka.consumer.example;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class KafkaMessageConsumer {

    public static void main(String[] args) {
        // Step 1: Configure consumer properties
        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092"); // Kafka broker address
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "my-consumer-group");       // Consumer group ID
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");       // Start from the earliest message

        // Step 2: Create KafkaConsumer instance
        try (KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties)) {

            // Step 3: Subscribe to the topic
            String topicName = "my_topic"; // Replace with your topic name
            consumer.subscribe(Collections.singletonList(topicName));

            // Step 4: Poll for new messages
            while (true) {
                ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
                for (ConsumerRecord<String, String> record : records) {
                    System.out.printf("Consumed message with key: %s, value: %s, topic: %s, partition: %d, offset: %d%n",
                            record.key(), record.value(), record.topic(), record.partition(), record.offset());
                }
            }
        }
    }
}
