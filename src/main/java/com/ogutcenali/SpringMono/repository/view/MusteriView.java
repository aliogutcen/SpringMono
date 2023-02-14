package com.ogutcenali.SpringMono.repository.view;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MusteriView {

    Long id;

    String ad;
}
