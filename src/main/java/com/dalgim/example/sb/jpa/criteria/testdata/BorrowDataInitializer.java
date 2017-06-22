package com.dalgim.example.sb.jpa.criteria.testdata;

import com.dalgim.example.sb.jpa.criteria.model.BookEntity;
import com.dalgim.example.sb.jpa.criteria.model.BorrowEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import java.time.LocalDate;

/**
 * Created by Mateusz Dalgiewicz on 22.06.2017.
 */
@Component
@RequiredArgsConstructor
public class BorrowDataInitializer implements TestDataInitializer {

    private final BookDataInitializer bookDataInitializer;
    private final EntityManager entityManager;

    @Override
    public void initialize() {
        final BookEntity hp1 = bookDataInitializer.create("Harry Potter", "J.K. Rownling", LocalDate.of(2000, 12, 18));
        final BookEntity hp11 = bookDataInitializer.create("Harry Potter", "J.K. Rownling", LocalDate.of(2000, 12, 18));
        final BookEntity hp2 = bookDataInitializer.create("Harry Potter 2", "J.K. Rownling", LocalDate.of(2001, 10, 16));
        final BookEntity hp22 = bookDataInitializer.create("Harry Potter 2", "J.K. Rownling", LocalDate.of(2001, 10, 16));
        final BookEntity hp222 = bookDataInitializer.create("Harry Potter 2", "J.K. Rownling", LocalDate.of(2001, 10, 16));
        final BookEntity hp3 = bookDataInitializer.create("Harry Potter 3", "J.K. Rownling", LocalDate.of(2002, 8, 14));
        final BookEntity hp33 = bookDataInitializer.create("Harry Potter 3", "J.K. Rownling", LocalDate.of(2002, 8, 14));
        final BookEntity hp333 = bookDataInitializer.create("Harry Potter 3", "J.K. Rownling", LocalDate.of(2002, 8, 14));
        final BookEntity hp3333 = bookDataInitializer.create("Harry Potter 3", "J.K. Rownling", LocalDate.of(2002, 8, 14));
        final BookEntity hp4 = bookDataInitializer.create("Harry Potter 4", "J.K. Rownling", LocalDate.of(2003, 6, 12));
        final BookEntity hp5 = bookDataInitializer.create("Harry Potter 5", "J.K. Rownling", LocalDate.of(2003, 6, 12));
        final BookEntity hp6 = bookDataInitializer.create("Harry Potter 6", "J.K. Rownling", LocalDate.of(2005, 6, 12));
        final BookEntity hp7 = bookDataInitializer.create("Harry Potter 7", "J.K. Rownling", LocalDate.of(2005, 6, 12));

        create(hp1, LocalDate.of(2017, 10, 10), null);
        create(hp11, LocalDate.of(2016, 10, 12), LocalDate.of(2016, 11, 12));
        create(hp11, LocalDate.of(2017, 8, 12), LocalDate.of(2017, 10, 12));
        create(hp11, LocalDate.of(2017, 10, 12), null);
        create(hp2, LocalDate.of(2014, 10, 15), LocalDate.of(2015, 10, 17));
        create(hp22, LocalDate.of(2016, 10, 15), null);
        create(hp222, LocalDate.of(2012, 10, 15), LocalDate.of(2013, 10, 17));
        create(hp3, LocalDate.of(2016, 10, 15), null);
        create(hp33, LocalDate.of(2011, 10, 15), LocalDate.of(2013, 10, 17));
        create(hp333, LocalDate.of(2016, 10, 15), null);
        create(hp3333, LocalDate.of(2010, 10, 15), LocalDate.of(2010, 10, 17));
        create(hp4, LocalDate.of(2016, 10, 15), LocalDate.of(2017, 10, 17));
        create(hp5, LocalDate.of(2016, 10, 15), LocalDate.of(2017, 10, 17));
        create(hp6, LocalDate.of(2016, 10, 15), null);
        create(hp7, LocalDate.of(2016, 10, 15), null);
    }

    BorrowEntity create(BookEntity book, LocalDate startDate, LocalDate stopDate) {
        BorrowEntity borrowEntity = new BorrowEntity();
        borrowEntity.setBook(book);
        borrowEntity.setBorrowStartDate(startDate);
        borrowEntity.setBorrowStopDate(stopDate);
        entityManager.persist(borrowEntity);
        return borrowEntity;
    }
}

