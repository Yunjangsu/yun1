package com.mysite.jangsu.user;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@jakarta.persistence.Entity
public class SiteUser {

    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @jakarta.persistence.Column(unique = true)
    private String username;

    private String password;

    @jakarta.persistence.Column(unique = true)
    private String email;
}