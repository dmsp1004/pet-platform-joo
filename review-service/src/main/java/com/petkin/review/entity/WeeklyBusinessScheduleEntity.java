package com.petkin.review.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "WEEKLY_BUSINESS_SCHEDULE")
@Getter
@Setter
public class WeeklyBusinessScheduleEntity {
    @Id
    @Column(name = "PLACE_IDX", nullable = false)
    private Integer placeIdx;

    @Column(name = "DAY", nullable = false)
    private String day;

    @Column(name = "OPEN_TIME", nullable = false)
    private LocalDateTime openTime;

    @Column(name = "CLOSE_TIME", nullable = false)
    private LocalDateTime closeTime;

    public WeeklyBusinessScheduleEntity() {}

    public WeeklyBusinessScheduleEntity(Integer placeIdx, String day, LocalDateTime openTime, LocalDateTime closeTime) {
        this.placeIdx = placeIdx;
        this.day = day;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
}