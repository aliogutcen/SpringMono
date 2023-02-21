package com.ogutcenali.SpringMono.mvccontroller;

import com.ogutcenali.SpringMono.dto.request.UrunSaveRequestDto;
import com.ogutcenali.SpringMono.dto.request.UrunUpdateRequestDto;
import com.ogutcenali.SpringMono.mvccontroller.models.UrunIndexModel;
import com.ogutcenali.SpringMono.service.UrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

import static com.ogutcenali.SpringMono.constant.EndPoints.*;

@Controller
@RequestMapping(URUN_MVC)
@RequiredArgsConstructor
public class UrunMvcController {
    private final UrunService urunService;

    @GetMapping(INDEX)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("urun");
        UrunIndexModel model = new UrunIndexModel();
        model.setTitle("Ürün İşlemleri");
        model.setMenu(Arrays.asList("Ürün Ekleme", "Ürün Listesi", "Firma Ekleme", "Stok Listesi"));
        model.setUrunList(urunService.findAll());
        modelAndView.addObject("model", model);
        return modelAndView;
    }

    @PostMapping(SAVE)
    public ModelAndView save(UrunSaveRequestDto dto) {

            urunService.save(dto);
            return new ModelAndView("redirect:index");


    }

    @PostMapping(DELETE)
    public ModelAndView delete(Long id) {
        System.out.println("Silme işlemi çalıştır silinen id.."+id);
        urunService.deleteById(id);
        return new ModelAndView("redirect:index");
    }

    @PostMapping(UPDATE)
    public ModelAndView update(UrunUpdateRequestDto dto){
        urunService.update(dto);
        return new ModelAndView("redirect:index");
    }

}

