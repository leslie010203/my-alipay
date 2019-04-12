package com.xxx.mypay.service;

import com.alipay.api.AlipayApiException;
import com.xxx.mypay.alipay.AlipayBean;

/**
 * @Author Leslie
 * @Date 2019/4/11 18:04
 */
public interface PayService {
    String aliPay(AlipayBean alipayBean) throws AlipayApiException;
}
