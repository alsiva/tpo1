package vasilkov.lab1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vasilkov.lab1.entity.UserEntity;
import vasilkov.lab1.exeption.UserAlreadyExistException;
import vasilkov.lab1.repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public UserEntity registration (UserEntity user) throws UserAlreadyExistException {
        if (userRepo.findByEmail(user.getEmail()).isPresent()){
            throw new UserAlreadyExistException("Пользователь с таким имиенем уже существует");
        }
        return userRepo.save(user);
    }
}
