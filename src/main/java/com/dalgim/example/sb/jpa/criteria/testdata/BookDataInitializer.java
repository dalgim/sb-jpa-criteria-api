package com.dalgim.example.sb.jpa.criteria.testdata;

import com.dalgim.example.sb.jpa.criteria.model.BookEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import java.time.LocalDate;

/**
 * Created by Mateusz Dalgiewicz on 21.06.2017.
 */
@Component
@RequiredArgsConstructor
public class BookDataInitializer implements TestDataInitializer {

    private final EntityManager entityManager;

    @Override
    public void initialize() {
        create("Book1", "John1", LocalDate.now());
        create("Book2", "John2", LocalDate.now());
        create("Book3", "John3", LocalDate.now());
        create("Book4", "John4", LocalDate.now());
    }

    BookEntity create(String name, String author, LocalDate releaseDate) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setAuthor(author);
        bookEntity.setName(name);
        bookEntity.setReleaseDate(releaseDate);
        entityManager.persist(bookEntity);
        return bookEntity;
    }
}
