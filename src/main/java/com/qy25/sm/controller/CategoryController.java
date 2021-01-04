package com.qy25.sm.controller;

import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.entity.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Aaron
 * @Date: 2021/1/2 14:13
 * @Description:
 */
@RestController
@RequestMapping("category")
public class CategoryController extends BaseController<Category,Long> {
}
