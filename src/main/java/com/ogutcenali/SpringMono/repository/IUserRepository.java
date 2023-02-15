package com.ogutcenali.SpringMono.repository;

import com.ogutcenali.SpringMono.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
}
