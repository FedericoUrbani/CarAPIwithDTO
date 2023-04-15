package com.carDTO.CarAPIwithDTO.utils;

import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.matcher.StringMatcher;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MapperConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
