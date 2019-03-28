package com.ibm.service.impl;

import com.ibm.bean.Product;
import com.ibm.mapper.ProductMapper;
import com.ibm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dva
 * @create 2019-03-20 16:52
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper pm;

    @Override
    public int getMaxId() {

        return pm.findTotalCount();
    }

    @Override
    public Product getProdById(int id) {

        return pm.findProdById(id);
    }


}
