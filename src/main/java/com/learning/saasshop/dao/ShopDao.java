package com.learning.saasshop.dao;

import com.learning.saasshop.mapper.ShopMapper;
import com.learning.saasshop.pojo.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Repository
public class ShopDao {
    @Autowired
    private ShopMapper shopMapper;

    public Integer addShop(Shop shop){
        return shopMapper.insert(shop);
    }


    public List<Shop> login(String phoneNumber){
        Example example=new Example(Shop.class);
        example.createCriteria()
                .andEqualTo("phoneNumber",phoneNumber);
        return shopMapper.selectByExample(example);
    }

    public Integer update(Shop shop){
        return shopMapper.updateByPrimaryKeySelective(shop);
    }
}
