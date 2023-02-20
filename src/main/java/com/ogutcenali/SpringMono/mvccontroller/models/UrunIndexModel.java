package com.ogutcenali.SpringMono.mvccontroller.models;

import com.ogutcenali.SpringMono.repository.entity.Urun;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UrunIndexModel {

    /*
    Urun sayfamıza gönderilecek olan bilgilerin gönderilecceği alan
     */

    String title;
    List<String> menu;

    List<Urun> urunList;
}
