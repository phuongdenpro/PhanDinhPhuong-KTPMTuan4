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
public class Nhanvien {
    @Id
    @GeneratedValue
    private long EmployeeId;
    @Column(name = "ten_nhanvien")
    private String ten;
    @Column(name = "luong")
    private long luong;
}
