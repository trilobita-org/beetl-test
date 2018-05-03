package com.test;


import org.beetl.core.GeneralVarTagBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;

/**
 * Created by quxiangqian on 2018/5/2.
 */
@Component
public class NaviTree extends GeneralVarTagBinding {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public void render() {

        //这里的内容为空，不支持注入的方式
        System.out.println(restTemplate);

        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap();
        linkedHashMap.put("a1",0);
        linkedHashMap.put("a2",1);
        this.mapName2Index(linkedHashMap);
        this.binds("a1","a2");
        this.doBodyRender();

    }
}
