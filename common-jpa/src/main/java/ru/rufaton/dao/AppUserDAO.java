package ru.rufaton.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rufaton.entity.AppUser;

public interface AppUserDAO extends JpaRepository<AppUser, Long> {
    AppUser findByTelegramUserId(Long id);
}
