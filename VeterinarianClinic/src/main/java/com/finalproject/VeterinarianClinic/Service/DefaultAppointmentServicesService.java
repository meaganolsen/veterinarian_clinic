package com.finalproject.VeterinarianClinic.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finalproject.VeterinarianClinic.Dao.AppointmentServicesDao;
import com.finalproject.VeterinarianClinic.entities.AppointmentServices;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultAppointmentServicesService implements AppointmentServicesService {
  @Autowired
  AppointmentServicesDao dao;
  
  @Override
  public List<AppointmentServices> getAppointmentServices() {
    log.debug("DefaultAppointmentServicesService -> getAppointmentServices() method called");
      List<AppointmentServices> appointmentServices = dao.getAppointmentServices(); {
        return appointmentServices;
      }
  }

}
