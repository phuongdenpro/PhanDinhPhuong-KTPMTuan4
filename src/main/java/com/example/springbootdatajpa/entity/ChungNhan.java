package com.example.springbootdatajpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@IdClass(ChungNhanPK.class)
public class ChungNhan implements Serializable {
    @Id
    @JoinColumn(name = "MaNV")
    @ManyToOne(fetch = FetchType.EAGER)
    private NhanVien MaNV;

    @Id
    @JoinColumn(name = "MaMB")
    @ManyToOne(fetch = FetchType.LAZY)
    private MayBay MaMB;

    public ChungNhan() {
    }

    public ChungNhan(MayBay mayBay, NhanVien nhanVien) {
        this.MaMB = mayBay;
        this.MaNV = nhanVien;
    }
}