package com.arturfrimu.product.dto.command;

import com.arturfrimu.product.dto.request.CreateProductRequest;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public final class CreateProductCommand {
    private final String name;
    private final String description;
    private final BigDecimal price;
    private final Long categoryId;

    public CreateProductCommand(String name, String description, BigDecimal price, Long categoryId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
    }

    public static CreateProductCommand valueOf(CreateProductRequest createProductRequest) {
        return new CreateProductCommand(
                createProductRequest.getName(),
                createProductRequest.getDescription(),
                createProductRequest.getPrice(),
                createProductRequest.getCategoryId()
        );
    }
}
