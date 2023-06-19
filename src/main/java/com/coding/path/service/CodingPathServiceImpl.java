package com.coding.path.service;

import com.coding.path.entitiy.Language;
import com.coding.path.mapper.LanguageMapper;
import com.coding.path.repository.JdbcRepository;
import com.coding.path.repository.LanguageRepository;
import com.coding.path.service.dao.LanguageDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CodingPathServiceImpl implements CodingPathService{

    private final LanguageRepository languageRepository;
    private final JdbcRepository jdbcRepository;

    private LanguageMapper mapper=LanguageMapper.LANGUAGEMAPPER;


    public List<LanguageDao> getLanguages(){
       List<Language> languages=languageRepository.findAll();

        return mapper.toLanguageDaos(languages);
    }

    @Override
    public Integer getTopicSize() {
        return jdbcRepository.getTopicSize();
    }


}
