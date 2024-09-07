package com.travel.travel_backend_java.Service;

import com.travel.travel_backend_java.DTO.ResortDTO;
import com.travel.travel_backend_java.Model.Resort;
import com.travel.travel_backend_java.Model.ResortRoom;
import com.travel.travel_backend_java.Repository.ResortRepository;
import com.travel.travel_backend_java.Repository.ResortRoomRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public ResortDTO convertToDTO(Resort resort){
        ResortDTO resortDTO = new ResortDTO();
        resortDTO.setName(resort.getName());
        resortDTO.setCity(resort.getCity());
        resortDTO.setAddress(resort.getAddress());
        resortDTO.setDescription(resort.getDescription());
        resortDTO.setWifi(resort.isWifi());
        resortDTO.setParking(resort.isParking());
        resortDTO.setElevator(resort.isElevator());
        resortDTO.setRestaurant(resort.isRestaurant());
        resortDTO.setGym(resort.isGym());
        resortDTO.setGarden(resort.isGarden());
        resortDTO.setStatus(resort.getStatus());

        resortDTO.setCreatedAt(resort.getCreatedAt());
        resortDTO.setMealPricePerNight(resort.getMealPricePerNight());
        resortDTO.setMealPricePerPerson(resort.getMealPricePerPerson());
        resortDTO.setNumberOfPool(resort.getNumberOfPool());
        resortDTO.setNumberOfRoom(resort.getNumberOfRoom());
        resortDTO.setPetPolicy(resort.isPetPolicy());
        resortDTO.setSmokingPolicy(resort.isSmokingPolicy());

        List<ResortRoom> rooms = new ArrayList<>();

        for (String roomId : resort.getRooms()){
            ResortRoom room = resortRoomRepository.findById(roomId).orElse(null);
            rooms.add(room);
        }

        resortDTO.setRooms(rooms);
        return resortDTO;
    }

    public Resort convertToEntity(ResortDTO resortDTO){
        Resort resort = new Resort();
        resort.setName(resortDTO.getName());
        resort.setCity(resortDTO.getCity());
        resort.setAddress(resortDTO.getAddress());
        resort.setDescription(resortDTO.getDescription());
        resort.setWifi(resortDTO.isWifi());
        resort.setParking(resortDTO.isParking());
        resort.setElevator(resortDTO.isElevator());
        resort.setRestaurant(resortDTO.isRestaurant());
        resort.setGym(resortDTO.isGym());
        resort.setGarden(resortDTO.isGarden());
        resort.setStatus(resortDTO.getStatus());

        resort.setCreatedAt(resortDTO.getCreatedAt());
        resort.setMealPricePerNight(resortDTO.getMealPricePerNight());
        resort.setMealPricePerPerson(resortDTO.getMealPricePerPerson());
        resort.setNumberOfPool(resortDTO.getNumberOfPool());
        resort.setNumberOfRoom(resortDTO.getNumberOfRoom());
        resort.setPetPolicy(resortDTO.isPetPolicy());
        resort.setSmokingPolicy(resortDTO.isSmokingPolicy());

        String [] rooms = new String[resortDTO.getRooms().size()];

        for (int i = 0; i < resortDTO.getRooms().size(); i++){
            ResortRoom room = resortDTO.getRooms().get(i);
            rooms[i] = room.getId();
        }

        resort.setRooms(rooms);
        return resort;
    }

    public List<ResortDTO> getAll(){
        List<Resort> resorts = resortRepository.findAll();

        return resorts.stream().map(this::convertToDTO).toList();
    }




}
