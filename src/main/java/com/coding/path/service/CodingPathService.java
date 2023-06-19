package com.coding.path.service;

import com.coding.path.service.dao.LanguageDao;

import java.util.List;

public interface CodingPathService {
    List<LanguageDao> getLanguages();

    Integer getTopicSize();
}
