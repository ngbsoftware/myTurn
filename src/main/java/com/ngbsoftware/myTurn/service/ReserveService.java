package com.ngbsoftware.myTurn.service;

import com.ngbsoftware.myTurn.dto.Reserve;
import com.ngbsoftware.myTurn.dto.ReserveResponse;

public interface ReserveService {

    ReserveResponse placeReserve(Reserve reserve);
}
