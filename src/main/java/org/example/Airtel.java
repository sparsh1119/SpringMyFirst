package org.example;

public class Airtel implements Sim{

    Airtel(){
        System.out.println("Airtel Constructor");
    }

    @Override
    public void call() {
        System.out.println("Calling from airtel");
    }

    @Override
    public void browse() {
        System.out.println("Browsing from airtel..");
    }

    public void tagLine(){
        System.out.println("Express Yourself - Airtel");
    }

    public void signOff(){
        System.out.println("SigningOff- Airtel");
    }
}
