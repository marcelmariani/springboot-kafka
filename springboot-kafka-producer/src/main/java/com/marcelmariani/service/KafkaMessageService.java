package com.marcelmariani.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageService {

	private static final Logger logger = LoggerFactory.getLogger(KafkaMessageService.class);

	@Value("${topic.message-broker-kafka}")
	private String topicMessageBrokerKafka;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String message) {
		logger.info("sendMessage -> " + String.format(message));
		this.kafkaTemplate.send(topicMessageBrokerKafka, message);
	}
}