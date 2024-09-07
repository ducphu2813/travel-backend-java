package com.travel.travel_backend_java.Model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Document(collection = "resort")
public class Resort {

    private String name;
    private String city;
    private String address;
    private String description;
    private boolean wifi;
    private boolean parking;
    private boolean elevator;
    private boolean restaurant;
    private boolean gym;
    private boolean garden;
    private String status;
    private String[] rooms;
    private LocalDateTime createdAt;
    private Long mealPricePerNight;
    private Long mealPricePerPerson;
    private Integer numberOfPool;
    private Integer numberOfRoom;
    private boolean petPolicy;
    private boolean smokingPolicy;
}
