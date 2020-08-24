package com.freshprints.project.controller;

import com.freshprints.project.implementation.ImplementationInterface;
import com.freshprints.project.pojo.UserPojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class FreshPrintsController {
    @Autowired
    ImplementationInterface implementationInterface;
    @PostMapping(path="/create_user")
    public void createUser(@RequestBody UserPojo user)
    {
        try {
             boolean isUserCreated = implementationInterface.addUser(user);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @GetMapping(path="/validate_user")
    public void validateUser(@RequestBody Long id)
    {
        try{
            boolean isUserExist = implementationInterface.existUser(id);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @GetMapping(path="/order_information")
    public void getOrderInformation(@RequestBody Long id)
    {
        try{
            String info = implementationInterface.getOrderInfo(id);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
