package com.ogutcenali.SpringMono.controller;

import com.ogutcenali.SpringMono.dto.request.LoginRequestDto;
import com.ogutcenali.SpringMono.dto.request.RegisterRequestDto;
import com.ogutcenali.SpringMono.repository.entity.User;
import com.ogutcenali.SpringMono.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static  com.ogutcenali.SpringMono.constant.EndPoints.*;

@RestController
@RequestMapping(USER)
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    public ResponseEntity<String> register(RegisterRequestDto dto){
        return ResponseEntity.ok("Ok");
    }

    public ResponseEntity<Boolean> doLogin (LoginRequestDto dto){
        return ResponseEntity.ok(true);
    }


    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }



}
