package com.ogutcenali.SpringMono.service;

import com.ogutcenali.SpringMono.repository.IUrunRepository;
import com.ogutcenali.SpringMono.repository.entity.Urun;
import com.ogutcenali.SpringMono.utility.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class UrunService  extends ServiceManager<Urun,Long> {

public UrunService(IUrunRepository urunRepository){
    super(urunRepository);

}

}
