package com.finalproject.VeterinarianClinic.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.finalproject.VeterinarianClinic.Service.ClientsService;
import com.finalproject.VeterinarianClinic.entities.Appointments;
import com.finalproject.VeterinarianClinic.entities.Clients;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultClientsController implements ClientsController{
  @Autowired
  private ClientsService service;
  @Override
  public List<Clients> getClients() {
    log.debug("DefaultClientsController -> getClients() method called");
    return service.getClients();

}
  @Override
  public Clients postClients(Clients clients) {
    log.debug("DefaultClientsController -> postClients() method called");
    return service.postClients(clients);
  }
  @Override
  public Clients updateClients(Clients clients) {
    log.debug("DefaultClientsController -> updateClients() method called");
    return service.updateClients(clients);
  }
  public Clients deleteClients(Clients clients) {
    log.debug("DefaultClientsController -> deleteClients() mthod called");
    return service.deleteClients(clients);
  }
}