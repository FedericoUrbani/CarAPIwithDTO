package com.carDTO.CarAPIwithDTO.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

    @NotBlank(message = "id can't be blank")
    private String id;
    @NotBlank(message = "model name can't be blank")
    private String modelName;
    private double price;
}
