package com.finalproject.VeterinarianClinic.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.finalproject.VeterinarianClinic.Dao.BillingDao;
import com.finalproject.VeterinarianClinic.entities.Billing;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class DefaultBillingService implements BillingService {
  @Autowired
  BillingDao billingDao;
  
  @Transactional
  @Override
  
  public List<Billing> getBilling() {
   log.debug("DefaultBillingService -> getBilling() method called");
   
     List<Billing> billing = billingDao.getBilling();
    
    return billing;
  }

  @Transactional
  @Override
  
  public Billing postBilling(Billing billing) {
   log.debug("DefaultBillingService -> postBilling() method called");
   
       
    return billingDao.postBilling(billing);
  }
  
  @Transactional
  @Override
  
  public Billing updateBilling(Billing billing) {
   log.debug("DefaultBillingService -> postBilling() method called");
   
       
    return billingDao.updateBilling(billing);
  }
  
  @Transactional
  @Override
  
  public Billing deleteBilling(Billing billing) {
   log.debug("DefaultBillingService -> deleteBilling() method called");
   
       
    return billingDao.deleteBilling(billing);
  }

}
