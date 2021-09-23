package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    private String address;

    private String img;

    private String audio;

    @ManyToOne
    @JoinColumn(name = "boss_id")
    private Boss boss;

    public Employee() {
    }

    public Employee(Long id, String name, int age, String address, String img, String audio, Boss boss) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.img = img;
        this.audio = audio;
        this.boss = boss;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }
}
