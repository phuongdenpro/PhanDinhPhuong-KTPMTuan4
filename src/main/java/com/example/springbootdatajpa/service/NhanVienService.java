package com.example.springbootdatajpa.service;

import com.example.springbootdatajpa.entity.NhanVien;

import java.util.List;

public interface NhanVienService {
    List<NhanVien> findEmployeeByLuong(long luong);

}
