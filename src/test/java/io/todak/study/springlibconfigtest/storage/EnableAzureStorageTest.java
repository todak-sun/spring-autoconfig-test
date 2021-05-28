package io.todak.study.springlibconfigtest.storage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EnableAzureStorageTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void is_bean() {
        AzureStorageProperty property = context.getBean(AzureStorageProperty.class);
        assertNotNull(property);
    }

}
