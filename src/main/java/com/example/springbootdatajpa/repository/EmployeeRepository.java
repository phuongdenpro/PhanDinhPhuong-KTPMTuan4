package com.example.springbootdatajpa.repository;

import com.example.springbootdatajpa.entity.NhanVien;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<NhanVien,Long> {
    List<NhanVien> findEmployeeByLuong(long luong);
}
