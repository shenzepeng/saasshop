package com.learning.saasshop.service;

import com.learning.saasshop.request.AddShopRequest;
import com.learning.saasshop.request.LoginRequest;
import com.learning.saasshop.request.UpdateShopRequest;
import com.learning.saasshop.response.IntegerResultResponse;
import com.learning.saasshop.response.ShopLoginResponse;

public interface ShopService {
    IntegerResultResponse addShop(AddShopRequest request);
    IntegerResultResponse updateShop(UpdateShopRequest request);
    ShopLoginResponse login(LoginRequest request);
}
