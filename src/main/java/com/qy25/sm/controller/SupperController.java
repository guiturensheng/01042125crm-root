package com.qy25.sm.controller;

import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.entity.Supper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Aaron
 * @Date: 2021/1/2 10:57
 * @Description:
 */
@RestController
@RequestMapping("supper")
public class SupperController extends BaseController<Supper,Long> {
    /*@Autowired
    private SupperService supperService;
    @GetMapping("list")
    public List<Supper> findAll(){
        return supperService.findPage();
    }*/

}
