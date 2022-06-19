package com.elca.internship.aop.proxy;

public class RemoteImpl implements Remote{
    @Override
    public void turnOn() {
        System.out.println("Turn on the light!");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the light!");
    }
}
