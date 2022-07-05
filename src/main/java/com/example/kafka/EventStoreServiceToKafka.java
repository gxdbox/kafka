package com.example.kafka;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author gxd18
 * @date 2022/7/1
 * @description
 */
@Service("eventStoreServiceToKafka")
public class EventStoreServiceToKafka implements EventStoreService, EnvironmentAware {
    @Override
    public void storeEvent(FraudContext ctx, RiskResponse resp) {

    }

    @Override
    public String getCachePath() {
        return null;
    }

    @Override
    public Map<String, Object> getInfo() {
        return null;
    }

    @Override
    public void setEnvironment(Environment environment) {

    }
}
