package com.learning.saasshop.controller;

import com.learning.saasshop.common.SzpJsonResult;
import com.learning.saasshop.request.AddShopRequest;
import com.learning.saasshop.request.LoginRequest;
import com.learning.saasshop.request.UpdateShopRequest;
import com.learning.saasshop.response.IntegerResultResponse;
import com.learning.saasshop.response.ShopLoginResponse;
import com.learning.saasshop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("shop")
public class ShopController {
    @Autowired
    private ShopService shopService;
    @PutMapping("updateShop")
    public SzpJsonResult<IntegerResultResponse> updateShop(@RequestBody UpdateShopRequest updateShopRequest){
        return SzpJsonResult.ok(shopService.updateShop(updateShopRequest));
    }
    @PostMapping("addShop")
    public SzpJsonResult<IntegerResultResponse> addShop(@RequestBody AddShopRequest addShopRequest){
        return SzpJsonResult.ok(shopService.addShop(addShopRequest));
    }
    @PostMapping("login")
    public SzpJsonResult<ShopLoginResponse> login(@RequestBody LoginRequest request){
        return SzpJsonResult.ok(shopService.login(request));
    }
}
