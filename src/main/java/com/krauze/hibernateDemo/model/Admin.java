package com.krauze.hibernateDemo.model;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "admins")
@Data
public class Admin extends User{
    @Column(name = "position")
    private String position;

//    @Enumerated(EnumType.STRING)
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "user_roles",
//            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
//    List<Role> roles;
}
