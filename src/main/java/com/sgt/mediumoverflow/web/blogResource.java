package com.sgt.mediumoverflow.web;
import java.util.*;


import com.sgt.mediumoverflow.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class blogResource {
  @Autowired
  private BlogService blogService;

  @GetMapping("/blogs")
  public List<Map<String, Object>> getBlogs() {


    return blogService.getBlogs();
    // return toReturn;
  }

}
