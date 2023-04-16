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

    @GetMapping("/getcar")
        private CarDTO getCar(){
        return carService.getCar();

        }
        @PostMapping("/postcar")
        private String postCar(@RequestParam(required = true, value = "id") String id,
                               @RequestParam(required = true, value = "modelname") String modelname,
                               @RequestParam(required = false, value = "price") double price){

        return carService.postCar(id,modelname,price);
        }
}
