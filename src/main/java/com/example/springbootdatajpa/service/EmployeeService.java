package com.example.springbootdatajpa.service;

import com.example.springbootdatajpa.entity.NhanVien;

import java.util.List;

public interface EmployeeService {
    List<NhanVien> findEmployeeByLuong(long luong);

}
