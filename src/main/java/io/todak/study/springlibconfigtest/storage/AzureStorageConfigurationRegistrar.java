package io.todak.study.springlibconfigtest.storage;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;

@Configuration
@ConditionalOnProperty(prefix = "spring.myconfig.azure", name = "enable", havingValue = "true")
@EnableConfigurationProperties(AzureStorageProperty.class)
public class AzureStorageConfigurationRegistrar implements ImportAware {


    @Override
    public void setImportMetadata(AnnotationMetadata annotationMetadata) {

    }


}
