package com.xxx.mypay.config;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author Leslie
 * @Date 2019/4/11 17:27
 */
@Component
public class PropertiesListener implements ApplicationListener<ApplicationStartedEvent> {


    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        AlipayProperties.loadProperties();
    }
}
