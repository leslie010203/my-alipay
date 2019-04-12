package com.xxx.mypay.cotroller;

import com.alipay.api.AlipayApiException;
import com.xxx.mypay.alipay.AlipayBean;
import com.xxx.mypay.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Leslie
 * @Date 2019/4/11 18:00
 */
@RestController
@RequestMapping("order")
public class OrderController {


    @Autowired
    private PayService payService;


    @PostMapping(value = "alipay")
    public String alipay(String outTradeNo, String subject, String totalAmount, String body) throws AlipayApiException {
        AlipayBean alipayBean = new AlipayBean();
        alipayBean.setOut_trade_no(outTradeNo);
        alipayBean.setSubject(subject);
        alipayBean.setTotal_amount(totalAmount);
        alipayBean.setBody(body);
        return payService.aliPay(alipayBean);
    }












}
