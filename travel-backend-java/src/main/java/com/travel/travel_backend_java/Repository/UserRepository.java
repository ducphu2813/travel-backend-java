package com.travel.travel_backend_java.Repository;


import com.travel.travel_backend_java.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    List<User> findByUsernameContainingIgnoreCase(String userName);

    Optional<User> findByUsername(String email);
}
