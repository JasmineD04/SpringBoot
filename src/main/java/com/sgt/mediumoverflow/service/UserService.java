package com.sgt.mediumoverflow.service;


import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
  public Map<String,Object> getUser(){
    Map<String,Object> userMap=Map.of("firstName","Jasmine","LastName","Dhirwani","UserName","Jas");
    return userMap;
  }


}

