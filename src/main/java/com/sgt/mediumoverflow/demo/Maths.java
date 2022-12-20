package com.sgt.mediumoverflow.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Maths {
  @Autowired
  Addition maths;
//    autowired checks the reference , for example yaha reference addition class ka hai, so autowired addition ka ek new object bana dega
//    autowired ko bahar hi rakho as a a member variable , aise samaj lo k autowired reference bind kardega to that specific class
//  we use this concept of dependency injection so that we dont have to create new objects again and again of the same class
//  @autowired IOC manager se laake reference bind kardega
//  jisko autowire karte ho , usko bhi bean(component) banana hota hai , this is a rule-->reason for this is that jiss class ko autowire kar rhe ho , uss class ka bhi object banna chahiye , tabhi hi uske member varibles ko b object bana skte hai

  public void addAddition(){
//    Addition maths=new Addition();
    maths.add();
  }
}
