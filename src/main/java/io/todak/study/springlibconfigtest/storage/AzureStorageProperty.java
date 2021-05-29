package io.todak.study.springlibconfigtest.storage;

import io.todak.study.springlibconfigtest.common.SpringMetadata;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ToString
@Getter
@Setter
@ConfigurationProperties(SpringMetadata.AZURE_STORAGE)
public class AzureStorageProperty {
    private String connectionString;
}
