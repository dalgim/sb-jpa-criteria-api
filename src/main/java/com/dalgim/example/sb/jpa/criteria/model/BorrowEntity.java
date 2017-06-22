package com.dalgim.example.sb.jpa.criteria.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;

/**
 * Created by Mateusz Dalgiewicz on 22.06.2017.
 */
@Entity
@Getter
@Setter
public class BorrowEntity {

    @Id
    @GeneratedValue
    public Long id;
    private LocalDate borrowStartDate;
    private LocalDate borrowStopDate;
    @OneToOne
    private BookEntity book;
}
