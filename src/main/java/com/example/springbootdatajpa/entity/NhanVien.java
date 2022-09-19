package com.example.springbootdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue
    private long MaNV;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "Luong")
    private long luong;
}
