package com.example.lab7.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="movieprojections")
public class ProyeccionPelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="movieId")
    private Pelicula pelicula;

    @ManyToOne
    @JoinColumn(name="roomId")
    private Sala sala;

    @Column(name= "projectionDate",nullable= false)
    private LocalDateTime fecha;

    @Column(name= "availableSeats",nullable= true)
    private Integer sitioslibres;


}
