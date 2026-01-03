package com.info.configdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildConfig {

    @Value("${OS:default}")
    private String buildId;
    @Value("%${gradle:default}")
    private String buildName;
    @Value("${MAVEN_HOME:default}")
    private String buildVersion;

    @GetMapping("/build-info")
    public String buildInfo(){
        return "Build-Id: " + buildId + "Version: " + buildVersion + "Build Name: " + buildName;
     }
}
