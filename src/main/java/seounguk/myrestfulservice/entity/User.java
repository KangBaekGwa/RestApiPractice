package seounguk.myrestfulservice.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
public class User {
    private Integer id;
    private String name;
    private Date joinData;

    public User(Integer id, String name, Date joinData) {
        this.id = id;
        this.name = name;
        this.joinData = joinData;
    }

    public User() {
    }
}
