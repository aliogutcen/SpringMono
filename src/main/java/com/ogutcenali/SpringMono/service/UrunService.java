package com.ogutcenali.SpringMono.service;

import com.ogutcenali.SpringMono.dto.request.UrunSaveRequestDto;
import com.ogutcenali.SpringMono.dto.request.UrunUpdateRequestDto;
import com.ogutcenali.SpringMono.mapper.IUrunMapper;
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


public void save(UrunSaveRequestDto dto){
    save(IUrunMapper.INSTANCE.toUrun(dto));
}


public void update(UrunUpdateRequestDto dto){
    update(IUrunMapper.INSTANCE.toUrun(dto));
}

}
