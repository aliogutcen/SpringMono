package com.ogutcenali.SpringMono.dto.request;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

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

    MultipartFile profileimg;

}
