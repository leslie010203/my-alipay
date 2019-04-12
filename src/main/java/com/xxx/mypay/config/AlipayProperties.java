package com.xxx.mypay.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 应用启动加载文件
 *
 * @Author Leslie
 * @Date 2019/4/11 17:30
 */
@Component
public class AlipayProperties {

    public static final String APP_ID = "2016091100488663";
    public static final String PRIVARY_KEY = "privateKey";
    public static final String PUBLIC_KEY = "publicKey";
    public static final String NOTIFY_URL = "notifyUrl";
    public static final String RETURN_URL = "returnUrl";
    public static final String SIGN_TYPE = "signType";
    public static final String CHARSET = "charset";
    public static final String GATEWAY_URL = "gatewayUrl";
    public static final String LOG_PATH = "logPath";


    /**
     * 保存加载配置参数
     */
    private static Map<String, String> propertiesMap = new HashMap<>();


    public static void loadProperties() {
        //获得PathMatchingResourcePatternResolver对象
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            //加载resource文件
            Resource resource = resolver.getResource("classpath:alipay.properties");
            PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
            propertiesFactoryBean.setLocation(resource);
            propertiesFactoryBean.afterPropertiesSet();
            Properties object = propertiesFactoryBean.getObject();

            for (String key :
                    object.stringPropertyNames()) {
                propertiesMap.put(key, (String) object.get(key));
            }


        } catch (Exception e) {
            new Exception("配置文件加载失败");
        }

    }


    public static String getAppId() {
        return APP_ID;
    }

    public static String getPrivaryKey() {
        return PRIVARY_KEY;
    }

    public static String getPublicKey() {
        return PUBLIC_KEY;
    }

    public static String getNotifyUrl() {
        return NOTIFY_URL;
    }

    public static String getReturnUrl() {
        return RETURN_URL;
    }

    public static String getSignType() {
        return SIGN_TYPE;
    }

    public static String getCHARSET() {
        return CHARSET;
    }

    public static String getGatewayUrl() {
        return GATEWAY_URL;
    }

    public static String getLogPath() {
        return LOG_PATH;
    }

    public static Map<String, String> getPropertiesMap() {
        return propertiesMap;
    }
}
