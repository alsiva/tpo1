package vasilkov.lab1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vasilkov.lab1.entity.UserEntity;

import java.util.Optional;

//todo c чем взаимодействует, id
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByEmail(String email);
}
