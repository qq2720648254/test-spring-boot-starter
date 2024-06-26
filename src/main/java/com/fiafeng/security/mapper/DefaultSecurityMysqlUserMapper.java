package com.fiafeng.security.mapper;


import com.fiafeng.common.annotation.BeanDefinitionOrderAnnotation;
import com.fiafeng.common.constant.ModelConstant;
import com.fiafeng.common.mapper.Interface.IUserMapper;
import com.fiafeng.common.mapper.mysql.BaseMysqlMapper;
import com.fiafeng.common.pojo.Interface.IBaseUser;
import com.fiafeng.common.properties.mysql.FiafengMysqlUserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@BeanDefinitionOrderAnnotation(value = ModelConstant.fourthOrdered)
public class DefaultSecurityMysqlUserMapper extends BaseMysqlMapper implements IUserMapper {


    @Autowired
    FiafengMysqlUserProperties userProperties;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public boolean insertUser(IBaseUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        return insertObject(user);
    }

    @Override
    public boolean updateUser(IBaseUser user) {
        if (!user.getPassword().isEmpty()) {
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        }
        return updateObject(user);
    }

    @Override
    public boolean deletedUserByUserId(Long userId) {
        return deletedObjectById(userId);
    }

    @Override
    public <T extends IBaseUser> List<T> selectUserListAll() {
        List<IBaseUser> objectList = selectObjectListAll();
        return (List<T>) objectList;
    }

    @Override
    public <T extends IBaseUser> T selectUserByUserName(String userName) {
        IBaseUser baseUser = selectObjectByObjectName(userName, getTableColName());
        return (T) baseUser;
    }

    @Override
    public <T extends IBaseUser> T selectUserByUserId(Long userId) {

        IBaseUser baseUser = selectObjectByObjectId(userId);
        return (T) baseUser;
    }
}
