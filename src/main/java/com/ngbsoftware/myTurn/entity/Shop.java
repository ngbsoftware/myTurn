package com.ngbsoftware.myTurn.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "shop")
@Getter
@Setter

public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "region")
    private String region;

    @Column(name = "country")
    private String country;

    @Column(name = "phone")
    private String phone;

    @Column(name = "open_time")
    private String openTime;

    @Column(name = "close_time")
    private String closeTime;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Appointment> appointments;

    public void add(Appointment appointment) {
        if (appointment != null) {
            appointments = new HashSet<>();
        }

        appointments.add(appointment);
        appointment.setProvider(this);
    }
//    public Shop() {
//    }
//
//    public Shop(String name, String address, String city, String region, String country, String phone, String openTime, String closeTime) {
//        this.name = name;
//        this.address = address;
//        this.city = city;
//        this.region = region;
//        this.country = country;
//        this.phone = phone;
//        this.openTime = openTime;
//        this.closeTime = closeTime;
//    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getRegion() {
//        return region;
//    }
//
//    public void setRegion(String region) {
//        this.region = region;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getOpenTime() {
//        return openTime;
//    }
//
//    public void setOpenTime(String openTime) {
//        this.openTime = openTime;
//    }
//
//    public String getCloseTime() {
//        return closeTime;
//    }
//
//    public void setCloseTime(String closeTime) {
//        this.closeTime = closeTime;
//    }
//
//    @Override
//    public String toString() {
//        return "Shop{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", city='" + city + '\'' +
//                ", region='" + region + '\'' +
//                ", country='" + country + '\'' +
//                ", phone='" + phone + '\'' +
//                ", openTime='" + openTime + '\'' +
//                ", closeTime='" + closeTime + '\'' +
//                '}';
//    }
}
