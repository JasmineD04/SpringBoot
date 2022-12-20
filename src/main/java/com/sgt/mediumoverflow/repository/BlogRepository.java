package com.sgt.mediumoverflow.repository;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BlogRepository {
  public List<Map<String,Object>> getBlogs(){
    Map<String,Object> map1=Map.of("Title","test","Content","detailContent");
    List<Map<String,Object>> toReturn = List.of(map1);

    return toReturn;
  }

}
