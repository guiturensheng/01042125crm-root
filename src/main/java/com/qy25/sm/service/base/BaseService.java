package com.qy25.sm.service.base;

import com.qy25.sm.page.PageVo;

import java.util.List;

/**
 * @Author: Aaron
 * @Date: 2021/1/2 11:26
 * @Description:
 */
public interface BaseService<T,ID> {

    /*
     * 通过id查询
     * */
    T findById(ID id);
    /*
     * 修改操作
     * */
    int updateEntity(T t);
    /*
     * 添加操作
     * */
    int addEntity(T t);
    /*
     * 删除操作
     * */
    int deleteById(ID id);
    /*
     * 分页查询
     * */
    PageVo<T> findPage();
    /*
    * 有条件的查询
    * */
    PageVo<T> findPage(Object example);
    /*
    * 批量添加
    * */
    int batchAllEntity(List<T> list);
    /*
     * 批量修改
     * */
    int batchUpdateEntity(List<T> list);
    /*
    * 批量删除
    * */
    int batchDeleteByIds(List<ID> ids);
    /*
    * 封装分页数据
    * */
    PageVo<T> setPageVo(List<T> list);


}
