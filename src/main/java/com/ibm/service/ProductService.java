package com.ibm.service;

import com.ibm.bean.Product;

import java.util.List;

/**
 * @author dva
 * @create 2019-03-20 16:48
 */
public interface ProductService {

    int getMaxId();

    Product getProdById(int id);
}
