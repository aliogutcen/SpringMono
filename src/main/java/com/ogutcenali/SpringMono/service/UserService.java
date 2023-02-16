package com.ogutcenali.SpringMono.service;

import com.ogutcenali.SpringMono.dto.request.LoginRequestDto;
import com.ogutcenali.SpringMono.dto.request.RegisterRequestDto;
import com.ogutcenali.SpringMono.dto.response.UserControllerFindAllResponseDto;
import com.ogutcenali.SpringMono.mapper.IUserMapper;
import com.ogutcenali.SpringMono.repository.IUserRepository;
import com.ogutcenali.SpringMono.repository.entity.User;
import com.ogutcenali.SpringMono.utility.ServiceManager;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService extends ServiceManager<User, Long> {

    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    public Boolean register(RegisterRequestDto dto) {
        User user = User.builder()
                .password(dto.getPassword())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build();
        save(user);
        return true;
    }

    public Boolean registerMapper(RegisterRequestDto dto) {
        save(IUserMapper.INSTANCE.toUser(dto));
        return true;
    }

    public List<UserControllerFindAllResponseDto> findAllResponseDtoList() {
        List<UserControllerFindAllResponseDto> result = new ArrayList<>();

        findAll().forEach(x -> {
            result.add(IUserMapper.INSTANCE.userControllerFindAllResponseDtoFromUser(x));
        });
        return result;
    }

    public Boolean existsUsersByUsername(String username)
    {
        return userRepository.existsUsersByUsername(username);
    }


    public Optional<User> findOptionalByUsernameAndPassword(LoginRequestDto dto){
     return   userRepository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());
    }


}
