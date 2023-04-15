package com.carDTO.CarAPIwithDTO.converter;

import com.carDTO.CarAPIwithDTO.DTO.CarDTO;
import com.carDTO.CarAPIwithDTO.model.Car;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarDTOConverter {

    @Autowired
    private ModelMapper modelMapper;

    public CarDTO convertCartoCarDTO(Car car){
        CarDTO carDTO= modelMapper.map(car,CarDTO.class);
        return carDTO;
    }

    public Car convertCarDTOtoCar(CarDTO carDTO){
        Car car= modelMapper.map(carDTO,Car.class);

        return car;
    }
}
