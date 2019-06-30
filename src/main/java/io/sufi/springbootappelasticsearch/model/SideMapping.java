package io.sufi.springbootappelasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "tickery2", type = "sideMapping")
public class SideMapping {
    @Id
    private String id;
    private int sideNumber;
    private HarvestTask harvestTask;
}
