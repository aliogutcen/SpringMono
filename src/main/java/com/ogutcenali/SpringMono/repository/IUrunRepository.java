package com.ogutcenali.SpringMono.repository;

import com.ogutcenali.SpringMono.repository.entity.Urun;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUrunRepository  extends JpaRepository<Urun,Long> {
}
