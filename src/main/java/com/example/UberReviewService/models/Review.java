package com.example.UberReviewService.models;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "bookingreview")
public class Review {

    @Id //this annotation makes the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identity means auto_inc
    Long id;

    @Column(nullable = false)
    String content;

    Double rating;

    @Column(nullable = false)
    @CreatedDate
    Date createdAt;

    @Column(nullable = false)
    @LastModifiedDate
    Date updatedAt;

    @Override
    public String toString(){
        return "Review :" + this.content + " " + this.rating + " " + this.createdAt;
    }

}
