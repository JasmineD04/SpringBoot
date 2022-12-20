package com.sgt.mediumoverflow.service;


import com.sgt.mediumoverflow.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BlogService {
  @Autowired
  private BlogRepository blogRepository;
 public List<Map<String,Object>> getBlogs(){

    return blogRepository.getBlogs();
  }

}
