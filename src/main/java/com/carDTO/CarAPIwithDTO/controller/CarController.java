package com.carDTO.CarAPIwithDTO.controller;

import com.carDTO.CarAPIwithDTO.DTO.CarDTO;
import com.carDTO.CarAPIwithDTO.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping()
        private CarDTO getCar(){
        return carService.getCar();
        }

}
