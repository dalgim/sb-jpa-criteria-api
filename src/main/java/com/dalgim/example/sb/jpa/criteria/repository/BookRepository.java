package com.dalgim.example.sb.jpa.criteria.repository;

import com.dalgim.example.sb.jpa.criteria.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Mateusz Dalgiewicz on 19.06.2017.
 */
@Repository
@Transactional
public interface BookRepository extends JpaRepository<BookEntity, Long>, JpaSpecificationExecutor<BookEntity> {
}
