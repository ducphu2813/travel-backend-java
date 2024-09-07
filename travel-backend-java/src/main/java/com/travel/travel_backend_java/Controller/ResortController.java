package com.travel.travel_backend_java.Controller;

import com.travel.travel_backend_java.DTO.ResortDTO;
import com.travel.travel_backend_java.Service.ResortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/resort")
public class ResortController {

    ResortService resortService;

    public ResortController(ResortService resortService){
        this.resortService = resortService;
    }

    @GetMapping
    public List<ResortDTO> getAll(){
        return resortService.getAll();
    }
}
