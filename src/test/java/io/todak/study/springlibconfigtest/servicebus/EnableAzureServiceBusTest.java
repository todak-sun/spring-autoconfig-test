package io.todak.study.springlibconfigtest.servicebus;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
@SpringBootTest
public class EnableAzureServiceBusTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void context_has_azure_service_bus_property() {
        AzureServicebusProperty property = context.getBean(AzureServicebusProperty.class);
        assertNotNull(property);
        assertFalse(property.getQueues().isEmpty());
        assertFalse(property.getTopics().isEmpty());
        assertFalse(property.getSubscriptions().isEmpty());

        log.info("property : {}", property);
    }

}
