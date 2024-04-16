package dev.ottonsam.santanderdevweek.service;

import dev.ottonsam.santanderdevweek.domain.model.User;

public interface UserService {
        User findById(Long id);

        User create(User user);

}
