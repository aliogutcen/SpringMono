package com.ogutcenali.SpringMono.service;

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
}
