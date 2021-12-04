package com.finalproject.VeterinarianClinic.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.finalproject.VeterinarianClinic.Dao.ServicesDao;
import com.finalproject.VeterinarianClinic.entities.Services;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j

public class DefaultServicesService implements ServicesService {
  @Autowired
  ServicesDao servicesDao;
  
  @Transactional
  @Override
  
  public List<Services> getServices() {
   log.debug("DefaultServicesService -> getServices() method called");
   List<Services> services = servicesDao.getServices();
     return services;
  }
  
  @Transactional
  @Override
  
  public Services postServices(Services services) {
    log.debug("DefaultServicesService -> postServices() method called");
    return servicesDao.postServices(services);
  }

  @Transactional
  @Override
  
  public Services updateServices(Services services) {
   log.debug("DefaultServicesService -> postServices() method called");
   return servicesDao.updateServices(services);
  }
  
  @Transactional
  @Override
  
  public Services deleteServices(Services services) {
   log.debug("DefaultServicesService -> deleteServices() method called");
   return servicesDao.deleteServices(services);
  }

}
