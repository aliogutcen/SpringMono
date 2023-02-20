package com.ogutcenali.SpringMono.dto.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UrunSaveRequestDto {

    Long id;

    String ad;

    String fiyat;

    String kdv;

    String barkod;

}
