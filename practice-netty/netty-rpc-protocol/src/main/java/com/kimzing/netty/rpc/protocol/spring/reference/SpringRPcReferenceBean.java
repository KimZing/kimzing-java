package com.kimzing.netty.rpc.protocol.spring.reference;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

public class SpringRPcReferenceBean implements FactoryBean<Object> {

    private String serviceAddress;

    private int servicePort;

    private Class<?> interfaceClass;

    @Override
    public Object getObject() throws Exception {
       return Proxy.newProxyInstance(interfaceClass.getClassLoader(),new Class<?>[]{interfaceClass},new RpcInvokerProxy(serviceAddress,servicePort));

    }

    @Override
    public Class<?> getObjectType() {
        return this.interfaceClass;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public void setServicePort(int servicePort) {
        this.servicePort = servicePort;
    }

    public void setInterfaceClass(Class<?> interfaceClass) {
        this.interfaceClass = interfaceClass;
    }
}
