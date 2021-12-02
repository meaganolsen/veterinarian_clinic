package com.finalproject.VeterinarianClinic.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.finalproject.VeterinarianClinic.Dao.PetsDao;
import com.finalproject.VeterinarianClinic.entities.Pets;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultPetsService implements PetsService {
  @Autowired
 
  PetsDao petsDao;
  @Override
  public List<Pets> getPets() {
   log.debug("DefaultPetsService -> getPets() method called");
     List<Pets> pets = petsDao.getPets(); {
    return pets;
  }
    
 }
  @Transactional
  @Override
  
  public Pets postPets(Pets pets) {
   log.debug("DefaultPetsService -> postPets() method called");
   
       
    return petsDao.postPets(pets);
  }
  
  @Transactional
  @Override
  
  public Pets updatePets(Pets pets) {
   log.debug("DefaultPetsService -> postPets() method called");
   
       
    return petsDao.updatePets(pets);
  }
  
  @Transactional
  @Override
  
  public Pets deletePets(Pets pets) {
   log.debug("DefaultPetsService -> deletePets() method called");
   
       
    return petsDao.deletePets(pets);
  }
 
}