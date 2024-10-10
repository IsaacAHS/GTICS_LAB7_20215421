package com.example.lab7.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="users")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="roleId")
    private Rol rol;

    @Column(nullable= true)
    private String name;

    @Column(nullable= false)
    private String email;

    @Column(nullable= false)
    private String password;



}
