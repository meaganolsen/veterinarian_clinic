package com.finalproject.VeterinarianClinic.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.finalproject.VeterinarianClinic.Service.PetsService;
import com.finalproject.VeterinarianClinic.entities.Pets;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultPetsController implements PetsController {
  
  
    @Autowired
    private PetsService service;
    
    public List<Pets> getPets() {
      log.debug("DefaultPetsController -> getPets() method called");
      return service.getPets();
    }
   
    @Override 
    public Pets postPets(Pets pets) {
      log.debug("DefaultPetsController -> postPets() method called");

      
      return service.postPets(pets);
  }
    
    @Override
    public Pets updatePets(Pets pets) {
        log.debug("DefaultPetsController -> updatePets() method called");

      
      return service.updatePets(pets);
   
    }
    
    @Override
    public Pets deletePets(Pets pets) {
        log.debug("DefaultPetsController -> deletePets() method called");

      
      return service.deletePets(pets);
   
    }
  }





  

