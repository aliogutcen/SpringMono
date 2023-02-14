package com.ogutcenali.SpringMono.controller;


import com.ogutcenali.SpringMono.repository.entity.Urun;
import com.ogutcenali.SpringMono.service.UrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.ogutcenali.SpringMono.constant.EndPoints.*;
@RestController
@RequestMapping(URUN)
@RequiredArgsConstructor
public class UrunController {


    private final UrunService urunService;


    @GetMapping(FINDALL)
    public ResponseEntity<List<Urun>> findAll()
    {
        return ResponseEntity.ok(urunService.findAll());
    }


}
