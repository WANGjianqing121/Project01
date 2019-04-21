package com.atguigu.java;

import com.guigu.bean.Customer;

import java.util.ArrayList;

public class HelloWorld {
    int a;

    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("HelloWorld.main");
        System.out.println("args = " + args);
        int num1=0;
        int num2=1;
        System.out.println(num1);
        for (String arg : args) {

        }
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }
        ArrayList<String> strings = new ArrayList<>();
        for (String string : strings) {

        }
        if (strings == null) {

        }
        if (strings != null) {

        }

    }
    private static final Customer cust = new Customer();

    public HelloWorld() {
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
