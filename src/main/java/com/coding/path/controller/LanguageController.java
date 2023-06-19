package com.coding.path.controller;

import com.coding.path.service.CodingPathService;
import com.coding.path.service.dao.LanguageDao;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/mypath/")
public class LanguageController {
    public LanguageController(@Autowired CodingPathService codingPathService) {
        this.codingPathService = codingPathService;
    }

    private final CodingPathService codingPathService;

    @GetMapping(path = "getLanguages")
    public @ResponseBody List<LanguageDao> getAllLanguages(){

         List<LanguageDao> response=codingPathService.getLanguages();
        return response;
    }
    @GetMapping(path = "topicSize")
    public @ResponseBody Integer returnTopicSize(){

        return  codingPathService.getTopicSize();
    }
}
