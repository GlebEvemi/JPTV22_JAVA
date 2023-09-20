package com.javacourse.se.lesson5;


import September20.GetAndSet;
import September20.StaticVar;

public class Main {
    public static void main(String[] args) {
        //App1 app = new App1();
        //app.active = true;
        //app.setActive(true);
        //System.out.println("app.toString = " + app.toString());

        //app.run();

        //Calculator calculator = new Calculator();
        //System.out.println(calculator.mult(1,2));
        //StaticVar s1 = new StaticVar();
        //StaticVar s2 = new StaticVar();

        //StaticVar.variable = 5;
        GetAndSet get = new GetAndSet();
        get.setA(10);
        System.out.println(get.getA());




    }
}