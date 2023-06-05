package com.project.springangular.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDTO {

    private Long id;
    private  String name;
    private String address;
    private  int mobile;
}
