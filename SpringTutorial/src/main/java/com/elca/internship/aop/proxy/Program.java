package com.elca.internship.aop.proxy;

public class Program {
    public static void main(String[] args) {
        Remote remoteProxy = new LazyRemoveProxy();
        remoteProxy.turnOn();
        remoteProxy.turnOff();
    }
}
