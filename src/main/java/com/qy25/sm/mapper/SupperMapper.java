package com.qy25.sm.mapper;

import com.qy25.sm.entity.Supper;
import com.qy25.sm.entity.SupperExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupperMapper {
    long countByExample(SupperExample example);

    int deleteByExample(SupperExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Supper record);

    int insertSelective(Supper record);

    List<Supper> selectByExample(SupperExample example);

    Supper selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Supper record, @Param("example") SupperExample example);

    int updateByExample(@Param("record") Supper record, @Param("example") SupperExample example);

    int updateByPrimaryKeySelective(Supper record);

    int updateByPrimaryKey(Supper record);
}