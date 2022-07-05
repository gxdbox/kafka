package com.example.kafka.service;

import java.io.Closeable;

/**
 * @author gxd18
 * @date 2022/7/1
 * @description
 */
public interface KafkaProducerService extends Closeable {
    void produce(String var1, String var2);

    void produce(String var1, String var2, Object var3);

    void produce(String var1, String var2, String var3);

    void produce(String var1, String var2, String var3, Object var4);
}
