package com.qhy.review;

import com.qhy.review.example.Calculator;
import com.qhy.review.example.CalculatorImpl;
import com.qhy.review.example.CalculatorLogImpl;
import com.qhy.review.example.ProxyFactory;

public class Test {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.div(1,1);
    }
}
