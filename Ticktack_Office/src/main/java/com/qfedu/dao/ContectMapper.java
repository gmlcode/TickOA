package com.qfedu.dao;

import com.qfedu.domain.Contect;

public interface ContectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Contect record);

    int insertSelective(Contect record);

    Contect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Contect record);

    int updateByPrimaryKey(Contect record);
}