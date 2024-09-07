package com.travel.travel_backend_java.Service;

import com.travel.travel_backend_java.DTO.ResortDTO;
import com.travel.travel_backend_java.Model.Resort;
import com.travel.travel_backend_java.Repository.ResortRepository;
import com.travel.travel_backend_java.Repository.ResortRoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResortService {

    private final ResortRepository resortRepository;
    private final ResortRoomRepository resortRoomRepository;


    public ResortService(
            ResortRepository resortRepository,
            ResortRoomRepository resortRoomRepository){
        this.resortRepository = resortRepository;
        this.resortRoomRepository = resortRoomRepository;
    }

//    public List<ResortDTO> getAllResorts(){
//
//    }
//
//    public ResortDTO convertToDTO(Resort resort) {
//        List<>
//
//    }

}
