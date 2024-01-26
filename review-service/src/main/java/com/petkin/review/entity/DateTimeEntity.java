package com.petkin.review.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public abstract class DateTimeEntity {

    @Column(name = "REGISTER_DATE", nullable = false)
    private LocalDateTime registerDate;

    @Column(name = "UPDATE_DATE")
    private LocalDateTime updateDate;
}