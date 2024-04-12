package com.fiafeng.security.service;

import com.fiafeng.common.pojo.Interface.IBaseUserInfo;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;

public interface IUserDetails extends IBaseUserInfo, UserDetails, Serializable {

}
