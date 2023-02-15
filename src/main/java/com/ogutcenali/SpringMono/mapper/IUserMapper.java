package com.ogutcenali.SpringMono.mapper;

import com.ogutcenali.SpringMono.dto.request.RegisterRequestDto;
import com.ogutcenali.SpringMono.dto.response.UserControllerFindAllResponseDto;
import com.ogutcenali.SpringMono.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {


    IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);


    User toUser(final RegisterRequestDto dto);
    UserControllerFindAllResponseDto userControllerFindAllResponseDtoFromUser(final User user);

}
