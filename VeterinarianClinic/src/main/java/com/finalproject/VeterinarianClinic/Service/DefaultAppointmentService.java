package com.finalproject.VeterinarianClinic.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.finalproject.VeterinarianClinic.Dao.AppointmentsDao;
import com.finalproject.VeterinarianClinic.entities.Appointments;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultAppointmentService implements AppointmentsService {
  @Autowired
  
  AppointmentsDao appointmentsDao;
  @Override
  public List<Appointments> getAppointments() {
   log.debug("DefaultAppointmentService -> getAppointments() method called");
    List<Appointments> appointments = appointmentsDao.getAppointments(); {
      return appointments; 
    }
   
  }
  @Override
  public Appointments postAppointments(Appointments appointments) {
    log.debug("DefaultAppointmentsServices -> postAppointments() method called");
    return appointmentsDao.postAppointments(appointments);
  }

  @Override
  public Appointments updateAppointments(Appointments appointments) {
    log.debug("DefaultAppointmentsServices -> updateAppointments() method called");
    return appointmentsDao.updateAppointments(appointments);
  }
}