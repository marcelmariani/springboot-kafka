package com.marcelmariani.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelmariani.service.KafkaMessageService;

@RestController
@RequestMapping("/message")
public class KafkaController {

	@Autowired
	KafkaMessageService KafkaMessageService;
	
	@PostMapping("send")
	public ResponseEntity<String> postMessage(@RequestBody String message) {
		KafkaMessageService.sendMessage(message);
		return ResponseEntity.ok().body("Mensagem enviada com sucesso: " + message);
	}
	
//	@GetMapping("/read")
//	public ResponseEntity<String> readMessage() {
//		KafkaMessageService.readMessage();
//		return ResponseEntity.ok().body("Mensagem enviada com sucesso: " + message);
//	}
}