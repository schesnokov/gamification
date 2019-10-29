package com.denis.demogame.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Getter
@Setter
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

    @Override
    public String toString() {
        return "Attribute{" +
                "id=" + id +
                ", stat1='" + stat1 + '\'' +
                ", val1=" + val1 +
                ", stat2='" + stat2 + '\'' +
                ", val2=" + val2 +
                ", stat3='" + stat3 + '\'' +
                ", val3=" + val3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attribute attribute = (Attribute) o;
        return id == attribute.id &&
                val1 == attribute.val1 &&
                val2 == attribute.val2 &&
                val3 == attribute.val3 &&
                Objects.equals(stat1, attribute.stat1) &&
                Objects.equals(stat2, attribute.stat2) &&
                Objects.equals(stat3, attribute.stat3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stat1, val1, stat2, val2, stat3, val3);
    }
}
