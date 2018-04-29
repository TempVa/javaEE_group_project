package org.innopolis.javaEE.stat.model.pojo;

import java.sql.Time;
import java.time.LocalTime;

public class Stat {
    private Integer id;
    private String username;
    private Time meanIn;
    private Time meanOut;
    private Integer meanWorkTime;
    private Integer countIn;
    private Integer countOut;

    public Stat(Integer id, String username, Time meanIn, Time meanOut, Integer meanWorkTime, Integer countIn, Integer countOut) {
        this.id = id;
        this.username = username;
        this.meanIn = meanIn;
        this.meanOut = meanOut;
        this.meanWorkTime = meanWorkTime;
        this.countIn = countIn;
        this.countOut = countOut;
    }

    public Stat() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Time getMeanIn() {
        return meanIn;
    }

    public void setMeanIn(Time meanIn) {
        this.meanIn = meanIn;
    }

    public Time getMeanOut() {
        return meanOut;
    }

    public void setMeanOut(Time meanOut) {
        this.meanOut = meanOut;
    }

    public Integer getMeanWorktime() {
        return meanWorkTime;
    }

    public void setMeanWorktime(Integer meanWorktime) {
        this.meanWorkTime = meanWorktime;
    }

    public Integer getCountIn() {
        return countIn;
    }

    public void setCountIn(Integer countIn) {
        this.countIn = countIn;
    }

    public Integer getCountOut() {
        return countOut;
    }

    public void setCountOut(Integer countOut) {
        this.countOut = countOut;
    }
}
