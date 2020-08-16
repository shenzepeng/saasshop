package com.learning.saasshop.service.impl;

import com.learning.saasshop.dao.ShopDao;
import com.learning.saasshop.pojo.Shop;
import com.learning.saasshop.request.AddShopRequest;
import com.learning.saasshop.request.LoginRequest;
import com.learning.saasshop.request.UpdateShopRequest;
import com.learning.saasshop.response.IntegerResultResponse;
import com.learning.saasshop.response.ShopLoginResponse;
import com.learning.saasshop.service.ShopService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;
    @Override
    public IntegerResultResponse addShop(AddShopRequest request) {
        Shop shop=new Shop();
        BeanUtils.copyProperties(request,shop);
        int result=shopDao.addShop(shop);
        IntegerResultResponse resultResponse=new IntegerResultResponse();
        resultResponse.setResult(result);
        return resultResponse;
    }

    @Override
    public IntegerResultResponse updateShop(UpdateShopRequest request) {
        Shop shop=new Shop();
        BeanUtils.copyProperties(request,shop);
        int result=shopDao.update(shop);
        IntegerResultResponse resultResponse=new IntegerResultResponse();
        resultResponse.setResult(result);
        return resultResponse;
    }

    @Override
    public ShopLoginResponse login(LoginRequest request) {
        List<Shop> shops=shopDao.login(request.getPhoneNumber());
        if (!CollectionUtils.isEmpty(shops)){
            //判断账号密码是否正确
            if (shops.get(0).getPassword().equals(request.getPassWord())){
                ShopLoginResponse shopLoginResponse=new ShopLoginResponse();
                BeanUtils.copyProperties(shops.get(0),shopLoginResponse);
                return shopLoginResponse;
            }
            throw new RuntimeException("密码不正确");
        }
        throw new RuntimeException("账号不正确");
    }


}
