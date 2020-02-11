package com.megazone.entity;


//import javax.persistence.*;

//@Entity
//@Table(name = "edu")
public class EduEntity {


//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private int id;

//    @Column(name = "name")
    private String guid;

//    @Column(name = "phone")
    private String phone;

//    @Column(name = "age")
    private int age;

    public EduEntity() {
    }

    public EduEntity(String guid, String phone, int age) {
        this.guid = guid;
        this.phone = phone;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "EduEntity{" + "id=" + id + ", guid='" + guid + '\'' + ", phone='" + phone + '\'' + ", age=" + age + '}';
    }
}
