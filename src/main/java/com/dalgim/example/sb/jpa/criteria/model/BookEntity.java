package com.dalgim.example.sb.jpa.criteria.model;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

/**
 * Created by Mateusz Dalgiewicz on 19.06.2017.
 */
@Entity
@Getter
@Setter
public class BookEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String author;
    private LocalDate releaseDate;
    @OneToMany
    private Set<AuthorEntity> authors = Sets.newHashSet();
}
