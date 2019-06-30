package io.sufi.springbootappelasticsearch.service;

import io.sufi.springbootappelasticsearch.MappingRepository;
import io.sufi.springbootappelasticsearch.model.SideMapping;
import io.sufi.springbootappelasticsearch.model.SideMappingList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MappingService {

    private MappingRepository mappingRepository;

    @Autowired
    public MappingService(final MappingRepository mappingRepository) {
        this.mappingRepository = mappingRepository;
    }

    public SideMappingList saveMapping(SideMappingList sideMappingList) {

        mappingRepository.deleteAll();
        final SideMappingList sideMappingList1 = new SideMappingList();
        for (SideMapping sideMapping : sideMappingList.getSideMappings()) {
            sideMappingList1.getSideMappings().add(mappingRepository.save(sideMapping));
        }
        return sideMappingList1;
    }

    public SideMappingList findAll() {
        final SideMappingList sideMappingList = new SideMappingList();
        final List<SideMapping> sideMappings = mappingRepository.findAll(PageRequest.of(0, 10000)).getContent();

        sideMappingList.getSideMappings().addAll(sideMappings);
        return sideMappingList;
    }
}
