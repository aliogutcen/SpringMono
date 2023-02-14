package com.ogutcenali.SpringMono.controller;

import com.ogutcenali.SpringMono.repository.IMusteriRepository;
import com.ogutcenali.SpringMono.repository.entity.Musteri;
import com.ogutcenali.SpringMono.service.MusteriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

/*
    RequestMapping nedir?
        Uygulamamız ayağa kalktığından itibaren bir ip ve port üzerinde yayın yapar.
        localhost:80 -> localhost

        Uygulamanızın alt kırılımlarına yön vermek ve belli classlara yönlendirme yapmak için
        Mapping yaparız. bunun için @RequestMapping  anatasyonu kullanırız.

        https:/localhost/musteri => @RequestMapping("/musteri") ; demektir.
 */
@RequestMapping("/musteri")
public class MusteriController {
    @Autowired
    MusteriService musteriService;


    /*
     https://localhost/musteri/save = > @GetMapping("/save")

     GetMapping nedir ?
        Bir sayfaya erişme ve ondan bilgi alma isteğidir. özel bir gereksinimi yoktur
        browserların tümü get isteği gönderir.
     */

    @GetMapping("/save")
    public void save(String ad, String adres, String telefon) {
        Musteri musteri = Musteri.builder().ad(ad).adres(adres).telefon(telefon).build();

        musteriService.save(musteri);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Musteri>> findAll() {
        return ResponseEntity.ok(musteriService.findAll());
    }

    @GetMapping("findbyad")
    public ResponseEntity<List<Musteri>> findByAd(String ad, String adres) {
        if (adres == null) {
            return ResponseEntity.ok(musteriService.findByAd(ad));
        }
        return ResponseEntity.ok(musteriService.findByAdAndAdres(ad, adres));
    }


    /**
     *  select * from tblmusteri where ad like '%ad' - 'a%'
     */



}
