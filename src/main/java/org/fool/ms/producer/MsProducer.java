package org.fool.ms.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * Created by Administrator on 9/20/2017.
 */
public class MsProducer {
    private Properties properties;

    public MsProducer() {
    }

    public MsProducer(Properties properties) {
        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void sendMessage(String msg) {
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);

        ProducerRecord<String, String> record = new ProducerRecord<>(properties.getProperty("topic"), msg);

        producer.send(record);

        producer.close();
    }
}
