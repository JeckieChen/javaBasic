package com.company.DesignPatterns.Factory.abstract01;

public class Client {
    public static void main(String[] args) {
        System.out.println("********************小米系列********************");
        miFactory miF = new miFactory();

        IphoneProduct iphoneProduct = miF.iphoneProduct();
        iphoneProduct.start();
        iphoneProduct.call();
        iphoneProduct.sms();
        iphoneProduct.shutdown();

        IRouteProduct iRouteProduct = miF.iRouteProduct();
        iRouteProduct.start();
        iRouteProduct.openwifi();
        iRouteProduct.setting();
        iRouteProduct.shutdown();

        System.out.println("********************华为系列********************");
        HuaweiFactory huaweiFactory = new HuaweiFactory();

        IphoneProduct iphoneProduct2 = huaweiFactory.iphoneProduct();
        iphoneProduct2.start();
        iphoneProduct2.call();
        iphoneProduct2.sms();
        iphoneProduct2.shutdown();

        IRouteProduct iRouteProduct2 = huaweiFactory.iRouteProduct();
        iRouteProduct2.start();
        iRouteProduct2.openwifi();
        iRouteProduct2.setting();
        iRouteProduct2.shutdown();

    }
}
