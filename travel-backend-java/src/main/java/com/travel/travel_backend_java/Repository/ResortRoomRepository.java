package com.travel.travel_backend_java.Repository;

import com.travel.travel_backend_java.Model.ResortRoom;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResortRoomRepository extends MongoRepository<ResortRoom, String> {
}
