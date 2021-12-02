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
import com.finalproject.VeterinarianClinic.entities.Services;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j

public class DefaultServicesDao implements ServicesDao {
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

   public List<Services> getServices() {
     log.debug("DefaultServicesDao -> getServices() method called");
     
     final String sql = "SELECT * FROM services";
         
       List<Services> getServices = jdbcTemplate.query(sql, new RowMapper<Services>() {

      
         public Services mapRow(ResultSet rs, int rowNum) throws SQLException {
           
          return Services.builder()
               .serviceId(rs.getInt("id"))
               .petId(rs.getInt("pet_id"))
               .apptType(rs.getString("appt_type"))
               .description(rs.getString("description"))
               .build();
                  
         }
         
       });
     
     return getServices;
   }
   
   
   public Services postServices(Services services) {
     // @formatter:off
     String sql = "" 
         + "INSERT " 
         + "INTO services "
         + "(id, "
         + "pet_id, "
         + "appt_type, "
         + "description) VALUES "
         + "(:id, "
         + ":pet_id, "
         + ":appt_type, "
         + ":description) ";
     // @formatter:on
    
     Map<String, Object> params = new HashMap<>();
  
    params.put("id", services.getServiceId());         
     
    params.put("pet_id", services.getPetId());
    
    params.put("appt_type", services.getApptType());
     
    params.put("description", services.getDescription());
    
     jdbcTemplate.update(sql, params);
     return Services.builder()
         .serviceId(services.getServiceId())
         .petId(services.getPetId())
         .apptType(services.getApptType())
         .description(services.getDescription())        
         .build();
   }
     
   @Override
   public Services updateServices(Services services) {
     // @formatter:off
     String sql = "" 
         + "UPDATE " 
         + "services "        
         + "SET "
         + "description = :description, "
         + "appt_type = :appt_type "
         + "WHERE pet_id = :pet_id AND id = :id ";
        
     // @formatter:on
    
     Map<String, Object> params = new HashMap<>();
  
    params.put("id", services.getServiceId());         
     
    params.put("pet_id", services.getPetId());
    
    params.put("appt_type", services.getApptType());
    
    params.put("description", services.getDescription());
     
       
     jdbcTemplate.update(sql, params);
     return Services.builder()
         .serviceId(services.getServiceId())
         .petId(services.getPetId())
         .apptType(services.getApptType())
         .description(services.getDescription())
         .build();
   }
   
   
   public Services deleteServices(Services services) {
     // @formatter:off
     String sql = "" 
         + "DELETE " 
         + "FROM services "
         + "WHERE id = :id";
         
     // @formatter:on
    
     Map<String, Object> params = new HashMap<>();
  
    params.put("id", services.getServiceId());         
     
   
       
     jdbcTemplate.update(sql, params);
     return Services.builder()
         .serviceId(services.getServiceId())
         .petId(services.getPetId())
         .apptType(services.getApptType())
         .description(services.getDescription())
         .build();
   }
     
   
   

    

}
