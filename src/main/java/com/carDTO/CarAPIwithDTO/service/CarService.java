package com.carDTO.CarAPIwithDTO.service;

import com.carDTO.CarAPIwithDTO.DTO.CarDTO;
import com.carDTO.CarAPIwithDTO.converter.CarDTOConverter;
import com.carDTO.CarAPIwithDTO.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
@Autowired
    CarDTOConverter carDTOConverter;
    public CarDTO getCar(){
        Car car= new Car();
        car.setId("1");
        car.setModelName("Lamborghini");
        car.setPrice(200000.00);

        CarDTO carDTO =carDTOConverter.convertCartoCarDTO(car);
    return carDTO;
    }

    public String postCar(String id, String modelname, double price) {
        Car car= new Car(id,modelname,price);
        System.out.println(car);
        return "car object has been created";
    }
}
