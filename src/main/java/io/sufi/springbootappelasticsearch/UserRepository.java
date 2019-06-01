package io.sufi.springbootappelasticsearch;

import io.sufi.springbootappelasticsearch.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface UserRepository extends ElasticsearchRepository<User, String> {
    List<User> findByUsername(String username);
}
