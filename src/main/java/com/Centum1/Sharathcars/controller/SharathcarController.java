package com.Centum1.Sharathcars.controller;

import com.Centum1.Sharathcars.dto.SharathcarRequest;
import com.Centum1.Sharathcars.entity.Sharathcar;
import com.Centum1.Sharathcars.exception.UserNotfoundException;
import com.Centum1.Sharathcars.service.SharathcarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sharathcars")
public class SharathcarController {
    @Autowired
    private SharathcarService service;

    @PostMapping("/signup")
    public ResponseEntity<Sharathcar> saveUsers(@RequestBody @Valid SharathcarRequest request){

        return new ResponseEntity<>(service.saveUsers(request), HttpStatus.CREATED);
    }
    @GetMapping("/fetchall")
    public ResponseEntity<List<Sharathcar>>getallcars(){

        return ResponseEntity.ok(service.getCars());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Sharathcar>getcarbyID(@PathVariable int id)throws UserNotfoundException {

        return ResponseEntity.ok(service.getCar(id));
    }
}
