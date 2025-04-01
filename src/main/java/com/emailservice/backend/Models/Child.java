package com.emailservice.backend.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "child")
@Getter
@Setter
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idchild;
    private String name;
    private int age;
}
