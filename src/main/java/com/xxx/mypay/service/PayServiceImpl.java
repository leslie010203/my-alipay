package com.xxx.mypay.service;

import com.alipay.api.AlipayApiException;
import com.xxx.mypay.alipay.Alipay;
import com.xxx.mypay.alipay.AlipayBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Leslie
 * @Date 2019/4/11 18:06
 */
@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private Alipay alipay;

    @Override
    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
        return alipay.pay(alipayBean);
    }
}
