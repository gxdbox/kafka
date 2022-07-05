package com.example.kafka.thread;

import com.example.kafka.ApiTopics;
import com.example.kafka.FraudContext;
import com.example.kafka.KafkaWorkerBase;
import com.example.kafka.RiskResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author gxd18
 * @date 2022/7/1
 * @description
 */
@Slf4j
@Service("b")
public class BWorkThread extends KafkaWorkerBase {
    @Override
    protected void onProduce(FraudContext ctx, RiskResponse resp) {
        String str = generateTestParams();
        if (StringUtils.isNotBlank(str)){
            sendMsg(ApiTopics.counter_message,null, str);
        }
    }

    private String generateTestParams() {
        return "test";
    }
}
