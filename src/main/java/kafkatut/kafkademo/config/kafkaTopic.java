package kafkatut.kafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopic {

    //here we are going to use default partitions provided by kafka
    //biuld to create topic instance

    @Bean
    public NewTopic javaTopic(){

        return TopicBuilder.name("javaguides")
                .build();
    }

    @Bean
    public NewTopic javaGuidesJsonTopic(){

        return TopicBuilder.name("javaguides_json")
                .build();
    }
}
