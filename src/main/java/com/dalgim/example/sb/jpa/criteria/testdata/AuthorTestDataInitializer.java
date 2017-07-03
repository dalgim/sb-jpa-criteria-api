package com.dalgim.example.sb.jpa.criteria.testdata;

import com.dalgim.example.sb.jpa.criteria.model.AuthorEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.time.LocalDate;

/**
 * Created by Mateusz Dalgiewicz on 03.07.2017.
 */
@Component
@RequiredArgsConstructor
public class AuthorTestDataInitializer implements TestDataInitializer {

    private final EntityManager entityManager;

    @Override
    public void initialize() {
        create("John", "Smith", LocalDate.now().minusYears(50));
        create("Harry", "Jackson", LocalDate.now().minusYears(40));
        create("Tom", "White", LocalDate.now().minusYears(30));
        create("Jack", "Black", LocalDate.now().minusYears(20));
    }

    AuthorEntity create(String firstName, String lastName, LocalDate birthDay) {
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setBirthDate(birthDay);
        authorEntity.setFirstName(firstName);
        authorEntity.setLastName(lastName);
        entityManager.persist(authorEntity);
        return authorEntity;
    }
}
