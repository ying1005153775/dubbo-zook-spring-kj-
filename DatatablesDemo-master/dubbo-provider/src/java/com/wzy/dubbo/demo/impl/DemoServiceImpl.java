package com.wzy.dubbo.demo.impl;

import com.wzy.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {
    public List<String> getPermissions() {
        List<String> demo = new ArrayList<String>();
        demo.add("1");
        demo.add("2");
        demo.add("3");
        return demo;
    }
}
