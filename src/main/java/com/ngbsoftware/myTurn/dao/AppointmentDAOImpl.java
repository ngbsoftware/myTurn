package com.ngbsoftware.myTurn.dao;

import com.ngbsoftware.myTurn.entity.Appointment;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AppointmentDAOImpl implements  AppointmentDAO {

    private EntityManager entityManager;

    @Autowired
    public AppointmentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Appointment theAppointment) {
        entityManager.persist(theAppointment);
    }
}
