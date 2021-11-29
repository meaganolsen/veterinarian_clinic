package com.finalproject.VeterinarianClinic.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.finalproject.VeterinarianClinic.Service.AppointmentServicesService;
import com.finalproject.VeterinarianClinic.entities.AppointmentServices;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j

public class DefaultAppointmentServicesController implements AppointmentServicesController {
  @Autowired
  private AppointmentServicesService service;
  @Override
  public List<AppointmentServices> getAppointmentServices(){
    log.debug("DefaultAppointmentServicesController -> getAppointmentServices() method called");
    return service.getAppointmentServices();
  }

}
