package com.qy25.sm.mapper;

import com.qy25.sm.entity.Brand;
import com.qy25.sm.entity.BrandExample;
import com.qy25.sm.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandMapper extends BaseMapper<Brand,String> {

}