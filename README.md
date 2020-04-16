# Spring Boot with Kafka Consumer Example

This Project covers how to use Spring Boot with Spring Kafka to Consume JSON/String message from Kafka topics.
We are done with the required Java code. Now lets start Apache Kafka. As we had explained in detail in the Getting started with Apache Kafka perform the following.

Download the Apache Kafka from this link:

https://kafka.apache.org/downloads

- `Unzip kafka-folder and go to \kafka_2.12-2.0.0\bin\`

## Start Zookeeper
- `zookeeper-server-start.sh config/zookeeper.properties`

## Start Kafka Server
- `kafka-server-start.sh config/server.properties`

## Create Kafka Topic
- `kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic myTopic`
- `kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example_json`

## Publish to the Kafka Topic via Console
- `kafka-console-producer.sh --broker-list localhost:9092 --topic myTopic`
- `kafka-console-producer.sh --broker-list localhost:9092 --topic Kafka_Example_json`
