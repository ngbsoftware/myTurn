package com.ngbsoftware.myTurn.dto;

import com.ngbsoftware.myTurn.entity.Appointment;
import com.ngbsoftware.myTurn.entity.Shop;
import com.ngbsoftware.myTurn.entity.User;
import lombok.Data;

@Data
public class Reserve {

    private User user;
    private Shop shop;
    private Appointment appointment;
}
