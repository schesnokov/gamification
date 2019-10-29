package com.denis.demogame.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String stat1;

    @Column
    private int val1;

    @Column
    private String stat2;

    @Column
    private int val2;

    @Column
    private String stat3;

    @Column
    private int val3;

    @OneToOne(mappedBy = "attribute")
    private User user;
}
