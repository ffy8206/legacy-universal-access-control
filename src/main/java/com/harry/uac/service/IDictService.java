package com.harry.uac.service;

import java.util.List;

import com.harry.uac.persistence.Dict;
import com.harry.uac.persistence.DictExample;

public interface IDictService {

    List<Dict> findAllDict(DictExample criteria, String optTable);

    Dict findDict(String code, String optTable);

    void addDict(Dict dict, String optTable);

    void deleteDict(String code, String optTable);

    void updateDict(Dict dict, String optTable);

}
