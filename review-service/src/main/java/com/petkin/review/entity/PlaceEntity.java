package com.petkin.review.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLACE")
@Getter
@Setter
public class PlaceEntity {
    @Id
    @Column(name = "PLACE_IDX", nullable = false)
    private Integer placeIdx;

    @Column(name = "PLACE_NAME", nullable = false)
    private String placeName;

    @Column(name = "LONGITUDE", nullable = false)
    private String longitude;

    @Column(name = "LATITUDE", nullable = false)
    private String latitude;

    @Column(name = "PLACE_PHONE_NUMBER")
    private String placePhoneNumber;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "SECTORS", nullable = false)
    private String sectors;


    public PlaceEntity() {}

    public PlaceEntity(Integer placeIdx, String placeName, String longitude, String latitude,
                       String placePhoneNumber, String address, String sectors) {
        this.placeIdx = placeIdx;
        this.placeName = placeName;
        this.longitude = longitude;
        this.latitude = latitude;
        this.placePhoneNumber = placePhoneNumber;
        this.address = address;
        this.sectors = sectors;
    }
}