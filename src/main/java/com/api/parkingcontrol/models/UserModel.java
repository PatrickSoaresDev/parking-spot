package com.api.parkingcontrol.models;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ta_user")
public class UserModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    public LocalDateTime getRegistrationData() {
        return registrationData;
    }

    @Column(nullable = false)
    private LocalDateTime registrationData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setRegistrationData(LocalDateTime registrationData) {
        this.registrationData = registrationData;
    }
}
