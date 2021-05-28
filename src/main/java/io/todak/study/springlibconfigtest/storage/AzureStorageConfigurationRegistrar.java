package io.todak.study.springlibconfigtest.storage;

import io.todak.study.springlibconfigtest.common.SpringMetadata;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;

@Configuration
public class AzureStorageConfigurationRegistrar implements ImportAware {

    @Bean
    @ConditionalOnMissingBean
    @ConfigurationProperties(SpringMetadata.AZURE_STORAGE)
    public AzureStorageProperty azureStorageProperty() {
        return new AzureStorageProperty();
    }

    @Override
    public void setImportMetadata(AnnotationMetadata annotationMetadata) {

    }


}
