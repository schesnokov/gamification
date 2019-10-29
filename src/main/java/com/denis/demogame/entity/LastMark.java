package com.denis.demogame.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Setter
public class LastMark {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private Employee owner;

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

    public LastMark() {
    }

    public LastMark(Employee owner, long markToUserId, String stat1, String stat2, String stat3, LocalDateTime markExpiration) {
        this.owner = owner;
        this.markToUserId = markToUserId;
        this.stat1 = stat1;
        this.stat2 = stat2;
        this.stat3 = stat3;
        this.markExpiration = markExpiration;
    }

    @Override
    public String toString() {
        return "LastMark{" +
                "id=" + id +
                ", markToUserId=" + markToUserId +
                ", stat1='" + stat1 + '\'' +
                ", stat2='" + stat2 + '\'' +
                ", stat3='" + stat3 + '\'' +
                ", markExpiration=" + markExpiration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LastMark lastMark = (LastMark) o;
        return id == lastMark.id &&
                markToUserId == lastMark.markToUserId &&
                Objects.equals(stat1, lastMark.stat1) &&
                Objects.equals(stat2, lastMark.stat2) &&
                Objects.equals(stat3, lastMark.stat3) &&
                Objects.equals(markExpiration, lastMark.markExpiration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, markToUserId, stat1, stat2, stat3, markExpiration);
    }
}
