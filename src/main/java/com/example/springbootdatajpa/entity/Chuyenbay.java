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
import java.util.Date;

@Entity
@Table(name = "chuyenbay")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chuyenbay implements Serializable {
    @Id
    @Column(name="MaCB")
    private String maCB;

    @Column(name="GaDi")
    private String gaDi;

    @Column(name="GaDen")
    private String gaDen;

    @Column(name="DoDai")
    private int doDai;

    @Column(name="GioDi")
    private Date gioDi;

    @Column(name="GioDen")
    private Date gioDen;

    @Column(name="ChiPhi")
    private int chiPhi;


}