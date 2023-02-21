package com.ogutcenali.SpringMono.controller;

import com.ogutcenali.SpringMono.dto.request.LoginRequestDto;
import com.ogutcenali.SpringMono.dto.request.RegisterRequestDto;
import com.ogutcenali.SpringMono.dto.response.UserControllerFindAllResponseDto;
import com.ogutcenali.SpringMono.exception.ErrorType;
import com.ogutcenali.SpringMono.exception.SpringMonoException;
import com.ogutcenali.SpringMono.repository.entity.User;
import com.ogutcenali.SpringMono.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static  com.ogutcenali.SpringMono.constant.EndPoints.*;

@RestController
@RequestMapping(USER)
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping(REGISTER)
    public ResponseEntity<Boolean> register(RegisterRequestDto dto){
       userService.register(dto);

        return ResponseEntity.ok(userService.register(dto));
    }

    public ResponseEntity<Boolean> doLogin (LoginRequestDto dto){
        return ResponseEntity.ok(true);
    }


    @GetMapping(FINDALL)
    public ResponseEntity<List<UserControllerFindAllResponseDto>> findAll(){
        return ResponseEntity.ok(userService.findAllResponseDtoList());
    }

    @GetMapping("/findbyid")
    public ResponseEntity<User> findById(Long id){
     Optional<User> user= userService.findById(id);
    if(user.isEmpty())throw  new SpringMonoException(ErrorType.KULLANICI_BULUNAMADI);
     return ResponseEntity.ok( user.get());


    }

}
