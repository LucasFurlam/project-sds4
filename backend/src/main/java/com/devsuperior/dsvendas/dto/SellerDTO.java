package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SellerDTO implements Serializable {
    private Long id;
    private String name;

    public SellerDTO(Seller entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
