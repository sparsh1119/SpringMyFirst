package org.example;

import javax.annotation.PreDestroy;

public class Jio implements Sim{

    Jio(){
        System.out.println("Jio Constructor");
    }

    @Override
    public void call() {
        System.out.println("Calling from jio");
    }

    @Override
    public void browse() {
        System.out.println("Browsing from jio..");
    }

    public void tagLine(){
        System.out.println("Jio - Digital Life");
    }

    @PreDestroy
    public void signOff(){
        System.out.println("SigningOff- Jio");
    }
}
