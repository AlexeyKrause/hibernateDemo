package com.krauze.hibernateDemo.dto;


import com.krauze.hibernateDemo.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdminDtoRequest extends UserDtoRequest{
    String position;
    List<Role> roles;
}
