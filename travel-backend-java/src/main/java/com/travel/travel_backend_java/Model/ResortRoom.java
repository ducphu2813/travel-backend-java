package com.travel.travel_backend_java.Model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "resort_room")
public class ResortRoom {

    @Id
    private String id;
    private String roomName;
    private Integer roomNumber;
    private String roomType;
    private Integer singleBeds;
    private Integer doubleBeds;
    private Integer maxAdult;
    private Integer maxChildren;
    private Integer numberOfBathroom;
    private String view;
    private Integer size;
    private boolean heating;
    private boolean tv;
    private boolean wifi;
    private boolean airConditioning;
    private boolean smokingPolicy;
    private Integer floor;
    private Long pricePerNight;
    private String status;
    private LocalDateTime createdAt;
}
