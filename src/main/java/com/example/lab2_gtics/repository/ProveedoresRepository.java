package com.example.lab2_gtics.repository;


import com.example.lab2_gtics.entity.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedoresRepository extends JpaRepository<Proveedores,Integer> {
}
