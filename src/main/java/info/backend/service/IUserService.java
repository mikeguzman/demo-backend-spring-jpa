package info.backend.service;

import info.backend.model.User;

import java.util.List;

public interface IUserService {
    /**
     * Method to find all entities
     * @return the list of entities of UserDao
     */
    public List<User> findAll();
}
