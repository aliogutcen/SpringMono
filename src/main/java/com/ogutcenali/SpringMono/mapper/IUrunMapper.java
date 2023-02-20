package com.ogutcenali.SpringMono.mapper;

import com.ogutcenali.SpringMono.dto.request.UrunSaveRequestDto;
import com.ogutcenali.SpringMono.dto.request.UrunUpdateRequestDto;
import com.ogutcenali.SpringMono.repository.entity.Urun;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUrunMapper {

    IUrunMapper INSTANCE = Mappers.getMapper(IUrunMapper.class);

    Urun toUrun(final UrunSaveRequestDto dto);

    Urun toUrun(final UrunUpdateRequestDto dto);
}
