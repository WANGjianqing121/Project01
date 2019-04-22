package com.atguigu.java;

import java.util.HashMap;

public class DebugTest {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","tom");
        map.put("age","12");
        map.put("school","tsinghua");
        map.put("major","computer");

        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("age");

        System.out.println(map);
    }
}
