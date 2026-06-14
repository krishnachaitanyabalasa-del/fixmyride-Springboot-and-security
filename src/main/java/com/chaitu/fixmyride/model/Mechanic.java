package com.chaitu.fixmyride.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mechanics")
@Data
public class Mechanic {
    @Id
    private String username;
    private String phone_number;
    private String skills;
    private String email;
    private String password;

    private int experience_years;
    private double rating;
    @Column(name = "availability_status")
    private boolean availabilityStatus;
    private long base_location_lat;
    private long base_location_long;
    private String address;
    private int service_radius_km;
    private String role;
    private String status;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
