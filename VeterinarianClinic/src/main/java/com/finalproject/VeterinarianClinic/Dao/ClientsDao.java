package com.finalproject.VeterinarianClinic.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.finalproject.VeterinarianClinic.entities.Clients;

public interface ClientsDao {
  List<Clients> getClients();

  

}
