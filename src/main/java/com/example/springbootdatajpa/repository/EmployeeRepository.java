package com.example.springbootdatajpa.repository;

import com.example.springbootdatajpa.entity.Nhanvien;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Nhanvien,Long> {
    List<Nhanvien> findEmployeeByLuong(long luong);
}
