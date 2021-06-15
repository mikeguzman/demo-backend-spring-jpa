package info.backend.service;

import info.backend.model.User;
import info.backend.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    /**
     * Method to find all entities
     *
     * @return the list of entities of UserDao
     */
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
