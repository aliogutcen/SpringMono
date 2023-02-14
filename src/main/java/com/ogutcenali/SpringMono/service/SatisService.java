package com.ogutcenali.SpringMono.service;

import com.ogutcenali.SpringMono.repository.ISatisRepository;
import com.ogutcenali.SpringMono.repository.entity.Satis;
import com.ogutcenali.SpringMono.utility.ServiceManager;
import org.springframework.stereotype.Service;


@Service
public class SatisService extends ServiceManager<Satis,Long> {
    private final ISatisRepository repository;
    public SatisService(ISatisRepository repository){
        super(repository);
        this.repository = repository;
    }

}
