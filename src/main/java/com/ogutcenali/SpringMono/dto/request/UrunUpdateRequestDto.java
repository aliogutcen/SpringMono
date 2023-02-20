package com.ogutcenali.SpringMono.dto.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UrunUpdateRequestDto {

    Long id;

    String ad;

    String fiyat;

    String barkod;

    Integer kdv;

}
