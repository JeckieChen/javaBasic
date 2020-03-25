package com.company.DesignPatterns.Factory.abstract01;

public class HuaweiFactory implements IProductFactory {
    @Override
    public IRouteProduct iRouteProduct() {
        return new HuaweiRoute();
    }

    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaweiPhone();
    }
}
