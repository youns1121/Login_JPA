package com.Spring.LoginJpa.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter

public class CreateMember {

    @Id
    @GeneratedValue
    private Long id;
    private String userId;
    private String password;
    private String userName;
    private String role;

    @Builder
    public CreateMember(Long id, String userId, String password, String userName, String role) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.userName = userName;
        this.role = role;
    }
}
