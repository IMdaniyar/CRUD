package kz.globalsystem.crudproject.service;

import kz.globalsystem.crudproject.model.User;
import kz.globalsystem.crudproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{

    private final UserRepository userRepository ;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByID(Long id)
    {
        return userRepository.getOne(id);
    }
    public List<User> findAll()
    {
        return userRepository.findAll();
    }
    public User saveUser(User user)
    {
        return userRepository.save(user);
    }
    public void deleteByID(Long id)
    {
        userRepository.deleteById(id);
    }
}
