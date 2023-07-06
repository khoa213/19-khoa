package com.finalproject.kits.mmovies.Repository;

import com.finalproject.kits.mmovies.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {

}
