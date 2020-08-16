package com.learning.saasshop;


import com.learning.saasshop.mapper.ShopMapper;
import com.learning.saasshop.mapper.UserMapper;
import com.learning.saasshop.pojo.Shop;
import com.learning.saasshop.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaasshopApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
        List<User> userList=userMapper.selectAll();
        System.out.println(userList);
    }

    @Autowired
    private ShopMapper shopMapper;

    @Test
    public void shopTest(){
        Shop shop=new Shop();
        shop.setId(3L);
        shop.setBusinessLicense("asdasd");
        shopMapper.updateByPrimaryKeySelective(shop);
    }

}
