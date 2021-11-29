package com.finalproject.VeterinarianClinic.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finalproject.VeterinarianClinic.Dao.PetsDao;
import com.finalproject.VeterinarianClinic.entities.Pets;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultPetsService implements PetsService {
  @Autowired
 
  PetsDao dao;
  @Override
  public List<Pets> getPets() {
   log.debug("DefaultPetsService -> getPets() method called");
     List<Pets> pets = dao.getPets(); {
    return pets;
  }
 }
}