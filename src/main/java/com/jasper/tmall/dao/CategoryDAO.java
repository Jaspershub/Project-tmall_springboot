package com.jasper.tmall.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.jasper.tmall.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}


