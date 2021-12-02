package com.finalproject.VeterinarianClinic.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.finalproject.VeterinarianClinic.Service.BillingService;
import com.finalproject.VeterinarianClinic.entities.Billing;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultBillingController implements BillingController {
  @Autowired
  private BillingService service;
  
 
  public List<Billing> getBilling() {
    log.debug("DefaultBillingController -> getBilling() method called");

    
    return service.getBilling();
  }
  
   
 @Override
  public Billing postBilling(Billing billing) {
    log.debug("DefaultBillingController -> postBilling() method called");

    
    return service.postBilling(billing);
   }
 
 @Override
 public Billing updateBilling(Billing billing) {
     log.debug("DefaultBillingController -> updateBilling() method called");

   
   return service.updateBilling(billing);

 }
 
 @Override
 public Billing deleteBilling(Billing billing) {
     log.debug("DefaultBillingController -> deleteBilling() method called");

   
   return service.deleteBilling(billing);

 }

}
