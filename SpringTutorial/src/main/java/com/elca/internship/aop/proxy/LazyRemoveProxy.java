package com.elca.internship.aop.proxy;

public class LazyRemoveProxy implements Remote{
    private RemoteImpl remote = null;

    @Override
    public void turnOn() {
        System.out.println("Wrapper" + this.remote);
        if(this.remote == null) this.remote = new RemoteImpl();
        this.remote.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Wrapper" + this.remote);
        if(this.remote == null) this.remote = new RemoteImpl();
        this.remote.turnOff();
    }
}
