package com.qy25.sm.mapper;

import com.qy25.sm.entity.Category;
import com.qy25.sm.entity.CategoryExample;
import com.qy25.sm.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryMapper extends BaseMapper<Category,Long> {

}