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
  
  private AppointmentsDao appointmentsDao;
  @Transactional
  @Override
  public List<Appointments> getAppointments() {
   log.debug("DefaultAppointmentService -> getAppointments() method called");
    List<Appointments> appointments = appointmentsDao.getAppointments(); {
      return appointments; 
    }
   
  }
  @Transactional
  @Override
  public Appointments postAppointments(Appointments appointments) {
    log.debug("DefaultAppointmentsService -> postAppointments() method called");
    return appointmentsDao.postAppointments(appointments);
  }
  @Transactional
  @Override
  public Appointments updateAppointments(Appointments appointments) {
    log.debug("DefaultAppointmentsService -> updateAppointments() method called");
    return appointmentsDao.updateAppointments(appointments);
  }
  public Appointments deleteAppointments(Appointments appointments) {
    log.debug("DefaultAppointmentsContoller -> deleteAppointments() method called");
    return appointmentsDao.deleteAppointments(appointments);
  }
}