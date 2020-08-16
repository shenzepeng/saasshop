package com.learning.saasshop.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 手机
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否是vip 0普通用户1vip
     */
    @Column(name = "is_vip")
    private Short isVip;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 身份证号
     */
    @Column(name = "id_number")
    private String idNumber;

    /**
     * 汉语名
     */
    @Column(name = "chinese_name")
    private String chineseName;

    /**
     * 头像
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 真人脸
     */
    @Column(name = "face_url")
    private String faceUrl;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 商户id
     */
    private Long pid;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取手机
     *
     * @return phone_number - 手机
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置手机
     *
     * @param phoneNumber 手机
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取是否是vip 0普通用户1vip
     *
     * @return is_vip - 是否是vip 0普通用户1vip
     */
    public Short getIsVip() {
        return isVip;
    }

    /**
     * 设置是否是vip 0普通用户1vip
     *
     * @param isVip 是否是vip 0普通用户1vip
     */
    public void setIsVip(Short isVip) {
        this.isVip = isVip;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取身份证号
     *
     * @return id_number - 身份证号
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置身份证号
     *
     * @param idNumber 身份证号
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * 获取汉语名
     *
     * @return chinese_name - 汉语名
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * 设置汉语名
     *
     * @param chineseName 汉语名
     */
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
    }

    /**
     * 获取头像
     *
     * @return img_url - 头像
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置头像
     *
     * @param imgUrl 头像
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * 获取真人脸
     *
     * @return face_url - 真人脸
     */
    public String getFaceUrl() {
        return faceUrl;
    }

    /**
     * 设置真人脸
     *
     * @param faceUrl 真人脸
     */
    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl == null ? null : faceUrl.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取商户id
     *
     * @return pid - 商户id
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 设置商户id
     *
     * @param pid 商户id
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }
}