package com.ogutcenali.SpringMono.service;

import com.ogutcenali.SpringMono.repository.IMusteriRepository;
import com.ogutcenali.SpringMono.repository.entity.Musteri;
import com.ogutcenali.SpringMono.utility.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusteriService  extends ServiceManager<Musteri,Long> {

    /**
     * Repostiroy'nin enjekte edilme yöntemleri
     * <p>
     * 1-)Field Injection ->
     * Autowired anatasyonu ile yapılıyor.
     *
     * @Autowired private IMusteriRepository repository;

     * /*
     * 2-) Doğru olan Const. Injection
     */

    private final IMusteriRepository repository;
    public MusteriService(IMusteriRepository repository) {
        super(repository);
        this.repository=repository;
    }



    public List<Musteri> findByAd(String ad) {
        return repository.findByAd(ad);
    }

    public List<Musteri> findByAdAndAdres(String ad, String adres) {
        return repository.findAllByAdAndAdres(ad, adres);
    }


}
