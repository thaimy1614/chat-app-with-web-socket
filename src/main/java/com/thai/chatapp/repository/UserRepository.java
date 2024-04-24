package com.thai.chatapp.repository;

import com.thai.chatapp.models.user.Status;
import com.thai.chatapp.models.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    List<User> findAllByStatus(Status status);
}
