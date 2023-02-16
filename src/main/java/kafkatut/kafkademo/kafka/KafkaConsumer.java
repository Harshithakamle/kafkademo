package kafkatut.kafkademo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    //consumer will consume message and print by using log statement info
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics="javaguides",groupId="myGroup") //it is used to subscribe to the topic
    public void consume(String message){
        LOGGER.info(String.format("message received ->%s",message));
    }
}


