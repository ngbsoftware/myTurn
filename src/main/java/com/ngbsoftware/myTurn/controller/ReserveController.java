package com.ngbsoftware.myTurn.controller;

import com.ngbsoftware.myTurn.dto.Reserve;
import com.ngbsoftware.myTurn.dto.ReserveResponse;
import com.ngbsoftware.myTurn.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/reserve")
public class ReserveController {

    private ReserveService reserveService;

    @Autowired
    public ReserveController(ReserveService reserveService) {
        this.reserveService = reserveService;
    }

    @PostMapping("/reserve")
    public ReserveResponse placeReserve(@RequestBody Reserve reserve) {

        ReserveResponse reserveResponse = reserveService.placeReserve(reserve);

        return reserveResponse;
    }
}
