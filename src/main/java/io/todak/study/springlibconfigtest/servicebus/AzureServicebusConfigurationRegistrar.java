package io.todak.study.springlibconfigtest.servicebus;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;

@Configuration(proxyBeanMethods = false)
@ConditionalOnProperty(prefix = "spring.tradlinx.azure", name = "enable", havingValue = "true")
@EnableConfigurationProperties(AzureServicebusProperty.class)
public class AzureServicebusConfigurationRegistrar implements ImportAware {

    @Override
    public void setImportMetadata(AnnotationMetadata annotationMetadata) {

    }

}
