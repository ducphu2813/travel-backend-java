package com.travel.travel_backend_java.Repository;

import com.travel.travel_backend_java.Model.Resort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResortRepository extends MongoRepository<Resort, String> {
}
