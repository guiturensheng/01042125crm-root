package com.qy25.sm.service.base.impl;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.github.pagehelper.PageInfo;
import com.qy25.sm.mapper.base.BaseMapper;
import com.qy25.sm.page.PageVo;
import com.qy25.sm.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Aaron
 * @Date: 2021/1/2 11:31
 * @Description:
 */

@Service
public class BaseServiceImpl<T,ID> implements BaseService<T,ID> {

    @Autowired
    private BaseMapper<T,ID> baseMapper;
    @Override
    public PageVo<T> findPage() {
        List<T> ts = baseMapper.selectByExample(null);
        PageVo<T> pageVo = setPageVo(ts);
        return pageVo;
    }

    public BaseMapper<T,ID> getBaseMapper(){
        return baseMapper;
    }

    @Override
    public PageVo<T> findPage(Object example) {
        return setPageVo(baseMapper.selectByExample(example));
    }
    @Transactional
    @Override
    public int batchAllEntity(List<T> list) {
        list.forEach(item->baseMapper.insert(item));
        return 1;
    }
    @Transactional
    @Override
    public int batchUpdateEntity(List<T> list) {
        list.forEach(item->baseMapper.updateByPrimaryKey(item));
        return 1;
    }
    @Transactional
    @Override
    public int batchDeleteByIds(List<ID> ids) {
        ids.forEach(item->baseMapper.deleteByPrimaryKey(item));
        return 1;
    }

    @Override
    public PageVo<T> setPageVo(List<T> ts) {
        PageInfo<T> pageInfo = new PageInfo<>(ts);
        long total = pageInfo.getTotal();
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setList(ts);
        pageVo.setTotal(total);
        return pageVo;
    }

    @Override
    public  T findById(ID id) {
        return (T) baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateEntity(T t) {
        return baseMapper.updateByPrimaryKey(t);
    }

    @Override
    public int addEntity(T t) {
        return baseMapper.insert(t);
    }

    @Override
    public int deleteById(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }
}
