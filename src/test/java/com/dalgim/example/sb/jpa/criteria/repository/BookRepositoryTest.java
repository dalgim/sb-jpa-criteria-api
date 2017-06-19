package com.dalgim.example.sb.jpa.criteria.repository;

import com.dalgim.example.sb.jpa.criteria.model.BookEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by Mateusz Dalgiewicz on 19.06.2017.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void shouldInsertBook() throws Exception {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setName("Harry Potter");
        bookEntity.setReleaseDate(LocalDate.now());
        bookEntity.setAuthor("J.K. Rowling");

        bookRepository.save(bookEntity);
        assertThat(bookRepository.findAll().size()).isEqualTo(1);
    }
}