package com.infuq.facade.impl;


import com.infuq.facade.BigObject;
import com.infuq.facade.QueryUserInfoFacade;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service("queryUserInfoFacade")
public class QueryUserInfoFacadeImpl implements QueryUserInfoFacade {


    @Override
    public Object update(String address) {

        System.out.println("[Dubbo提供者]:" + Thread.currentThread().getName() + "执行Dubbo接口调用");

        return new BigObject(address + new Random().nextInt(4096), 2020);


    }
}
