package com.krauze.hibernateDemo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class UserDtoRequest {
    Long id;
    String userName;
    String firstName;
    String lastName;
    String password;
}
