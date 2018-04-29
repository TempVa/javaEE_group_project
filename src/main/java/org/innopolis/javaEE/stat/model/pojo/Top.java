package org.innopolis.javaEE.stat.model.pojo;

public class Top {
    private Integer rank;
    private String username;

    public Top(String username, Integer rank) {
        this.username = username;
        this.rank = rank;
    }

    public Top() {

    }

    public String getUsername() {
        return username;
    }

    public Integer getRank() {
        return rank;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
