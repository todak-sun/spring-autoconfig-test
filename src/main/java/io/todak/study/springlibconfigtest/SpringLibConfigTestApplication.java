package io.todak.study.springlibconfigtest;

import io.todak.study.springlibconfigtest.servicebus.EnableAzureServiceBus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAzureServiceBus
@SpringBootApplication
public class SpringLibConfigTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLibConfigTestApplication.class, args);
    }


}
