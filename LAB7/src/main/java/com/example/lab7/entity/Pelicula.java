package com.example.lab7.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@Table(name="movies")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name= "title",nullable= false)
    private String nombre;

    @Column(name= "description",nullable= true)
    private String descripcion;

    @Column(name= "duration",nullable= false)
    private Integer duracion;

    @Column(name= "releaseDate",nullable= true)
    private LocalDateTime fecha;
}
