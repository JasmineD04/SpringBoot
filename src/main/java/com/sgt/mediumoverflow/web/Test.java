package com.sgt.mediumoverflow.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
//these are called as annotations
@RequestMapping("/api")
public class Test {
      @GetMapping("/test")
      public ArrayList foo(){

        ArrayList<Integer> demo = new ArrayList<>();
          demo.add(1);
        demo.add(2);
        demo.add(3);

        return demo;
      }
      @GetMapping("/foo1")
     public static ArrayList foo1(){

    ArrayList<String> demo = new ArrayList<>();
    demo.add("hello");
    demo.add("world");
    demo.add("foo");

    return demo;
   }
}

