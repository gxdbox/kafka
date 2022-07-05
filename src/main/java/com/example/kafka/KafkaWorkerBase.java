package com.example.kafka;

import lombok.extern.slf4j.Slf4j;

/**
 * @author gxd18
 * @date 2022/7/1
 * @description
 */
@Slf4j
public abstract class KafkaWorkerBase {

    protected abstract void onProduce(FraudContext ctx, RiskResponse resp);

    public Runnable newRunWorker(FraudContext ctx, RiskResponse resp) {
        return new EventSubWorker(ctx, resp);
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    protected void sendMsg(ApiTopics topic,String key ,String msg) {
        String name = topic.name();
//        kafkaProducerService.produce(name, key, msg, new StoreKafkaOffsetCallback(getName()));
    }

    class EventSubWorker implements Runnable {
        private FraudContext ctx;
        private RiskResponse resp;

        public EventSubWorker(FraudContext ctx, RiskResponse resp) {
            this.ctx = ctx;
            this.resp = resp;
        }

        @Override
        public void run() {
            onProduce(ctx, resp);
        }
    }

}
