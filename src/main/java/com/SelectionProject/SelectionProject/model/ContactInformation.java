package com.SelectionProject.SelectionProject.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
public class ContactInformation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int aptUnd;
    @NotNull
    private String streetNumber;
    @NotNull
    private String streetName;
    @NotNull
    private String city;
    @NotNull
    private String province;
    @NotNull
    private String country;
    private String postalCode;
    private String typeTelephone;
    @NotNull
    private String telephoneNumber;
    @NotNull
    @Email
    private String email;
}
