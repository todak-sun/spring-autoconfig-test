package io.todak.study.springlibconfigtest.storage;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class AzureStorageProperty {
    private String connectionString;
}
