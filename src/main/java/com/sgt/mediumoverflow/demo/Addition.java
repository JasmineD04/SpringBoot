package com.sgt.mediumoverflow.demo;


import org.springframework.stereotype.Component;

@Component
//component means it has become a bean
public class Addition {
  public void add(){
    System.out.println("Addition function has been called");
  }
}
