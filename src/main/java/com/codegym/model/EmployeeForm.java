package com.codegym.model;

import org.springframework.web.multipart.MultipartFile;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class EmployeeForm {

    private Long id;
    @NotEmpty(message = "Bạn đã để trống dữ liệu, mời nhập vào!")
    @Size(min = 3,max = 20,message = "Tên nhập vào phải là chữ có từ 3 đến 20 ký tự!")
    private String name;
    @NotEmpty(message = "Bạn đã để trống dữ liệu, mời nhập vào!")
    @Min(value = 18,message = "Tuổi phải từ 18 trở lên !")
    private int age;

    @NotEmpty(message = "Bạn đã để trống dữ liệu, mời nhập vào!")
    private String address;

    private MultipartFile img;

    private MultipartFile audio;

    private Boss boss;


    public EmployeeForm() {
    }

    public EmployeeForm(Long id, String name, int age, String address, MultipartFile img, MultipartFile audio) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.img = img;
        this.audio = audio;
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

    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }

    public MultipartFile getAudio() {
        return audio;
    }

    public void setAudio(MultipartFile audio) {
        this.audio = audio;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }
}
