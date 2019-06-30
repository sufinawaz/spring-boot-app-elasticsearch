package io.sufi.springbootappelasticsearch.rest;

import io.sufi.springbootappelasticsearch.model.SideMappingList;
import io.sufi.springbootappelasticsearch.service.MappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingResource {
    private MappingService mappingService;

    @Autowired
    public MappingResource(final MappingService mappingService) {
        this.mappingService = mappingService;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/mapping")
    @ResponseBody
    SideMappingList saveMapping(@RequestBody SideMappingList sideMappingList) {
        return mappingService.saveMapping(sideMappingList);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/mapping")
    @ResponseBody
    SideMappingList getSideMappingList() {
        return mappingService.findAll();
    }
}
