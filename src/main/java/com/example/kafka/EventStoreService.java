package com.example.kafka;

import java.util.Map;

/**
 * @author gxd18
 * @date 2022/7/1
 * @description
 */
public interface EventStoreService {
    void storeEvent(FraudContext ctx, RiskResponse resp);

    String getCachePath();

    Map<String,Object> getInfo();
}
