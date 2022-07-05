package com.example.kafka;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gxd18
 * @date 2022/7/1
 * @description
 */
public enum ApiTopics {
    counter_message, elasticsearch_message, ipnotice_message, rule_trigger, salaxyzb_message,
    velocity_message, statistic_api_tps_message, statistic_api_call_message,abtest_elasticsearch_message,
    batch_elasticsearch_message;

    public static List<String> names() {
        ApiTopics[] values = ApiTopics.values();
        List<String> names = new ArrayList<>();
        for (ApiTopics value : values) {
            names.add(value.name());
        }
        return names;
    }
}
