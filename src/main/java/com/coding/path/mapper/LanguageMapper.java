package com.coding.path.mapper;

import com.coding.path.entitiy.Language;
import com.coding.path.service.dao.LanguageDao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface  LanguageMapper {

    public static final LanguageMapper LANGUAGEMAPPER= Mappers.getMapper(LanguageMapper.class);


    @Mapping(source ="language_id" ,target="id" )
    public abstract LanguageDao toLanguageDao(Language lang);
    public abstract List<LanguageDao> toLanguageDaos(List<Language> lang);

    @Mapping(source ="id" ,target="language_id" )
    public abstract Language toLanguage(LanguageDao languageDao);


    public abstract List<Language> toLanguages(List<LanguageDao >languageDao);
}
