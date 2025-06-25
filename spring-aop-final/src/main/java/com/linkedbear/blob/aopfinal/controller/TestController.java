package com.linkedbear.blob.aopfinal.controller;

import com.linkedbear.blob.aopfinal.service.CglibService;
import com.linkedbear.blob.aopfinal.service.JdkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @Autowired
    private JdkService jdkService;
    
    @Autowired
    private CglibService cglibService;
    
    @GetMapping("/testJdk")
    public void testJdk() {
        jdkService.addDept("JDK", 1);
    }
    
    @GetMapping("/testCglib")
    public void testCglib() {
        cglibService.addDept("Cglib", 1);
    }
    
    @GetMapping("/testCglib2")
    public void testCglib2() {
        cglibService.addDept2("Cglib", 1);
    }
}
