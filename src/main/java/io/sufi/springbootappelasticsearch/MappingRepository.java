package io.sufi.springbootappelasticsearch;

import io.sufi.springbootappelasticsearch.model.SideMapping;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MappingRepository extends ElasticsearchRepository<SideMapping, String> {
    Page<SideMapping> findAll();
}
