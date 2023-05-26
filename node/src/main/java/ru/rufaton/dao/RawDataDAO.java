package ru.rufaton.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rufaton.entity.RawData;

public interface RawDataDAO extends JpaRepository<RawData, Long> {
}
