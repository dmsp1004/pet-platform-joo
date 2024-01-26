package com.petkin.review.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLACE_DETAIL")
@Getter
@Setter
public class PlaceDetailEntity extends DateTimeEntity{
    @Id
    @Column(name = "PLACE_DETAIL_IDX", nullable = false)
    private Integer placeDetailIdx;

    @Column(name = "PLACE_IDX", nullable = false)
    private Integer placeIdx;

    @Column(name = "HIT", nullable = false, columnDefinition = "int default 0")
    private Integer hit;

    @Column(name = "PLACE_CATEGORY", nullable = false)
    private String placeCategory;


    public PlaceDetailEntity() {}

    public PlaceDetailEntity(Integer placeDetailIdx, Integer placeIdx, Integer hit, String placeCategory) {
        this.placeDetailIdx = placeDetailIdx;
        this.placeIdx = placeIdx;
        this.hit = hit;
        this.placeCategory = placeCategory;
    }
}