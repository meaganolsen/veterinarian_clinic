package com.finalproject.VeterinarianClinic.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finalproject.VeterinarianClinic.Dao.ClientsDao;
import com.finalproject.VeterinarianClinic.entities.Clients;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j

public class DefaultClientService implements ClientsService{
    @Autowired
    
    ClientsDao dao;
 
    @Override
    public List<Clients> getClients() {
     log.debug("DefaultClientsService -> getClients() method called");
       List<Clients> Clients = dao.getClients(); {
      return Clients;
    }
  }

}
