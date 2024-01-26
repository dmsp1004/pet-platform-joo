package com.petkin.review.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLACE_CODE")
@Getter
@Setter
public class PlaceCodeEntity {
    @Id
    @Column(name = "CODE", nullable = false)
    private String code;

    @Column(name = "PLACE_DETAIL_IDX", nullable = false)
    private Integer codeName;

    public PlaceCodeEntity() {}

    public PlaceCodeEntity(String code, Integer codeName) {
        this.code = code;
        this.codeName = codeName;
    }
}