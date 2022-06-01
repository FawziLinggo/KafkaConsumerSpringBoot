package tes.example.KafkaConsumer.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import tes.example.KafkaConsumer.model.DaftarBank;
import tes.example.KafkaConsumer.model.Debit;
import tes.example.KafkaConsumer.model.Kredit;
import tes.example.KafkaConsumer.model.User;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConfiguration {

    @Bean
    public ConsumerFactory<String, DaftarBank> daftarbankConsumerFactory(){
        Map<String,Object> config = new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"172.18.46.121:9092,172.18.46.120:9092,172.18.46.122:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG,"db_1");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), new
                JsonDeserializer<>(DaftarBank.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, DaftarBank> dbKafkaListenerFactory(){
        ConcurrentKafkaListenerContainerFactory<String, DaftarBank> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(daftarbankConsumerFactory());
        return factory;
    }

    @Bean
    public ConsumerFactory<String, Kredit> kreditConsumerFactory(){
        Map<String,Object> config = new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"172.18.46.121:9092,172.18.46.120:9092,172.18.46.122:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG,"k_1");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), new
                JsonDeserializer<>(Kredit.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Kredit> kreditKafkaListenerFactory(){
        ConcurrentKafkaListenerContainerFactory<String, Kredit> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(kreditConsumerFactory());
        return factory;
    }

    @Bean
    public ConsumerFactory<String, Debit> debitConsumerFactory(){
        Map<String,Object> config = new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
                "172.18.46.121:9092,172.18.46.120:9092,172.18.46.122:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG,"d_1");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), new
                JsonDeserializer<>(Debit.class));}
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Debit> debitKafkaListenerFactory(){
        ConcurrentKafkaListenerContainerFactory<String, Debit> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(debitConsumerFactory());
        return factory;}
}
