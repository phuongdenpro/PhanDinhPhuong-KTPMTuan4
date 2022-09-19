package com.example.springbootdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "maybay")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MayBay implements Serializable {
    @Id
    @Column(name = "MaMB")
    private int maMB;

    @Column(name = "Loai")
    private String loai;

    @Column(name = "TamBay")
    private int tamBay;


}