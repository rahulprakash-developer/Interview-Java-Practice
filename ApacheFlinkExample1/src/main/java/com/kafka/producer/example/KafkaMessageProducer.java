package com.kafka.producer.example;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaMessageProducer {

    public static void main(String[] args) {
        // Step 1: Configure producer properties
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092"); // Kafka broker address
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // Step 2: Create KafkaProducer instance
        try (Producer<String, String> producer = new KafkaProducer<>(properties)) {

            // Step 3: Create a message to send
            String topicName = "my_topic"; // Replace with your topic name
            String key = "key1";           // Optional, can be null
            String value = "Hello, Kafka!"; // Message payload

            ProducerRecord<String, String> record = new ProducerRecord<>(topicName, key, value);

            // Step 4: Send the message
            producer.send(record, (metadata, exception) -> {
                if (exception == null) {
                    System.out.printf("Message sent successfully to topic %s, partition %d, offset %d%n",
                            metadata.topic(), metadata.partition(), metadata.offset());
                } else {
                    System.err.println("Error sending message: " + exception.getMessage());
                }
            });
        }
    }
}
