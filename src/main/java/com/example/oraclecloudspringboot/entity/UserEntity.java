package com.example.oraclecloudspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "USERS")
public class UserEntity {

    @Id @GeneratedValue
    Long id;
    String name;
}
