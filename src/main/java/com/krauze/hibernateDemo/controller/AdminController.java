package com.krauze.hibernateDemo.controller;


import com.krauze.hibernateDemo.dao.AdminDao;
import com.krauze.hibernateDemo.model.Admin;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("app/admins/")
@RequiredArgsConstructor
public class AdminController {
    private final AdminDao adminDao;


    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Admin> getAdmin(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity<>(adminDao.findById(id).orElseThrow(), HttpStatus.OK);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Admin postAdmin(@RequestBody Admin admin) {
        return adminDao.save(admin);
    }
}
