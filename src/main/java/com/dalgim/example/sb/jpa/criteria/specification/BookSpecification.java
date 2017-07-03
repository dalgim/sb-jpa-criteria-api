package com.dalgim.example.sb.jpa.criteria.specification;

import com.dalgim.example.sb.jpa.criteria.model.BookEntity;
import com.dalgim.example.sb.jpa.criteria.model.BookEntity_;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;

/**
 * Created by Mateusz Dalgiewicz on 21.06.2017.
 */
public final class BookSpecification {

    public static Specification<BookEntity> hasNameLike(String name) {
        return (root, cq, cb) -> cb.like(root.get(BookEntity_.name), name);
    }

    public static Specification<BookEntity> releaseDateLessOrEqualTo(LocalDate date) {
        return (root, cq, cb) -> cb.lessThanOrEqualTo(root.get(BookEntity_.releaseDate), date);
    }
}
