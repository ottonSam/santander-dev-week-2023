package dev.ottonsam.santanderdevweek.domain.repository;

import dev.ottonsam.santanderdevweek.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
