package com.ogutcenali.SpringMono.mvccontroller;

import com.ogutcenali.SpringMono.dto.request.LoginRequestDto;
import com.ogutcenali.SpringMono.dto.request.RegisterRequestDto;
import com.ogutcenali.SpringMono.repository.entity.User;
import com.ogutcenali.SpringMono.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

import static com.ogutcenali.SpringMono.constant.EndPoints.*;


@Controller
@RequestMapping(USER_MVC)
@RequiredArgsConstructor
public class UserMvcController {

    private final UserService userService;


    @GetMapping(LOGIN)
    public ModelAndView login() {
        ModelAndView model = new ModelAndView();
        model.setViewName("login");
        model.addObject("title","Giriş sayfasi");
        return model;
    }

    @GetMapping(REGISTER)
    public ModelAndView register() {
        ModelAndView model = new ModelAndView();
        model.setViewName("register");
        model.addObject("title","Kayıt Sayfası");
        model.addObject("error","");
        return model;
    }

    @PostMapping(REGISTER)
    public ModelAndView register(RegisterRequestDto dto) {
    ModelAndView model = new ModelAndView();
    if(userService.existsUsersByUsername(dto.getUsername())){
        model.setViewName("register");
        model.addObject("error",dto.getUsername()+" kullanıcı adı daha önce " +
                "başkası tarafından alınmıştır.!");
    }else{
        userService.register(dto);
        return new ModelAndView("redirect:login");
    }
    return model;
        }


    @PostMapping(LOGIN)
    public ModelAndView login(LoginRequestDto dto) {
        ModelAndView model =  new ModelAndView();
        Optional<User> user = userService.findOptionalByUsernameAndPassword(dto);
        if(user.isEmpty()){


            model.setViewName("login");
            model.addObject("error","kullanici adi ya da şifre hatalidir!!");
            return model;

        }else{
            return new ModelAndView("index");
        }


    }
}






