package com.qy25.sm.mapper;

import com.qy25.sm.entity.Supper;
import com.qy25.sm.entity.SupperExample;
import com.qy25.sm.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SupperMapper extends BaseMapper<Supper,Long> {

}