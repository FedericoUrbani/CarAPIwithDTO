package com.carDTO.CarAPIwithDTO.DTO;

import jakarta.validation.constraints.NotBlank;

public class CarDTO {

    @NotBlank(message = "id can't be blank")
    private String id;
    @NotBlank(message = "model name can't be blank")
    private String modelName;
    private double price;

    public String getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
