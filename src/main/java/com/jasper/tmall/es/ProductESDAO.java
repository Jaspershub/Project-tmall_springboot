package com.jasper.tmall.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.jasper.tmall.pojo.Product;

public interface ProductESDAO extends ElasticsearchRepository<Product,Integer>{

}


