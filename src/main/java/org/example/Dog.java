package org.example;

public class Dog implements Pet{


    @Override
    public void say() {
        System.out.println("Gav");
    }

    public void init()
    {
        System.out.println("init Dog");
    }

    public void destroy(){
        System.out.println("Destroy Dog");
    }

}
