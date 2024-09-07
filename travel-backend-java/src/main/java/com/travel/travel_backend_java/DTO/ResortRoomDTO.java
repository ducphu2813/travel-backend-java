package com.travel.travel_backend_java.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResortRoomDTO {

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
