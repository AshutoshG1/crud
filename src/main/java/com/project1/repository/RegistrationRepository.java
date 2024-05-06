package com.project1.repository;

import com.project1.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RegistrationRepository extends JpaRepository<Registration,Long> {
    Optional<Registration> findByMobile(long l);

    Optional<Registration> findByEmail(String mail);

    Optional<Registration> findByCourse(String html);

    Optional<Registration> findByMobileAndEmail(long l, String mail);

    List<Registration> findByMobileOrEmail(long l, String mail);

    boolean existsByMobile(long l);

    boolean existsByEmail(String mail);
}
