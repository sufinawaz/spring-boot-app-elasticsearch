package io.sufi.springbootappelasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "tickery1", type = "harvestTask")
public class HarvestTask {
    private long projectId;
    private long taskId;
    private String projectName;
    private String taskName;
}
