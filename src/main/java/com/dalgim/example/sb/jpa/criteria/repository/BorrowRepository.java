package com.dalgim.example.sb.jpa.criteria.repository;

import com.dalgim.example.sb.jpa.criteria.model.BorrowEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by Mateusz Dalgiewicz on 22.06.2017.
 */
@Repository
public interface BorrowRepository extends JpaRepository<BorrowEntity, Long>, JpaSpecificationExecutor<BorrowEntity> {
}
