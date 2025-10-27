package com.example.UberReviewService.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
public abstract class BaseModel {


    @Id //this annotation makes the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identity means auto_inc
    Long id;

    @Column(nullable = false)
    @CreatedDate
    protected Date createdAt;

    @Column(nullable = false)
    @LastModifiedDate
    protected Date updatedAt;

}
