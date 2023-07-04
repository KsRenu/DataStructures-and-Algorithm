package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hall")

public class Hall {
    @Id
    private String id;
    private String hallNo;
    private String benchPosition;

    public Hall() {
    }

    public Hall(String id, String hallNo, String benchPosition) {
        this.id = id;
        this.hallNo = hallNo;
        this.benchPosition = benchPosition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHallNo() {
        return hallNo;
    }

    public void setHallNo(String hallNo) {
        this.hallNo = hallNo;
    }

    public String getBenchPosition() {
        return benchPosition;
    }

    public void setBenchPosition(String benchPosition) {
        this.benchPosition = benchPosition;
    }
}
