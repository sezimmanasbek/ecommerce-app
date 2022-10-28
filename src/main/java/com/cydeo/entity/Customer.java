package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
public class Customer extends BaseEntity{

    private String email;
    private String firstName;
    private String lastName;
    private String userName;

}
