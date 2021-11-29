package com.finalproject.VeterinarianClinic.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.finalproject.VeterinarianClinic.entities.AppointmentServices;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j

public class DefaultAppointmentServicesDao implements AppointmentServicesDao {
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
   public List<AppointmentServices> getAppointmentServices(){
     log.debug("DefaultAppointmentServicesDao -> getAppointmentServices() method called");
     final String sql = "SELECT * FROM appointment_services";
     
     List<AppointmentServices> appointmentServices = jdbcTemplate.query(sql, new RowMapper<AppointmentServices>() {
       public AppointmentServices mapRow(ResultSet rs, int rowNum) throws SQLException{
         return AppointmentServices.builder()
             .appointmentId(rs.getInt("id"))
             .serviceId(rs.getInt("pet_id"))
             .build();
       }
     });
     return appointmentServices;
   }

}
