package com.example.kafka.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author gxd18
 * @date 2022/7/1
 * @description
 */
public class BaseProducerConfig {
    private String keySerializer = "org.apache.kafka.common.serialization.StringSerializer";
    private String valueSerializer = "org.apache.kafka.common.serialization.StringSerializer";
    private String acks = "1";
    private String compressionType = "gzip";
    private Integer retries = 1;
    private Integer batchSize = 1048576;
    private Integer lingerMs = 50;
    private String bootstrapServers;
    private String topicPrefix = "";
    private Map<String, Object> otherCfg = new HashMap();

    public BaseProducerConfig() {
    }

    public Properties toProperties() {
        Properties p = new Properties();
        if (null != this.bootstrapServers) {
            p.put("bootstrap.servers", this.bootstrapServers);
        }

        p.put("key.serializer", this.keySerializer);
        p.put("value.serializer", this.valueSerializer);
        p.put("acks", this.acks);
        p.put("compression.type", this.compressionType);
        p.put("retries", this.retries);
        p.put("batch.size", this.batchSize);
        p.put("linger.ms", this.lingerMs);
        p.putAll(this.otherCfg);
        return p;
    }

    public String getKeySerializer() {
        return this.keySerializer;
    }

    public void setKeySerializer(String keySerializer) {
        this.keySerializer = keySerializer;
    }

    public String getValueSerializer() {
        return this.valueSerializer;
    }

    public void setValueSerializer(String valueSerializer) {
        this.valueSerializer = valueSerializer;
    }

    public String getAcks() {
        return this.acks;
    }

    public void setAcks(String acks) {
        this.acks = acks;
    }

    public String getCompressionType() {
        return this.compressionType;
    }

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    public Integer getRetries() {
        return this.retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Integer getBatchSize() {
        return this.batchSize;
    }

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public Integer getLingerMs() {
        return this.lingerMs;
    }

    public void setLingerMs(Integer lingerMs) {
        this.lingerMs = lingerMs;
    }

    public String getBootstrapServers() {
        return null != this.bootstrapServers ? this.bootstrapServers : (String)this.otherCfg.get("bootstrap.servers");
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    public Map<String, Object> getOtherCfg() {
        return this.otherCfg;
    }

    public void setOtherCfg(Map<String, Object> otherCfg) {
        this.otherCfg = otherCfg;
    }

    public String getTopicPrefix() {
        return this.topicPrefix;
    }

    public void setTopicPrefix(String topicPrefix) {
        this.topicPrefix = topicPrefix;
    }
}
