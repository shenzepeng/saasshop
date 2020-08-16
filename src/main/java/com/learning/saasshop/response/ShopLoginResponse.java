package com.learning.saasshop.response;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class ShopLoginResponse {
    private Long id;


    private String shopName;


    private String phoneNumber;

    private String password;

    /**
     * 营业执照
     */

    private String businessLicense;

    /**
     * 状态 0待认证 1已认证 2被关闭  3已过期
     */
    private Short status;

    /**
     * 0未购买  1标准版 2vip版 3钻石版
     */
    private Short level;

    private String address;


    private Date createTime;


    private Date updateTime;
}
