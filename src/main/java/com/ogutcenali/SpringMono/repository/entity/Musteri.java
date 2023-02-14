package com.ogutcenali.SpringMono.repository.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@SuperBuilder
@Table(name = "tbl_musteri")
public class Musteri extends BaseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;

        String tcKimlik;
        String ad;

        String adres;

        Integer yas;
        String telefon;

        boolean isactive;
}
