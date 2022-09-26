package com.example.springbootdatajpa.service;

import com.example.springbootdatajpa.entity.NhanVien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements NhanVienService {
    @Override
    public List<NhanVien> findEmployeeByLuong(long luong) {
        return null;
    }
}
