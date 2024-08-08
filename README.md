Practical development of two APIs, a producer API for sending messages and a consumer API for receiving messages previously recorded in the bora_praticar_kafka topic.

Prerequisites:

1 - Create Spring Boot projects
 - Spring IO:
	https://start.spring.io/
 - Dependencies:
	Web and Kafka

2 - Create Docker-compose
 - kafka-docker-compose.yml
 
3 - Java Clean Package:
	mvn clean package -DskipTests

4 - Command to run docker-compose in the console of your choice:
	docker compose up -d --build

5 - Access Kafdrop Dashboard
 - Browser of your choice:
	localhost:19000

6 - Implemented codes
 - Producer: springboot-kafka-producer
 - Consumer: springboot-kafka-consumer

7 - Postman:
 - Kafka.postman_collection.json