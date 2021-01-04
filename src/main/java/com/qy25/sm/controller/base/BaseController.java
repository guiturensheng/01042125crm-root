package com.qy25.sm.controller.base;

import com.github.pagehelper.PageHelper;
import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.page.PageVo;
import com.qy25.sm.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Aaron
 * @Date: 2021/1/2 11:50
 * @Description:
 */

public class BaseController<T,ID> {
    @Autowired
    private BaseService<T,ID> baseService;
    @GetMapping
    public AxiosResult<PageVo<T>> findPage(@RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "5") int pageSize ){
        PageHelper.startPage(currentPage,pageSize);
        PageVo<T> page = baseService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<T> findById(@PathVariable ID id){
        return AxiosResult.success(baseService.findById(id));
    }
    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody T entity){
        int i = baseService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody T entity){
        int i = baseService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteEntity(@PathVariable ID id){
        int i = baseService.deleteById(id);
        return toAxios(i);
    }

    public AxiosResult<Void> toAxios(int row){
        return row>0?AxiosResult.success():AxiosResult.error();
    }
}
