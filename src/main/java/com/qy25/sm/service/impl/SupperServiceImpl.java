package com.qy25.sm.service.impl;

import com.qy25.sm.entity.Supper;
import com.qy25.sm.service.SupperService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Aaron
 * @Date: 2021/1/2 10:52
 * @Description:
 */
@Service
@Transactional
public class SupperServiceImpl extends BaseServiceImpl<Supper,Long> implements SupperService {

}
