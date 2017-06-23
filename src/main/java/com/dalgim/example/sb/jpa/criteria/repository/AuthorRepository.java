package com.dalgim.example.sb.jpa.criteria.repository;

import com.dalgim.example.sb.jpa.criteria.model.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mateusz Dalgiewicz on 23.06.2017.
 */
@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
}
