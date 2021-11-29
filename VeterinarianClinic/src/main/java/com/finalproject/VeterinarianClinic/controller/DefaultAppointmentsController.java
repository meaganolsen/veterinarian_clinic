package com.finalproject.VeterinarianClinic.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.finalproject.VeterinarianClinic.Service.AppointmentsService;
import com.finalproject.VeterinarianClinic.entities.Appointments;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j

public class DefaultAppointmentsController<createAppointmentsService, updateAppointmentsService>  implements AppointmentsController {
  @Autowired
  private AppointmentsService service;
  @Override
  public List<Appointments> getAppointments() {
    log.debug("DefaultApointmentController -> getAppointments() method called");
    return service.getAppointments();
  
  
}
  @Autowired
  private createAppointmentsService appointmentsService;
  
  public Appointments postAppointments(Appointments appointments) {
    log.debug("DefaultAppointmentsService -> postAppointments() method called");
    return service.postAppointments(appointments);
  }
  @Autowired
  
  private updateAppointmentsService updateAppointmentService;
  
  public Appointments updateAppointments(Appointments appointments) {
    log.debug("DefaultAppointmentsController -> updateAppointments() method called");
    return service.updateAppointments(appointments);
  }
  
  
}