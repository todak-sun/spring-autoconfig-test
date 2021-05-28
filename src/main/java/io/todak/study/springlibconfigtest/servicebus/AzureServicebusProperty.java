package io.todak.study.springlibconfigtest.servicebus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Set;

import static io.todak.study.springlibconfigtest.common.SpringMetadata.AZURE_SERVICEBUS;

@ToString
@Getter
@Setter
@ConfigurationProperties(AZURE_SERVICEBUS)
public class AzureServicebusProperty {

    private Set<Queue> queues;
    private Set<Topic> topics;
    private Set<Subscription> subscriptions;

    public Queue getQueue(String id) {
        return queues.stream().filter(queue -> queue.id.equals(id)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("%s is not exists.", id)));
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(topic -> topic.id.equals(id)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("%s is not exists.", id)));
    }

    public Subscription getSubscription(String id) {
        return subscriptions.stream().filter(subscription -> subscription.id.equals(id)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("%s is not exists.", id)));
    }

    @ToString
    @Getter
    @Setter
    public static class Queue {
        private String id;
        private String name;
        private String connectionString;
    }

    @ToString
    @Getter
    @Setter
    public static class Topic {
        private String id;
        private String name;
        private String connectionString;
    }

    @ToString
    @Getter
    @Setter
    public static class Subscription {
        private String id;
        private String name;
        private String connectionString;
    }


}
