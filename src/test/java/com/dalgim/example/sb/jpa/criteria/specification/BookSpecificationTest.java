package com.dalgim.example.sb.jpa.criteria.specification;

import com.dalgim.example.sb.jpa.criteria.model.BookEntity;
import com.dalgim.example.sb.jpa.criteria.repository.BookRepository;
import com.dalgim.example.sb.jpa.criteria.testdata.TestDataLoader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by Mateusz Dalgiewicz on 22.06.2017.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan(basePackageClasses = TestDataLoader.class)
public class BookSpecificationTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void shouldReturnBookLikeName() {
        final List<BookEntity> entities = bookRepository.findAll(BookSpecification.hasNameLike("Book%"));
        assertThat(entities.size()).isEqualTo(3);
    }
}