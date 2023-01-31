package com.cisco.Sporty_shoes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.Sporty_shoes.Entity.Users;



public interface UsersRepo extends JpaRepository<Users, String> { 


}
