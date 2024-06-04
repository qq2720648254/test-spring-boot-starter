package com.fiafeng.common.pojo.Vo;


import com.fiafeng.common.annotation.BeanDefinitionOrderAnnotation;
import com.fiafeng.common.annotation.PojoAnnotation;
import com.fiafeng.common.constant.ModelConstant;
import com.fiafeng.common.pojo.Interface.IBaseUser;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@BeanDefinitionOrderAnnotation(value = ModelConstant.defaultOrder)
@PojoAnnotation
public class DefaultUserInfoVo implements IBaseUserInfo {


    /**
     * 用户唯一标识
     */
    private String uuid;


    /**
     * 登录时间
     */
    private Long loginTime;


    /**
     * 过期时间
     */
    private Long expireTime;


    /**
     * 用户信息
     */
    private IBaseUser user;

    /**
     * 用户权限列表
     */
    private List<String> permissionList;

    /**
     * 用户角色列表
     */
    private List<String> roleList;

}
