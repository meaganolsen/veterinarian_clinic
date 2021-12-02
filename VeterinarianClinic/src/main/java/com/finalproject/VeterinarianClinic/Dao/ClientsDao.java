package com.finalproject.VeterinarianClinic.Dao;


import java.util.List;
import com.finalproject.VeterinarianClinic.entities.Clients;

public interface ClientsDao {
  List<Clients> getClients();

  Clients postClients(Clients clients);
  
  Clients updateClients(Clients clients);

  Clients deleteClients(Clients clients);
  

}
