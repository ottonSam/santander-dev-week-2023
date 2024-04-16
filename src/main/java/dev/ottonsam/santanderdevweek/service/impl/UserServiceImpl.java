package dev.ottonsam.santanderdevweek.service.impl;

import dev.ottonsam.santanderdevweek.domain.model.User;
import dev.ottonsam.santanderdevweek.domain.repository.UserRepository;
import dev.ottonsam.santanderdevweek.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if (userRepository.existsByAccountNumber(user.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(user);
    }
}
