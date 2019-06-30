package io.sufi.springbootappelasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "tickery3", type = "sideMapping")
public class SideMappingList {
    private List<SideMapping> sideMappings = new ArrayList<>();
}
