package com.petkin.review.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CODE")
@Getter
@Setter
public class CodeEntity{
    @Id
    @Column(name = "CODE", nullable = false)
    private String code;

    @Column(name = "CODE_NAME", nullable = false)
    private String codeName;

    public CodeEntity() {}

    public CodeEntity(String code, String codeName) {
        this.code = code;
        this.codeName = codeName;
    }
}
