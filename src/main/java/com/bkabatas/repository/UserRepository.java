package com.bkabatas.repository;

import com.bkabatas.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users,Long> {

}
