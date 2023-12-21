package com.krauze.hibernateDemo.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "clients")
@Data
public class Client extends User {
    @Column(name = "email")
    private String email;

//    @Enumerated(EnumType.STRING)
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "user_roles",
//            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
//    List<Role> roles;
}
