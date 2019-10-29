package com.denis.demogame.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
public class LastMark {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userOwner;

    @Column
    private long markToUserId;

    @Column
    private String stat1;

    @Column
    private String stat2;

    @Column
    private String stat3;

    @Column
    private LocalDateTime markExpiration;

}
