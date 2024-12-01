package com.example.coffeeshopmanagement.respository;

import com.example.coffeeshopmanagement.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer> {
    Staff findByName(String name);
    ;
}
