package com.ngbsoftware.myTurn.dao;

import com.ngbsoftware.myTurn.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
