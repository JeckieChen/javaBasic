package com.company.DesignPatterns.Factory.abstract01;

public class miFactory implements IProductFactory {
    @Override
    public IRouteProduct iRouteProduct() {
        return new miroute();
    }

    @Override
    public IphoneProduct iphoneProduct() {
        return new miiphone();
    }
}
