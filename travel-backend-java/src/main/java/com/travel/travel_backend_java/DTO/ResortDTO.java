package com.travel.travel_backend_java.DTO;

import com.travel.travel_backend_java.Model.ResortRoom;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResortDTO {

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
    private List<ResortRoom> rooms;
    private LocalDateTime createdAt;
    private Long mealPricePerNight;
    private Long mealPricePerPerson;
    private Integer numberOfPool;
    private Integer numberOfRoom;
    private boolean petPolicy;
    private boolean smokingPolicy;

}
