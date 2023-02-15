package com.ogutcenali.SpringMono.service;

import com.ogutcenali.SpringMono.dto.request.RegisterRequestDto;
import com.ogutcenali.SpringMono.repository.IUserRepository;
import com.ogutcenali.SpringMono.repository.entity.User;
import com.ogutcenali.SpringMono.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceManager<User,Long> {

    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository){
        super(userRepository);
        this.userRepository=userRepository;
    }


    public Boolean  register(RegisterRequestDto dto){
   User user=     User.builder().password(dto.getPassword()).username(dto.getUsername()).email(dto.getEmail()).build();
        save(user);
        return true;
    }
}
