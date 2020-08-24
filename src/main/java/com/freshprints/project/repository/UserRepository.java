package com.freshprints.project.repository;

import com.freshprints.project.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    Long addUser(UserEntity user);
    UserEntity getUserById(Long id);
    String getOrderInfo(Long id);

}
