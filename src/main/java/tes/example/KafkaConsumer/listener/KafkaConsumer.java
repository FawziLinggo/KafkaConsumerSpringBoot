package tes.example.KafkaConsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import tes.example.KafkaConsumer.model.DaftarBank;
import tes.example.KafkaConsumer.model.Debit;
import tes.example.KafkaConsumer.model.Kredit;
import tes.example.KafkaConsumer.model.User;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "daftar_bank", groupId = "db_1", containerFactory = "dbKafkaListenerFactory")
    public void consumerdb(DaftarBank daftarBank) {
        System.out.println(
                "Pesan Daftar Bank : " + daftarBank
        );
    }

    @KafkaListener(topics = "kredit", groupId = "k_1", containerFactory = "kreditKafkaListenerFactory")
    public void consumerkredit(Kredit kredit) {
        System.out.println(
                "Pesan Daftar Kredit : " + kredit
        );
    }

    @KafkaListener(topics = "debit", groupId = "d_1",
            containerFactory = "debitKafkaListenerFactory")
    public void consumerdebit(Debit debit) {
        System.out.println(
                "Pesan Daftar Debit : " + debit
        );
    }
}