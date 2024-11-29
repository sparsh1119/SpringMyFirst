package org.example;

public class Mobile {
    Sim sim;

    Mobile(){
        System.out.println("Mobile cons");
    }

    Mobile(Sim sim){
        this.sim =sim;
        System.out.println("Called from cons");
    }

    public  void  setSim(Sim sim){
        this.sim = sim;
        System.out.println("Sim inserted");
    }



    public  void display(){
        sim.browse();
        sim.call();
    }
}
