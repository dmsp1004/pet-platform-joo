package com.petkin.review.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REVIEW")
@Getter
@Setter
public class ReviewEntity extends DateTimeEntity{
    @Id
    @Column(name = "REVIEW_IDX", nullable = false)
    private Integer reviewIdx;

    @Column(name = "MEMBER_IDX", nullable = false)
    private Integer memberIdx;

    @Column(name = "PLACE_IDX", nullable = false)
    private Integer placeIdx;

    @Column(name = "REVIEW_CONTENT", nullable = false)
    private String reviewContent;

    @Column(name = "REPORT_FLAG", nullable = false, columnDefinition = "String default N")
    private String reportFlag;

    @Column(name = "DELETE_FLAG", nullable = false, columnDefinition = "String default N")
    private String deleteFlag;


    public ReviewEntity() {}

    public ReviewEntity(Integer reviewIdx, Integer memberIdx, Integer placeIdx, String reviewContent,
                        String reportFlag, String deleteFlag) {
        this.reviewIdx = reviewIdx;
        this.memberIdx = memberIdx;
        this.placeIdx = placeIdx;
        this.reviewContent = reviewContent;
        this.reportFlag = reportFlag;
        this.deleteFlag = deleteFlag;
    }
}