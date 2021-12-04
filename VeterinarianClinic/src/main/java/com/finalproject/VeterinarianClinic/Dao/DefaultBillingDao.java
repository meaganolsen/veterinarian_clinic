package com.finalproject.VeterinarianClinic.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.finalproject.VeterinarianClinic.entities.Billing;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultBillingDao implements BillingDao {
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
@Override
  public List<Billing> getBilling() {
     log.debug("DefaultBillingDao -> getBilling() method called");
     
     final String sql = "SELECT * FROM billing";
         
       List<Billing> getBilling = jdbcTemplate.query(sql, new RowMapper<Billing>() {

      
         public Billing mapRow(ResultSet rs, int rowNum) throws SQLException {
           
          return Billing.builder()
               .appointmentId(rs.getInt("appointment_id"))
               .clientId(rs.getInt("client_id"))
               .petId(rs.getInt("pet_id"))
               .balanceDue(rs.getBigDecimal("balance_due"))
               .build();
                  
         }
         
       });
     
     return getBilling;
   }

   @Override
   public Billing postBilling(Billing billing) {
     // @formatter:off
     String sql = "" 
         + "INSERT " 
         + "INTO billing "
         + "(client_id, "
         + "pet_id, "
         + "balance_due) VALUES "
         + "(:client_id, "
         + ":pet_id, "
         + ":balance_due) ";
     // @formatter:on
    
     Map<String, Object> params = new HashMap<>();
        
    params.put("client_id", billing.getClientId());
    
    params.put("pet_id", billing.getPetId());
     
    params.put("balance_due", billing.getBalanceDue());
    
     jdbcTemplate.update(sql, params);
     return Billing.builder()
         .clientId(billing.getClientId())
         .petId(billing.getPetId())
         .balanceDue(billing.getBalanceDue())        
         .build();
   }
     
   @Override
   public Billing updateBilling(Billing billing) {
     // @formatter:off
     String sql = "" 
         + "UPDATE " 
         + "billing "        
         + "SET "
         + "client_id = :client_id, "
         + "balance_due = :balance_due "
         + "WHERE appointment_id = :appointment_id AND pet_id = :pet_id ";
        
     // @formatter:on
    
     Map<String, Object> params = new HashMap<>();
 
    params.put("appointment_id", billing.getAppointmentId());         
     
    params.put("client_id", billing.getClientId());
    
    params.put("pet_id", billing.getPetId());
    
    params.put("balance_due", billing.getBalanceDue());
     
       
     jdbcTemplate.update(sql, params);
     return Billing.builder()
         .appointmentId(billing.getAppointmentId())
         .clientId(billing.getClientId())
         .petId(billing.getPetId())
         .balanceDue(billing.getBalanceDue())
         .build();
   }
   
   @Override
   public Billing deleteBilling(Billing billing) {
     // @formatter:off
     String sql = "" 
         + "DELETE " 
         + "FROM billing "
         + "WHERE pet_id = :pet_id ";
         
     // @formatter:on
    
     Map<String, Object> params = new HashMap<>();
  
    params.put("appointment_id", billing.getAppointmentId()); 
    params.put("client_id", billing.getClientId());
    params.put("pet_id", billing.getPetId());
    params.put("balance_due", billing.getBalanceDue());
     
          
     jdbcTemplate.update(sql, params);
     return Billing.builder()
         .appointmentId(billing.getAppointmentId())
         .clientId(billing.getClientId())
         .petId(billing.getPetId())
         .balanceDue(billing.getBalanceDue())
         .build();
   }
     
   
   

}
