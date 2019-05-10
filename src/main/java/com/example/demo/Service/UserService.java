package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.User;

public interface UserService {
    /**
     * Gets user list.
     *
     * @return the user list
     */
    List<User> getUserList();

    /**
     * Find user by id user.
     *
     * @param id the id
     * @return the user
     */
    User findUserById(long id);

    /**
     * Save.
     *
     * @param user the user
     */
    void save(User user);

    /**
     * Edit.
     *
     * @param user the user
     */
    void edit(User user);

    /**
     * Delete.
     *
     * @param id the id
     */
    void delete(long id);
}
