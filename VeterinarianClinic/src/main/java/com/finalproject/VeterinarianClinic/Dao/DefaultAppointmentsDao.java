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
import com.finalproject.VeterinarianClinic.entities.Appointments;
import com.finalproject.VeterinarianClinic.entities.Clients;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j

public class DefaultAppointmentsDao implements AppointmentsDao{
  @Autowired
  private  NamedParameterJdbcTemplate jdbcTemplate;
   public List<Appointments> getAppointments(){
     log.debug("DefaultAppointmentsDao -> getAppointments() method called");
     final String sql = "SELECT * FROM appointments";
     
     List<Appointments> appointments = jdbcTemplate.query(sql, new RowMapper<Appointments>() {
       public Appointments mapRow(ResultSet rs, int rowNum) throws SQLException {
         return Appointments.builder()
             .appointmentId(rs.getInt("id"))
             .petId(rs.getInt("pet_id"))
             .scheduledAppt(rs.getString("scheduled_appt"))
             .build();
       }
     });
     return appointments;
   }
   @Override
   public Appointments postAppointments(Appointments appointments) {
     //@formatter: off
    final String sql = ""
        + "INSERT "
        + "INTO appointments "
        + "(id,"
        + "pet_id,"
        + "scheduled_appt) VALUES "
        + "(:id,"
        + ":pet_id,"
        + ":scheduled_appt)";
         
     //formatter: on
     Map<String, Object> params = new HashMap<>();
     params.put("id", appointments.getAppointmentId());
     params.put("pet_id", appointments.getPetId());
     params.put("scheduled_appt", appointments.getScheduledAppt());
     

     
     jdbcTemplate.update(sql, params);
     return Appointments.builder()
         .appointmentId(appointments.getAppointmentId())
         .petId(appointments.getPetId())
         .scheduledAppt(appointments.getScheduledAppt())
         .build();
//     public Appointments postAppointments(Appointments appointments) {
//       // @formatter:off
//       String sql = ""
//           + "INSERT "
//           + "INTO appointments "
//           + "(id,"
//           + "pet_id,"
//           + "scheduled_appt) VALUES "
//           + "(:id,"
//           + ":pet_id,"
//           + ":scheduled_appt)";
//       // @formatter:on
//       Map<String, Object> params = new HashMap<>();
//      params.put("id", appointments.getId());
//      params.put("pet_id", appointments.getPetId());
//      params.put("scheduled_appt", appointments.getScheduledAppt());
//       jdbcTemplate.update(sql, params);
//       return Appointments.builder()
//           .id(appointments.getId())
//           .petId(appointments.getPetId())
//           .scheduledAppt(appointments.getScheduledAppt())
//           .build();
//     }
         
   }
   public Appointments updateAppointments(Appointments appointments) {
     //@formatter: off
     final String sql = ""
         + "UPDATE "
         + "appointments "
         + "SET "
         + "scheduled_appt = :scheduled_appt "
         + "WHERE pet_id = :pet_id AND id = :id ";
     
     //@formatter:on
     Map<String, Object> params = new HashMap<>();
     params.put("id", appointments.getAppointmentId());
     params.put("pet_id", appointments.getPetId());
     params.put("scheduled_appt", appointments.getScheduledAppt());
     
     jdbcTemplate.update(sql, params);
     return Appointments.builder()
         .appointmentId(appointments.getAppointmentId())
         .petId(appointments.getPetId())
         .scheduledAppt(appointments.getScheduledAppt())
         .build();
     
   }
   @Override
   public Appointments deleteAppointments(Appointments appointments) {
     //@formatter:off
     final String sql = ""
         + "DELETE "
         + "FROM clients "
         + "WHERE id = :id";
     
    
     
     //formatter:on
     Map<String, Object> params = new HashMap<>();
     params.put("id", appointments.getAppointmentId());
     
     jdbcTemplate.update(sql, params);
     return Appointments.builder()
         .appointmentId(appointments.getAppointmentId())
         .petId(appointments.getPetId())
         .scheduledAppt(appointments.getScheduledAppt())
         .build();
         
   }
   
  
  

}
