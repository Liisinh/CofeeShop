package com.example.coffeeshopmanagement.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class staffResquest {
    private String staffName;
    private String position;
    private double salary;
    private String phone;

}
