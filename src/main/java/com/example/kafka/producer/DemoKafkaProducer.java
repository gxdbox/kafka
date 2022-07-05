package com.example.kafka.producer;

import com.example.kafka.config.BaseProducerConfig;
import com.example.kafka.service.KafkaProducerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.Producer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author gxd18
 * @date 2022/7/1
 * @description
 */
@Service("demoKafkaProducer")
@Slf4j
public class DemoKafkaProducer implements KafkaProducerService, EnvironmentAware {

    private ApplicationContext applicationContext;
    private Producer<String,String> producer;
    private BaseProducerConfig baseProducerConfig;

    @Override
    public void produce(String var1, String var2) {

    }

    @Override
    public void produce(String var1, String var2, Object var3) {

    }

    @Override
    public void produce(String var1, String var2, String var3) {

    }

    @Override
    public void produce(String var1, String var2, String var3, Object var4) {

    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public void setEnvironment(Environment environment) {

    }
}
