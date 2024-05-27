package com.orange.monitor.kafka;

/**
 * @author orange
 * @date 2024/5/27
 */
public abstract class AbstractKafkaConsumer<T> {

    protected abstract boolean consume(String topic, String data);

}
