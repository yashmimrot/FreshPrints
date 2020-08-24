package com.freshprints.project.implementation;

import com.freshprints.project.entity.UserEntity;
import com.freshprints.project.pojo.UserPojo;
import com.freshprints.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class ImplementationClass implements ImplementationInterface{

    @Autowired
    UserRepository userRepository;

    @Override
    public Boolean addUser(UserPojo user) {
        UserEntity userEntity = new UserEntity();
        userEntity.contact = user.contactNo;
        userEntity.userName = user.userName;
        userEntity.emailId = user.emailId;
        userEntity.fullName = user.fullName;
        userEntity.password = user.password;

        userRepository.addUser(userEntity);

        return TRUE;


    }

    @Override
    public Boolean existUser(Long id) {
        if(userRepository.getUserById(id)!=null)
            return TRUE;
        return FALSE;
    }

    @Override
    public String getOrderInfo(Long id) {
        return userRepository.getOrderInfo(id);
    }

}
