package com.sgt.mediumoverflow.web;


import com.sgt.mediumoverflow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserResource {
  @Autowired
  private UserService userService;
  @GetMapping("/profile")
  public Map<String,Object> getUser(){
    return userService.getUser();
  }
}
