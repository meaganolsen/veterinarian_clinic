package com.finalproject.VeterinarianClinic.Dao;

import java.util.List;
import com.finalproject.VeterinarianClinic.entities.Billing;

public interface BillingDao {
List<Billing> getBilling();
  
  Billing postBilling(Billing billing);
  
  Billing updateBilling(Billing billing);
  
  Billing deleteBilling(Billing billing);

}
