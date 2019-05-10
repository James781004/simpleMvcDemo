package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * Find by id user.
     *
     * @param id the id
     * @return the user
     */
    User findById(long id);

}
