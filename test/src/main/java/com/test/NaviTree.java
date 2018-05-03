package com.test;


import org.beetl.core.GeneralVarTagBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;

/**
 * Created by quxiangqian on 2018/5/2.
 */
public class NaviTree extends GeneralVarTagBinding {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public void render() {


        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap();
        linkedHashMap.put(getAttributeValue("v").toString(),0);

        this.doBodyRender();

    }
}
