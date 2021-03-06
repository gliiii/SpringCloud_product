package com.imooc.product.service;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.common.ProductInfoOutput;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.dto.CartDTO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Component
public class ProductServiceTest extends ProductApplicationTests {
    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size()> 0);
    }

    @Test
    public void findList() {
        List<ProductInfoOutput> list = productService.findList(Arrays.asList("157875196366160022", "157875227953464068"));
        Assert.assertTrue(list.size()> 0);
    }

    @Test
    public void decreaseStock() {
        DecreaseStockInput decreaseStockInput = new DecreaseStockInput("157875196366160022",2);
        productService.decreaseStock(Arrays.asList(decreaseStockInput));
    }
}