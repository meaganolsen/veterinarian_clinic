package com.finalproject.VeterinarianClinic.Service;

import java.util.List;
import com.finalproject.VeterinarianClinic.entities.Clients;

public interface ClientsService {
  List<Clients> getClients();
  
  Clients postClients(Clients clients);
  
  Clients updateClients(Clients clients);
  
  Clients deleteClients(Clients clients);

}
