package com.finalproject.VeterinarianClinic.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.finalproject.VeterinarianClinic.Service.ClientsService;
import com.finalproject.VeterinarianClinic.entities.Clients;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultClientsController<createClientsService> implements ClientsController{
  @Autowired
  private ClientsService service;
  @Override
  public List<Clients> getClients() {
    log.debug("DefaultUserController -> getUsers() method called");
    return service.getClients();

}
  @Autowired
  private createClientsService clientsService;
  
  public Clients postClients(Clients clients) {
    log.debug("DefaultClientsService -> postClients() method called");
    return service.postClients(clients);
  }
}