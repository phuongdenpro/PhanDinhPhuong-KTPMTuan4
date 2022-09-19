package com.example.springbootdatajpa.repository;

import com.example.springbootdatajpa.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien,Long> {
    List<NhanVien> findEmployeeByLuong(long luong);
}
