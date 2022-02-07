package com.sha.springbootdeviceseller.model;
import com.sha.springbootdeviceseller.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users") //cannot use "user" since its a reserved word in postgresql.
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",unique = true,nullable = false,length = 1000)
    private String username;

    @Column(name= "password",nullable = false,length = 100)
    private String password;

    @Column(name= "name",nullable = false,length = 100)
    private String name;

    @Column(name = "create_Time",nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "role",nullable = false)
    private Role role;

    @Transient
    private String token;

}
