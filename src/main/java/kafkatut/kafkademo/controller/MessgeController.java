package kafkatut.kafkademo.controller;

import kafkatut.kafkademo.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessgeController {

    private KafkaProducer kafkaProducer;

    public MessgeController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    //    http://localhost:8082/api/v1/kafka/publish?message=harsha sweety
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return  ResponseEntity.ok("message sent to the Topic");
    }
}
