package io.sufi.springbootappelasticsearch.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "demoapp", type = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String firstName;
    private String lastName;
}
