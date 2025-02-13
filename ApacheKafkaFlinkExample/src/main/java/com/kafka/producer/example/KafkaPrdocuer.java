package com.kafka.producer.example;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class KafkaPrdocuer {
    public static void main(String[] args) throws Exception {
        // 1. Set up the Flink Execution Environment
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        // 2. Define a simple stream with some data
        DataStream<String> stream = env.fromElements("Hello", "Flink", "World");

        // 3. Transform the data (convert each word to uppercase)
        DataStream<String> transformedStream = stream.map(new MapFunction<String, String>() {
            @Override
            public String map(String value) throws Exception {
                return value.toUpperCase();  // Transform to uppercase
            }
        });

        // 4. Print the results (for testing purposes)
        transformedStream.print();

        // 5. Execute the Flink job
        env.execute("Simple Flink Job");
    }
}
