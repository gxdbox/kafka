package com.example.kafka;

import com.example.kafka.thread.AWorkThread;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class KafkaApplicationTests {
    @Resource(name = "a")
    private AWorkThread aWorkThread;

    @Test
    void contextLoads() {
        FraudContext ctx = Mockito.mock(FraudContext.class);
        RiskResponse resp = Mockito.mock(RiskResponse.class);
        aWorkThread.test(ctx, resp);
    }

}
