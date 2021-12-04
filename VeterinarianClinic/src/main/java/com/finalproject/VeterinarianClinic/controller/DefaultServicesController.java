package com.finalproject.VeterinarianClinic.controller;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.finalproject.VeterinarianClinic.Service.ServicesService;
import com.finalproject.VeterinarianClinic.entities.Services;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j

public class DefaultServicesController implements ServicesController {

  @Autowired
  private ServicesService service;
  
 
  public List<Services> getServices() {
    log.debug("DefaultServicesController -> getServices() method called");

    
    return service.getServices();
  }
  
 @Override 
  public Services postServices(Services services) {
    log.debug("DefaultServicesController -> postServices() method called");

    
    return service.postServices(services);
 
  }
 
 @Override
 public Services updateServices(Services services) {
     log.debug("DefaultServicesController -> updateServices() method called");

   
   return service.updateServices(services);

 }
 
 @Override
 public Services deleteServices(Services services) {
     log.debug("DefaultServicesController -> deleteServices() method called");

   
   return service.deleteServices(services);

 }
 
  }

