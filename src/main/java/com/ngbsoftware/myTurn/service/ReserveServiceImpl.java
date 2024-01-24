package com.ngbsoftware.myTurn.service;

import com.ngbsoftware.myTurn.dao.UserRepository;
import com.ngbsoftware.myTurn.dto.Reserve;
import com.ngbsoftware.myTurn.dto.ReserveResponse;
import com.ngbsoftware.myTurn.entity.Appointment;
import com.ngbsoftware.myTurn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReserveServiceImpl implements ReserveService {

    private UserRepository userRepository;

    @Autowired
    public ReserveServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public ReserveResponse placeReserve(Reserve reserve) {

        Appointment appointment = reserve.getAppointment();
        User user = reserve.getUser();

        appointment.setProvider(reserve.getShop());
        user.add(appointment);

        userRepository.save(user);


        return new ReserveResponse(appointment.getDate().toString());
    }
}
