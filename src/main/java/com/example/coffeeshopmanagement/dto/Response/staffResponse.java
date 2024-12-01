package com.example.coffeeshopmanagement.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class staffResponse {
    private int id;
    private String staffName;
    private String position;
    private double salary;
    private String phone;
}
