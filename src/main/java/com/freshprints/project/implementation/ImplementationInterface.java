package com.freshprints.project.implementation;

import com.freshprints.project.pojo.UserPojo;

public interface ImplementationInterface {
    Boolean addUser(UserPojo user);
    Boolean existUser(Long id);
    String getOrderInfo(Long id);
}
