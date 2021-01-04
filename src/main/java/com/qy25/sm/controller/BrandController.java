package com.qy25.sm.controller;

import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.entity.Brand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Aaron
 * @Date: 2021/1/2 10:57
 * @Description:
 */
@RestController
@RequestMapping("brand")
public class BrandController extends BaseController<Brand,Long> {
   /* @Autowired
    private BrandService brandService;
    @GetMapping("list")
    public List<Brand> findAll(){
        return brandService.findPage();
    }*/

}
