package com.example.springbootdatajpa.service;

import com.example.springbootdatajpa.entity.Nhanvien;

import java.util.List;

public interface EmployeeService {
    List<Nhanvien> findEmployeeByLuong(long luong);

}
